package org.example;

import java.util.List;

// Chatbot_21133732_PachecoParra.java
    public class Chatbot_21133732_PachecoParra implements InterfaceChatbot_21133732_PachecoParra {
        private int chatbotID;
        private String name;
        private String welcomeMessage;
        private int startFlowId;
        private List<Flow_21133732_PachecoParra> flows;

        // RFN4: TDA Chatbot - constructor - chatbot
        public Chatbot_21133732_PachecoParra(int chatbotID, String name, String welcomeMessage, int startFlowId, List<Flow_21133732_PachecoParra> flows) {
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

        public List<Flow_21133732_PachecoParra> getFlows() {
            return flows;
        }

        // RFN5: TDA Chatbot - modificador - chatbotAddFlow
        public void chatbotAddFlow(Flow_21133732_PachecoParra flow) {
            if (!this.flows.contains(flow)) {
                this.flows.add(flow);
            }
        }

        @Override
        public String toString() {
            return "Chatbot{" +
                    "chatbotID=" + chatbotID +
                    ", name='" + name + '\'' +
                    ", welcomeMessage='" + welcomeMessage + '\'' +
                    ", startFlowId=" + startFlowId +
                    ", flows=" + flows +
                    '}';
        }
    }


