package org.example;

import java.util.List;

/**
 * Clase que representa una opción de un flujo en un sistema de chatbots
 * Proporciona atributos como un código de opción, un mensaje, enlaces a códigos de chatbot y flujos iniciales, así como una lista de palabras clave asociadas.
 */

public class Option_21133732_PachecoParra {
    private int code;
    private String message;
    private int chatbotCodeLink;
    private int initialFlowCodeLink;
    private List<String> keywords;

    // RFN1: TDA Option - constructor - option
    /**
     * Construye una nueva instancia de Option_21133732_PachecoParra
     *
     * @param code                el código de la opción
     * @param message             el mensaje asociado con la opción
     * @param chatbotCodeLink     un enlace al código del chatbot correspondiente
     * @param initialFlowCodeLink un enlace al código del flujo inicial correspondiente
     * @param keywords            una lista de palabras clave asociadas con la opción
     */

    public Option_21133732_PachecoParra(int code, String message, int chatbotCodeLink, int initialFlowCodeLink, List<String> keywords) {
        this.code = code;
        this.message = message;
        this.chatbotCodeLink = chatbotCodeLink;
        this.initialFlowCodeLink = initialFlowCodeLink;
        this.keywords = keywords;
    }

    /**
     * Devuelve el código de la opción.
     *
     * @return el código de la opción
     */
    public int getCode() {
        return code;
    }

    /**
     * Devuelve el mensaje asociado con la opción.
     *
     * @return el mensaje asociado con la opción
     */

    public String getMessage() {
        return message;
    }

    /**
     * Devuelve el enlace al código del chatbot correspondiente.
     *
     * @return enlace al código del chatbot correspondiente
     */

    public int getChatbotCodeLink() {
        return chatbotCodeLink;
    }

    /**
     * Devuelve el enlace al código del flujo inicial correspondiente.
     *
     * @return enlace al código del flujo inicial correspondiente
     */

    public int getInitialFlowCodeLink() {
        return initialFlowCodeLink;
    }

    /**
     * Devuelve una lista de palabras clave asociadas con la opción.
     *
     * @return una lista de palabras clave asociadas con la opción
     */
    public List<String> getKeywords() {
        return keywords;
    }

    /**
     * Devuelve una representación String de la opción.
     *
     * @return una representación de cadena de la opción
     */

    @Override
    public String toString() {
        return "Option{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", chatbotCodeLink=" + chatbotCodeLink +
                ", initialFlowCodeLink=" + initialFlowCodeLink +
                ", keywords=" + keywords +
                '}';
    }
}
