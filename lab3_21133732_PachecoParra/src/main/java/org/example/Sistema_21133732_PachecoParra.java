package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


// Sistema_21133732_PachecoParra.java

public class Sistema_21133732_PachecoParra implements InterfaceSistema_21133732_PachecoParra {
    private String nameSystem;
    private int initialChatbotCodeLink;
    private List<Chatbot_21133732_PachecoParra> chatbots;
    private List<User_21133732_PachecoParra> usersRegistrados;
    private User_21133732_PachecoParra userLogeado;
    private List<String> chatHistory = new ArrayList<>();

    private static Scanner scanner = new Scanner(System.in);

    // RFN7: TDA Sistema - constructor - system
    public Sistema_21133732_PachecoParra(String nameSystem, int initialChatbotCodeLink, List<Chatbot_21133732_PachecoParra> chatbots, List<User_21133732_PachecoParra> usersRegistrados, User_21133732_PachecoParra userLogeado, List<String> chatHistory) {
        this.nameSystem = nameSystem;
        this.initialChatbotCodeLink = initialChatbotCodeLink;
        this.chatbots = chatbots;
        this.usersRegistrados = usersRegistrados;
        this.userLogeado = userLogeado;
        this.chatHistory = chatHistory;
    }

    public String getNameSystem() {
        return nameSystem;
    }

    public int getInitialChatbotCodeLink() {
        return initialChatbotCodeLink;
    }

    public List<Chatbot_21133732_PachecoParra> getChatbots() {
        return chatbots;
    }

    public List<User_21133732_PachecoParra> getUsersRegistrados() {
        return usersRegistrados;
    }

    public User_21133732_PachecoParra getUserLogeado() {
        return userLogeado;
    }

    public List<String> getChatHistory() {
        return chatHistory;
    }


    // RFN8: TDA Sistema - modificador - systemAddChatbot
    public void systemAddChatbot(Chatbot_21133732_PachecoParra chatbot) {
        if (!this.chatbots.contains(chatbot)) {
            this.chatbots.add(chatbot);
        }
    }

    // Debe verificar que el usuario no exista en el sistema a partir del id de éste, que está dado por su nombre de usuario (String).
    //
    //Es irrelevante cómo lo agrega, puede ser al principio, final, o en cierta posición, no es relevante para este laboratorio.
    // dom: user (String)
    // verifica con case-sensitive ejm: user1 != UsEr1

    // RFN9: TDA Sistema - modificador - systemAddUser
    public void systemAddUser(User_21133732_PachecoParra user) {
        if (!this.usersRegistrados.contains(user)) {
            this.usersRegistrados.add(user);
        }
    }

    // RFN10: TDA Sistema - modificador - systemLogin
    public void systemLogin(User_21133732_PachecoParra user) {
        if (this.usersRegistrados.contains(user) && this.userLogeado == null) {
            this.userLogeado = user;
        }
    }

    // RFN11: TDA Sistema - modificador - systemLogout
    public void systemLogout() {
        this.userLogeado = null;
    }


    // RFN12  system-talk. Método que permite interactuar con un chatbot.
    public void systemTalk() {
        if (this.userLogeado == null) {
            System.out.println("Por favor, inicie sesión para usar el chatbot.");
            return;
        }

        Chatbot_21133732_PachecoParra currentChatbot = this.chatbots.stream()
                .filter(chatbot -> chatbot.getChatbotID() == this.initialChatbotCodeLink)
                .findFirst()
                .orElse(null);

        if (currentChatbot == null) {
            System.out.println("No se encontró el chatbot inicial.");
            return;
        }

        Flow_21133732_PachecoParra currentFlow = currentChatbot.getFlows().stream()
                .filter(flujo -> flujo.getId() == currentChatbot.getStartFlowId())
                .findFirst()
                .orElse(null);

        if (currentFlow == null) {
            System.out.println("Flujo inicial no encontrado en el chatbot.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(currentFlow.getNameMsg());
            for (Option_21133732_PachecoParra option : currentFlow.getOptions()) {
                System.out.println(option.getCode() + ") " + option.getMessage());
            }

            System.out.print("Ingrese su elección: ");
            String userChoice = scanner.nextLine();

            if ("salir".equalsIgnoreCase(userChoice)) {
                chatHistory.add("Usuario " + this.userLogeado.getUsername() + " salió del chat.");
                System.out.println("Saliendo de la conversación...");
                break;
            }

            Option_21133732_PachecoParra chosenOption = currentFlow.getOptions().stream()
                    .filter(option -> String.valueOf(option.getCode()).equals(userChoice))
                    .findFirst()
                    .orElse(null);

            if (chosenOption == null) {
                System.out.println("Opción no válida, intente nuevamente.");
                continue;
            }

            // Añadir la elección del usuario al historial de chat
            chatHistory.add("Usuario " + this.userLogeado.getUsername() + " seleccionó la opción: " + chosenOption.getMessage());

            int nextFlowId = chosenOption.getInitialFlowCodeLink();
            if (nextFlowId != currentFlow.getId()) {
                Flow_21133732_PachecoParra nextFlow = currentChatbot.getFlows().stream()
                        .filter(flujo -> flujo.getId() == nextFlowId)
                        .findFirst()
                        .orElse(null);

                if (nextFlow != null) {
                    currentFlow = nextFlow;
                } else {
                    System.out.println("Conversación finalizada o flujo no encontrado para la opción seleccionada.");
                    break;
                }
            } else {
                System.out.println("Continuando en el mismo flujo.");
            }
        }
    }


    // (1.5 pto) system-synthesis. Método que ofrece una síntesis del chatbot para un usuario particular  a partir de chatHistory contenido dentro del sistema
    //Prerrequisitos para evaluación (req. funcionales)
    //12
    //Dominio
    //usuario (String)

    public void systemSynthesis() {
        if (this.userLogeado == null) {
            System.out.println("Por favor, inicie sesión para usar el chatbot.");
            return;
        }

        System.out.println("Síntesis del chatbot para el usuario " + this.userLogeado.getUsername() + ":");
        for (String message : this.chatHistory) {
            System.out.println(message);
        }
    }

    @Override
    public String toString() {
        return "Sistema{" +
                "nameSystem='" + nameSystem + '\'' +
                ", initialChatbotCodeLink=" + initialChatbotCodeLink +
                ", chatbots=" + chatbots +
                ", usersRegistrados=" + usersRegistrados +
                ", userLogeado=" + userLogeado +
                ", chatHistory=" + chatHistory +
                '}';
    }
}
