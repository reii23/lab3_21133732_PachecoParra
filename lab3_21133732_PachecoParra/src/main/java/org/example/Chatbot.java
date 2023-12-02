package org.example;

import java.util.List;

public class Chatbot implements InterfaceChabot {
    private int chatbotID;
    private String name;
    private String welcomeMessage;
    private int startFlowId;
    private List<Flow> flows;

    // RFN4: TDA Chatbot - constructor - chatbot
    public Chatbot(int chatbotID, String name, String welcomeMessage, int startFlowId, List<Flow> flows) {
        this.chatbotID = chatbotID;
        this.name = name;
        this.welcomeMessage = welcomeMessage;
        this.startFlowId = startFlowId;
        this.flows = flows;
    }

    public int getChatbotID() {
        return chatbotID;
    }

    public String getName() {
        return name;
    }

    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public int getStartFlowId() {
        return startFlowId;
    }

    public List<Flow> getFlows() {
        return flows;
    }

    // RFN5: TDA Chatbot - modificador - chatbotAddFlow
    public void chatbotAddFlow(Flow flow) {
        if (!this.flows.contains(flow)) {
            this.flows.add(flow);
        }
    }
}
