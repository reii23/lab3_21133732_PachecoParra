package org.example;

import java.util.List;

/**
 * Clase que representa un chatbot en un sistema de chatbots
 * Proporciona atributos como un id, un nombre, un mensaje de bienvenida, un enlace al flujo inicial y una lista de flujos.
 */
    public class Chatbot_21133732_PachecoParra implements InterfaceChatbot_21133732_PachecoParra {
        private int chatbotID;
        private String name;
        private String welcomeMessage;
        private int startFlowId;
        private List<Flow_21133732_PachecoParra> flows;

        // RFN4: TDA Chatbot - constructor - chatbot
        /**
         * Construye una nueva instancia de Chatbot_21133732_PachecoParra
         *
         * @param chatbotID    el id del chatbot
         * @param name        el nombre del chatbot
         * @param welcomeMessage el mensaje de bienvenida del chatbot
         * @param startFlowId el id del flujo inicial del chatbot
         * @param flows      una lista de flujos asociados con el chatbot
         */
        public Chatbot_21133732_PachecoParra(int chatbotID, String name, String welcomeMessage, int startFlowId, List<Flow_21133732_PachecoParra> flows) {
            this.chatbotID = chatbotID;
            this.name = name;
            this.welcomeMessage = welcomeMessage;
            this.startFlowId = startFlowId;
            this.flows = flows;
        }

        /**
         * Devuelve el id del chatbot.
         *
         * @return el id del chatbot
         */
        public int getChatbotID() {
            return chatbotID;
        }

        /**
         * Devuelve el nombre del chatbot.
         *
         * @return el nombre del chatbot
         */
        public String getName() {
            return name;
        }

        /**
         * Devuelve el mensaje de bienvenida del chatbot.
         *
         * @return el mensaje de bienvenida del chatbot
         */
        public String getWelcomeMessage() {
            return welcomeMessage;
        }

        /**
         * Devuelve el id del flujo inicial del chatbot.
         *
         * @return el id del flujo inicial del chatbot
         */
        public int getStartFlowId() {
            return startFlowId;
        }

        /**
         * Devuelve la lista de flujos del chatbot.
         *
         * @return la lista de flujos del chatbot
         */
        public List<Flow_21133732_PachecoParra> getFlows() {
            return flows;
        }

        // RFN5: TDA Chatbot - modificador - chatbotAddFlow
        /**
         * Agrega un flujo a la lista de flujos del chatbot.
         *
         * @param flow el flujo a agregar
         */
        public void chatbotAddFlow(Flow_21133732_PachecoParra flow) {
            if (!this.flows.contains(flow)) {
                this.flows.add(flow);
            }
        }

        /**
        * Devuelve una representación String del chatbot.
        *
        * @return una representación de cadena de la opción
        */
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


