package org.example;

import java.util.List;

public class Sistema implements InterfaceSistema{

    // El sistema además de contener los distintos chatbots, también contiene el chatHistory de cada usuario que interactúa con el sistema. Sobre el chatHistory, éste corresponde al registro completo del diálogo entre usuario y cada uno de los chatbots con los que interactúa.
    //El historial se mantiene para cada usuario y debe tener el String formateado de cada mensaje del usuario y chatbot (para luego ser visualizado en la consola/terminal a través del uso del menú), fecha, hora y emisor (usuario o sistema).

    // name (string) X InitialChatbotCodeLink (Int) X chatbots (Lista de 0 o más chatbots) X usersRegistrados (Lista de 0 o más usuarios registrados) x userLogeado (Usuario logeado en el sistema) X chatHistory (Lista de 0 o más mensajes)

    private String nameSystem;
    private int initialChatbotCodeLink;
    private List<Chatbot> chatbots;
    private List<User> usersRegistrados;
    private User userLogeado;
    private List<String> chatHistory;

    // RFN7: TDA Sistema - constructor - system
    public Sistema(String nameSystem, int initialChatbotCodeLink, List<Chatbot> chatbots, List<User> usersRegistrados, User userLogeado, List<String> chatHistory) {
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

    public List<Chatbot> getChatbots() {
        return chatbots;
    }

    public List<User> getUsersRegistrados() {
        return usersRegistrados;
    }

    public User getUserLogeado() {
        return userLogeado;
    }

    public List<String> getChatHistory() {
        return chatHistory;
    }


    // RFN8: TDA Sistema - modificador - systemAddChatbot
    public void systemAddChatbot(Chatbot chatbot) {
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
    public void systemAddUser(User user) {
        if (!this.usersRegistrados.contains(user)) {
            this.usersRegistrados.add(user);
        }
    }

    // RFN10: TDA Sistema - modificador - systemLogin
    public void systemLogin(User user) {
        if (this.usersRegistrados.contains(user) && this.userLogeado == null) {
            this.userLogeado = user;
        }
    }

    // RFN11: TDA Sistema - modificador - systemLogout
    public void systemLogout() {
        this.userLogeado = null;
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
