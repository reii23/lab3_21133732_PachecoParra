package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main_21133732_PachecoParra {
    public static void main(String[] args) {

        // CARGA DE DATOS
        // Chatbot 0
        List<Option_21133732_PachecoParra> optionsChatbot0 = new ArrayList<>();
        optionsChatbot0.add(new Option_21133732_PachecoParra(1, "1) Viajar", 0, 2, new ArrayList<>(List.of("viajar", "turistear", "conocer"))));
        optionsChatbot0.add(new Option_21133732_PachecoParra(2, "2) Estudiar", 0, 3, new ArrayList<>(List.of("estudiar", "aprender", "perfeccionarme"))));
        Flow_21133732_PachecoParra flowChatbot0 = new Flow_21133732_PachecoParra(1, "Flujo Principal Chatbot 0\nBienvenido\n¿Qué te gustaría hacer?", optionsChatbot0);

        // Definir Flujos adicionales para Chatbot 0
        List<Option_21133732_PachecoParra> optionsFlow2 = new ArrayList<>();
        // Ejemplo de opciones para el flujo 2
        optionsFlow2.add(new Option_21133732_PachecoParra(1, "Opción 1 del Flujo 2", 0, 1, new ArrayList<>(List.of("keyword1", "keyword2"))));
        Flow_21133732_PachecoParra flow2 = new Flow_21133732_PachecoParra(2, "Descripción del Flujo 2", optionsFlow2);

        List<Option_21133732_PachecoParra> optionsFlow3 = new ArrayList<>();
        // Ejemplo de opciones para el flujo 3
        optionsFlow3.add(new Option_21133732_PachecoParra(1, "Opción 1 del Flujo 3", 0, 1, new ArrayList<>(List.of("keyword3", "keyword4"))));
        Flow_21133732_PachecoParra flow3 = new Flow_21133732_PachecoParra(3, "Descripción del Flujo 3", optionsFlow3);

        List<Flow_21133732_PachecoParra> flowsChatbot0 = new ArrayList<>();
        flowsChatbot0.add(flowChatbot0);
        flowsChatbot0.add(flow2);
        flowsChatbot0.add(flow3);

        Chatbot_21133732_PachecoParra chatbot0 = new Chatbot_21133732_PachecoParra(0, "Inicial", "Bienvenido\n¿Qué te gustaría hacer?", 1, flowsChatbot0);

        // Definición de Chatbot 1 y Chatbot 2
        // Chatbot 1
        List<Option_21133732_PachecoParra> optionsChatbot1 = new ArrayList<>();
        optionsChatbot1.add(new Option_21133732_PachecoParra(1, "1) Viajar", 0, 2, new ArrayList<>(List.of("viajar", "turistear", "conocer"))));
        optionsChatbot1.add(new Option_21133732_PachecoParra(2, "2) Estudiar", 0, 3, new ArrayList<>(List.of("estudiar", "aprender", "perfeccionarme"))));
        Flow_21133732_PachecoParra flowChatbot1 = new Flow_21133732_PachecoParra(1, "Flujo Principal Chatbot 1\nBienvenido\n¿Qué te gustaría hacer?", optionsChatbot1);

        // Definir Flujos adicionales para Chatbot 1
        List<Option_21133732_PachecoParra> optionsFlow2Chatbot1 = new ArrayList<>();
        // Ejemplo de opciones para el flujo 2
        optionsFlow2Chatbot1.add(new Option_21133732_PachecoParra(1, "Opción 1 del Flujo 2", 0, 1, new ArrayList<>(List.of("keyword1", "keyword2"))));
        Flow_21133732_PachecoParra flow2Chatbot1 = new Flow_21133732_PachecoParra(2, "Descripción del Flujo 2", optionsFlow2Chatbot1);

        List<Option_21133732_PachecoParra> optionsFlow3Chatbot1 = new ArrayList<>();
        // Ejemplo de opciones para el flujo 3
        optionsFlow3Chatbot1.add(new Option_21133732_PachecoParra(1, "Opción 1 del Flujo 3", 0, 1, new ArrayList<>(List.of("keyword3", "keyword4"))));
        Flow_21133732_PachecoParra flow3Chatbot1 = new Flow_21133732_PachecoParra(3, "Descripción del Flujo 3", optionsFlow3Chatbot1);

        List<Flow_21133732_PachecoParra> flowsChatbot1 = new ArrayList<>();
        flowsChatbot1.add(flowChatbot1);
        flowsChatbot1.add(flow2Chatbot1);
        flowsChatbot1.add(flow3Chatbot1);

        Chatbot_21133732_PachecoParra chatbot1 = new Chatbot_21133732_PachecoParra(1, "Inicial", "Bienvenido\n¿Qué te gustaría hacer?", 1, flowsChatbot1);

        // Chatbot 2
        List<Option_21133732_PachecoParra> optionsChatbot2 = new ArrayList<>();
        optionsChatbot2.add(new Option_21133732_PachecoParra(1, "1) Viajar", 0, 2, new ArrayList<>(List.of("viajar", "turistear", "conocer"))));
        optionsChatbot2.add(new Option_21133732_PachecoParra(2, "2) Estudiar", 0, 3, new ArrayList<>(List.of("estudiar", "aprender", "perfeccionarme"))));
        Flow_21133732_PachecoParra flowChatbot2 = new Flow_21133732_PachecoParra(1, "Flujo Principal Chatbot 2\nBienvenido\n¿Qué te gustaría hacer?", optionsChatbot2);

        // Definir Flujos adicionales para Chatbot 2
        List<Option_21133732_PachecoParra> optionsFlow2Chatbot2 = new ArrayList<>();
        // Ejemplo de opciones para el flujo 2
        optionsFlow2Chatbot2.add(new Option_21133732_PachecoParra(1, "Opción 1 del Flujo 2", 0, 1, new ArrayList<>(List.of("keyword1", "keyword2"))));
        Flow_21133732_PachecoParra flow2Chatbot2 = new Flow_21133732_PachecoParra(2, "Descripción del Flujo 2", optionsFlow2Chatbot2);

        List<Option_21133732_PachecoParra> optionsFlow3Chatbot2 = new ArrayList<>();
        // Ejemplo de opciones para el flujo 3
        optionsFlow3Chatbot2.add(new Option_21133732_PachecoParra(1, "Opción 1 del Flujo 3", 0, 1, new ArrayList<>(List.of("keyword3", "keyword4"))));
        Flow_21133732_PachecoParra flow3Chatbot2 = new Flow_21133732_PachecoParra(3, "Descripción del Flujo 3", optionsFlow3Chatbot2);

        List<Flow_21133732_PachecoParra> flowsChatbot2 = new ArrayList<>();
        flowsChatbot2.add(flowChatbot2);
        flowsChatbot2.add(flow2Chatbot2);
        flowsChatbot2.add(flow3Chatbot2);

        Chatbot_21133732_PachecoParra chatbot2 = new Chatbot_21133732_PachecoParra(2, "Inicial", "Bienvenido\n¿Qué te gustaría hacer?", 1, flowsChatbot2);

        // Creación de Usuarios
        User_21133732_PachecoParra user1 = new User_21133732_PachecoParra("user1", true);
        User_21133732_PachecoParra user2 = new User_21133732_PachecoParra("user2", false);
        User_21133732_PachecoParra user3 = new User_21133732_PachecoParra("user3", true);
        List<User_21133732_PachecoParra> usuarios = new ArrayList<>();
        usuarios.add(user1);
        usuarios.add(user2);
        usuarios.add(user3);

        // Creación del sistema con los chatbots y usuarios
        Sistema_21133732_PachecoParra sistema = new Sistema_21133732_PachecoParra("Chatbots Paradigmas", 0, new ArrayList<>(List.of(chatbot0, chatbot1, chatbot2)), usuarios, user1, new ArrayList<>());

        // Sincronizar usuarios y ejecutar el menú principal
        Menu_21133732_PachecoParra.sincronizarUsuarios(sistema.getUsersRegistrados());
        Menu_21133732_PachecoParra.main(sistema);
    }
}