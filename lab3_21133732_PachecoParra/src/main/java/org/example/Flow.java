package org.example;

import java.util.List;

public class Flow {

    // Los flujos quedan identificados por un ID único. Su unicidad se verifica al momento de agregarlo a un chatbot a fin de evitar duplicidad.
    //Se debe verificar que las opciones añadidas no se repitan en base al id de éstos.
    // id (int) X name-msg (String)  X Option  (Lista de 0 o más opciones)

    private int id;
    private String nameMsg;
    private List<Option> options;

    public Flow(int id, String nameMsg, List<Option> options) {
        this.id = id;
        this.nameMsg = nameMsg;
        this.options = options;
    }

    public int getId() {
        return id;
    }

    public String getNameMsg() {
        return nameMsg;
    }

    public List<Option> getOptions() {
        return options;
    }

    // flowAddOption
    // El método también verifica que las opciones añadidas no se repitan en base al id de éstos.
    //Es irrelevante cómo lo agrega, puede ser al principio, final, o en cierta posición, no es relevante para este laboratorio.
    // dom: option

    public void flowAddOption(Option option) {
        if (!this.options.contains(option)) {
            this.options.add(option);
        }
    }
}

