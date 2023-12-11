package org.example;

import java.util.List;

/**
 * Clase que representa un flujo en un sistema de chatbots
 * Proporciona atributos como un identificador, un mensaje y una lista de opciones.
 */
public class Flow_21133732_PachecoParra implements InterfaceFlow_21133732_PachecoParra {
    private int id;
    private String nameMsg;
    private List<Option_21133732_PachecoParra> options;

    // RFN2: TDA Flow - constructor - flow
    /**
     * Construye una nueva instancia de Flow_21133732_PachecoParra
     *
     * @param id       el identificador del flujo
     * @param nameMsg  el mensaje asociado con el flujo
     * @param options  una lista de opciones asociadas con el flujo
     */

    public Flow_21133732_PachecoParra(int id, String nameMsg, List<Option_21133732_PachecoParra> options) {
        this.id = id;
        this.nameMsg = nameMsg;
        this.options = options;
    }

    /**
     * Devuelve el id del flujo.
     *
     * @return el id del flujo
     */

    public int getId() {
        return id;
    }

    /**
     * Devuelve el mensaje asociado con el flujo.
     *
     * @return el mensaje asociado con el flujo
     */
    public String getNameMsg() {
        return nameMsg;
    }

    /**
     * Devuelve la lista de opciones asociadas con el flujo.
     *
     * @return la lista de opciones asociadas con el flujo
     */
    public List<Option_21133732_PachecoParra> getOptions() {
        return options;
    }

    // RFN 3: TDA Flow - modificador - flowAddOption
    /**
     * Agrega una opción a la lista de opciones asociadas con el flujo.
     *
     * @param option la opción a agregar
     */
    public void flowAddOption(Option_21133732_PachecoParra option) {
        if (!this.options.contains(option)) {
            this.options.add(option);
        }
    }

    /**
     * Devuelve una representación Sring  del flujo.
     *
     * @return una representación en String del flujo
     */
    @Override
    public String toString() {
        return "Flow{" +
                "id=" + id +
                ", nameMsg='" + nameMsg + '\'' +
                ", options=" + options +
                '}';
    }
}


