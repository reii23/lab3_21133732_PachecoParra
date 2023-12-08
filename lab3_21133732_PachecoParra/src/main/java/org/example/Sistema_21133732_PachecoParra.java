package org.example;

import java.util.List;

// Sistema_21133732_PachecoParra.java

public class Sistema_21133732_PachecoParra implements InterfaceSistema_21133732_PachecoParra {

    // El sistema además de contener los distintos chatbots, también contiene el chatHistory de cada usuario que interactúa con el sistema. Sobre el chatHistory, éste corresponde al registro completo del diálogo entre usuario y cada uno de los chatbots con los que interactúa.
    //El historial se mantiene para cada usuario y debe tener el String formateado de cada mensaje del usuario y chatbot (para luego ser visualizado en la consola/terminal a través del uso del menú), fecha, hora y emisor (usuario o sistema).

    // name (string) X InitialChatbotCodeLink (Int) X chatbots (Lista de 0 o más chatbots) X usersRegistrados (Lista de 0 o más usuarios registrados) x userLogeado (Usuario logeado en el sistema) X chatHistory (Lista de 0 o más mensajes)

    private String nameSystem;
    private int initialChatbotCodeLink;
    private List<Chatbot_21133732_PachecoParra> chatbots;
    private List<User_21133732_PachecoParra> usersRegistrados;
    private User_21133732_PachecoParra userLogeado;
    private List<String> chatHistory;

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
    // Requisitos de implementación: Solo se puede conversar si se ha iniciado una sesión con un usuario previamente registrado.
    // Parámetros de entrada: message (string)
    //            ;message puede ser la opción o palabra clave que el usuario ingresa para interactuar con el chatbot.

    public void systemTalk (String message) {
        // si el usuario no está logeado, no se puede interactuar con el chatbot
        if (this.userLogeado == null) {
            System.out.println("No se puede interactuar con el chatbot porque no hay un usuario logeado");
            return;
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
