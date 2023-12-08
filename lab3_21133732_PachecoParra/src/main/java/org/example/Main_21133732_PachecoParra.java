package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main_21133732_PachecoParra {
    public static void main(String[] args) {

// CARGA DE DATOS
        // Chatbot 0
        List<Option_21133732_PachecoParra> optionsChatbot0 = new ArrayList<>();
        optionsChatbot0.add(new Option_21133732_PachecoParra(1, "1) Viajar", 1, 1, new ArrayList<>(List.of("viajar", "turistear", "conocer"))));
        optionsChatbot0.add(new Option_21133732_PachecoParra(2, "2) Estudiar", 2, 1, new ArrayList<>(List.of("estudiar", "aprender", "perfeccionarme"))));
        Flow_21133732_PachecoParra flowChatbot0 = new Flow_21133732_PachecoParra(1, "Flujo Principal Chatbot 1\nBienvenido\n¿Qué te gustaría hacer?", optionsChatbot0);
        List<Flow_21133732_PachecoParra> flowsChatbot0 = new ArrayList<>();
        flowsChatbot0.add(flowChatbot0);
        Chatbot_21133732_PachecoParra chatbot0 = new Chatbot_21133732_PachecoParra(0, "Inicial", "Bienvenido\n¿Qué te gustaría hacer?", 1, flowsChatbot0);

        // Chatbot 1
        List<Option_21133732_PachecoParra> optionsFlow1Chatbot1 = new ArrayList<>();
        optionsFlow1Chatbot1.add(new Option_21133732_PachecoParra(1, "1) New York, USA", 1, 2, new ArrayList<>(List.of("USA", "Estados Unidos", "New York"))));
        optionsFlow1Chatbot1.add(new Option_21133732_PachecoParra(2, "2) París, Francia", 1, 1, new ArrayList<>(List.of("Paris", "Eiffel"))));
        optionsFlow1Chatbot1.add(new Option_21133732_PachecoParra(3, "3) Torres del Paine, Chile", 1, 1, new ArrayList<>(List.of("Chile", "Torres", "Paine", "Torres Paine", "Torres del Paine"))));
        optionsFlow1Chatbot1.add(new Option_21133732_PachecoParra(4, "4) Volver", 0, 1, new ArrayList<>(List.of("Regresar", "Salir", "Volver"))));
        Flow_21133732_PachecoParra flow1Chatbot1 = new Flow_21133732_PachecoParra(1, "Flujo 1 Chatbot1\n¿Dónde te Gustaría ir?", optionsFlow1Chatbot1);

        List<Option_21133732_PachecoParra> optionsFlow2Chatbot1 = new ArrayList<>();
        optionsFlow2Chatbot1.add(new Option_21133732_PachecoParra(1, "1) Central Park", 1, 2, new ArrayList<>(List.of("Central", "Park", "Central Park"))));
        optionsFlow2Chatbot1.add(new Option_21133732_PachecoParra(2, "2) Museos", 1, 2, new ArrayList<>(List.of("Museo"))));
        optionsFlow2Chatbot1.add(new Option_21133732_PachecoParra(3, "3) Ningún otro atractivo", 1, 3, new ArrayList<>(List.of("Ninguno"))));
        optionsFlow2Chatbot1.add(new Option_21133732_PachecoParra(4, "4) Cambiar destino", 1, 1, new ArrayList<>(List.of("Cambiar", "Volver", "Salir"))));
        Flow_21133732_PachecoParra flow2Chatbot1 = new Flow_21133732_PachecoParra(2, "Flujo 2 Chatbot1\n¿Qué atractivos te gustaría visitar?", optionsFlow2Chatbot1);

        List<Option_21133732_PachecoParra> optionsFlow3Chatbot1 = new ArrayList<>();
        optionsFlow3Chatbot1.add(new Option_21133732_PachecoParra(1, "1) Solo", 1, 3, new ArrayList<>(List.of("Solo"))));
        optionsFlow3Chatbot1.add(new Option_21133732_PachecoParra(2, "2) En pareja", 1, 3, new ArrayList<>(List.of("Pareja"))));
        optionsFlow3Chatbot1.add(new Option_21133732_PachecoParra(3, "3) En familia", 1, 3, new ArrayList<>(List.of("Familia"))));
        optionsFlow3Chatbot1.add(new Option_21133732_PachecoParra(4, "4) Agregar más atractivos", 1, 2, new ArrayList<>(List.of("Volver", "Atractivos"))));
        optionsFlow3Chatbot1.add(new Option_21133732_PachecoParra(5, "5) En realidad quiero otro destino", 1, 1, new ArrayList<>(List.of("Cambiar destino"))));
        Flow_21133732_PachecoParra flow3Chatbot1 = new Flow_21133732_PachecoParra(3, "Flujo 3 Chatbot1\n¿Vas solo o acompañado?", optionsFlow3Chatbot1);

        List<Flow_21133732_PachecoParra> flowsChatbot1 = new ArrayList<>();
        flowsChatbot1.add(flow1Chatbot1);
        flowsChatbot1.add(flow2Chatbot1);
        flowsChatbot1.add(flow3Chatbot1);
        Chatbot_21133732_PachecoParra chatbot1 = new Chatbot_21133732_PachecoParra(1, "Agencia Viajes", "Bienvenido\n¿Dónde quieres viajar?", 1, flowsChatbot1);

        // Chatbot 2
        List<Option_21133732_PachecoParra> optionsChatbot2 = new ArrayList<>();
        optionsChatbot2.add(new Option_21133732_PachecoParra(1, "1) Carrera Técnica", 2, 1, new ArrayList<>(List.of("Técnica"))));
        optionsChatbot2.add(new Option_21133732_PachecoParra(2, "2) Postgrado", 2, 1, new ArrayList<>(List.of("Doctorado", "Magister", "Postgrado"))));
        optionsChatbot2.add(new Option_21133732_PachecoParra(3, "3) Volver", 0, 1, new ArrayList<>(List.of("Volver", "Salir", "Regresar"))));
        Flow_21133732_PachecoParra flowChatbot2 = new Flow_21133732_PachecoParra(1, "Flujo 1 Chatbot2\n¿Qué te gustaría estudiar?", optionsChatbot2);
        List<Flow_21133732_PachecoParra> flowsChatbot2 = new ArrayList<>();
        flowsChatbot2.add(flowChatbot2);
        Chatbot_21133732_PachecoParra chatbot2 = new Chatbot_21133732_PachecoParra(2, "Orientador Académico", "Bienvenido\n¿Qué te gustaría estudiar?", 1, flowsChatbot2);

        // Creación de Usuarios
        User_21133732_PachecoParra user1 = new User_21133732_PachecoParra("user1", true);
        User_21133732_PachecoParra user2 = new User_21133732_PachecoParra("user2", false);
        User_21133732_PachecoParra user3 = new User_21133732_PachecoParra("user3", true);
        List<User_21133732_PachecoParra> usuarios = new ArrayList<>();
        usuarios.add(user1);
        usuarios.add(user2);
        usuarios.add(user3);

        CargaDatos_21133732_PachecoParra.addChatbot(chatbot0);
        CargaDatos_21133732_PachecoParra.addChatbot(chatbot1);
        CargaDatos_21133732_PachecoParra.addChatbot(chatbot2);
        CargaDatos_21133732_PachecoParra.addUser(user1);
        CargaDatos_21133732_PachecoParra.addUser(user2);
        CargaDatos_21133732_PachecoParra.addUser(user3);

        // Creación del Sistema
        Sistema_21133732_PachecoParra sistema = new Sistema_21133732_PachecoParra("Chatbots Paradigmas", 0, new ArrayList<>(List.of(chatbot0, chatbot1, chatbot2)), usuarios, user1, new ArrayList<>());

        // systemTalk

        // Mostrar sistema
        System.out.println(sistema);
        // Llamar al método main de Menu_21133732_PachecoParra
        Menu_21133732_PachecoParra.main(sistema);
    }
}