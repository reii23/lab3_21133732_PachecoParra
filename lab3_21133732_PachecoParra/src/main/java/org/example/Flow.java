package org.example;

import java.util.List;

public class Flow implements InterfaceFlow{
    private int id;
    private String nameMsg;
    private List<Option> options;

    // RFN2: TDA Flow - constructor - flow
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

    // RFN 3: TDA Flow - modificador - flowAddOption
    public void flowAddOption(Option option) {
        if (!this.options.contains(option)) {
            this.options.add(option);
        }
    }

    @Override
    public String toString() {
        return "Flow{" +
                "id=" + id +
                ", nameMsg='" + nameMsg + '\'' +
                ", options=" + options +
                '}';
    }
}


