package org.example;

import java.util.List;

public class Flow_21133732_PachecoParra implements InterfaceFlow_21133732_PachecoParra {
    private int id;
    private String nameMsg;
    private List<Option_21133732_PachecoParra> options;

    // RFN2: TDA Flow - constructor - flow
    public Flow_21133732_PachecoParra(int id, String nameMsg, List<Option_21133732_PachecoParra> options) {
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

    public List<Option_21133732_PachecoParra> getOptions() {
        return options;
    }

    // RFN 3: TDA Flow - modificador - flowAddOption
    public void flowAddOption(Option_21133732_PachecoParra option) {
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


