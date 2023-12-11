package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CargaDatos_21133732_PachecoParra {
    private static final Map<Integer, Option_21133732_PachecoParra> opciones = new HashMap<>();
    private static final Map<Integer, Flow_21133732_PachecoParra> flujos = new HashMap<>();
    private static final Map<Integer, Chatbot_21133732_PachecoParra> chatbots = new HashMap<>();
    private static final List<User_21133732_PachecoParra> usuarios = new ArrayList<>();

    public static void addOption(Option_21133732_PachecoParra option) {
        opciones.put(option.getCode(), option);
    }

    public static void addFlow(Flow_21133732_PachecoParra flow) {
        flujos.put(flow.getId(), flow);
    }

    public static void addChatbot(Chatbot_21133732_PachecoParra chatbot) {
        chatbots.put(chatbot.getChatbotID(), chatbot);
    }

    public static void addUser(User_21133732_PachecoParra user) {
        usuarios.add(user);
    }

    public static Map<Integer, Option_21133732_PachecoParra> getOptions() {
        return opciones;
    }

    public static Map<Integer, Flow_21133732_PachecoParra> getFlujos() {
        return flujos;
    }

    public static Map<Integer, Chatbot_21133732_PachecoParra> getChatbots() {
        return chatbots;
    }

    public static List<User_21133732_PachecoParra> getUsuarios() {
        return usuarios;
    }

    private static Sistema_21133732_PachecoParra sistema;

    public static void setSistema(Sistema_21133732_PachecoParra sistema) {
        CargaDatos_21133732_PachecoParra.sistema = sistema;
    }

    public static Sistema_21133732_PachecoParra getSistema() {
        return sistema;
    }
}
