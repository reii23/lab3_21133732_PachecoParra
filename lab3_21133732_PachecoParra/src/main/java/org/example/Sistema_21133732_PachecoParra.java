package org.example;

import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Clase que representa un sistema de chatbots
 * Proporciona atributos como un nombre, un enlace al chatbot inicial, una lista de chatbots, una lista de usuarios registrados, un usuario logeado y un historial de chat.
 */
public class Sistema_21133732_PachecoParra implements InterfaceSistema_21133732_PachecoParra {
    private String nameSystem;
    private int initialChatbotCodeLink;
    private List<Chatbot_21133732_PachecoParra> chatbots;
    private List<User_21133732_PachecoParra> usersRegistrados;
    private User_21133732_PachecoParra userLogeado;
    private List<String> chatHistory;
    private static Scanner scanner = new Scanner(System.in);

    // RFN7: TDA Sistema - constructor - system

    /**
     * Construye una nueva instancia de Sistema_21133732_PachecoParra
     *
     * @param nameSystem             el nombre del sistema
     * @param initialChatbotCodeLink el enlace al chatbot inicial
     * @param chatbots               una lista de chatbots asociados con el sistema
     * @param usersRegistrados       una lista de usuarios registrados en el sistema
     * @param userLogeado            el usuario logeado en el sistema
     * @param chatHistory            una lista de mensajes de chat
     */
    public Sistema_21133732_PachecoParra(String nameSystem, int initialChatbotCodeLink, List<Chatbot_21133732_PachecoParra> chatbots, List<User_21133732_PachecoParra> usersRegistrados, User_21133732_PachecoParra userLogeado, List<String> chatHistory) {
        this.nameSystem = nameSystem;
        this.initialChatbotCodeLink = initialChatbotCodeLink;
        this.chatbots = chatbots;
        this.usersRegistrados = usersRegistrados;
        this.userLogeado = userLogeado;
        this.chatHistory = chatHistory;
    }

    /**
     * Devuelve el nombre del sistema.
     *
     * @return el nombre del sistema
     */
    public String getNameSystem() {
        return nameSystem;
    }

    /**
     * Devuelve el enlace al chatbot inicial.
     *
     * @return el enlace al chatbot inicial
     */
    public int getInitialChatbotCodeLink() {
        return initialChatbotCodeLink;
    }

    /**
     * Devuelve una lista de chatbots asociados con el sistema.
     *
     * @return una lista de chatbots asociados con el sistema
     */
    public List<Chatbot_21133732_PachecoParra> getChatbots() {
        return chatbots;
    }

    /**
     * Devuelve una lista de usuarios registrados en el sistema.
     *
     * @return una lista de usuarios registrados en el sistema
     */
    public List<User_21133732_PachecoParra> getUsersRegistrados() {
        return usersRegistrados;
    }

    /**
     * Devuelve el usuario logeado en el sistema.
     *
     * @return el usuario logeado en el sistema
     */
    public User_21133732_PachecoParra getUserLogeado() {
        return userLogeado;
    }

    /**
     * Devuelve el historial de chat.
     *
     * @return lista del historial de chat
     */
    public List<String> getChatHistory() {
        return chatHistory;
    }

    // RFN8: TDA Sistema - modificador - systemAddChatbot
    /**
     * Agrega un chatbot a la lista de chatbots asociados con el sistema.
     *
     * @param chatbot el chatbot a agregar
     */
    public void systemAddChatbot(Chatbot_21133732_PachecoParra chatbot) {
        if (!this.chatbots.contains(chatbot)) {
            this.chatbots.add(chatbot);
        }
    }

    // RFN9: TDA Sistema - modificador - systemAddUser
    /**
     * Agrega un usuario a la lista de usuarios registrados en el sistema.
     *
     * @param user el usuario a agregar
     */
    public void systemAddUser(User_21133732_PachecoParra user) {
        if (!this.usersRegistrados.contains(user)) {
            this.usersRegistrados.add(user);
        }
    }

    // RFN10: TDA Sistema - modificador - systemLogin
    /**
     * Inicia sesión en el sistema.
     *
     * @param user el usuario que inicia sesión
     */
    public void systemLogin(User_21133732_PachecoParra user) {
        if (this.usersRegistrados.contains(user) && this.userLogeado == null) {
            this.userLogeado = user;
        }
    }

    // RFN11: TDA Sistema - modificador - systemLogout
    /**
     * Cierra sesión en el sistema.
     */
    public void systemLogout() {
        this.userLogeado = null;
    }

    // RFN12 TDA Sistema - systemTalk
    /**
     * Inicia una conversación con el chatbot inicial.
     * Se muestran los mensajes de bienvenida y las opciones disponibles.
     * Se solicita al usuario que ingrese una opción.
     * Si la opción es válida, se muestra el mensaje asociado con la opción y se pasa al siguiente flujo.
     * Si la opción no es válida, se muestra un mensaje de error y se solicita al usuario que ingrese una opción nuevamente.
     * Si el flujo no se encuentra, se muestra un mensaje de error y se finaliza la conversación.
     * Si el chatbot no se encuentra, se muestra un mensaje de error y se finaliza la conversación.
     * Si el usuario ingresa "salir", se muestra un mensaje de despedida y se finaliza la conversación.
     */

    public void systemTalk() {
        Chatbot_21133732_PachecoParra currentChatbot = findChatbotId(this.initialChatbotCodeLink);
        if (currentChatbot == null) {
            System.out.println("No se encuentra el chatbot inicial.");
            return;
        }
        Flow_21133732_PachecoParra currentFlow = findFlowId(currentChatbot, currentChatbot.getStartFlowId());
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (currentFlow == null) {
                System.out.println("Flujo no encontrado. Se finaliza la conversacion.");
                break;
            }
            System.out.println(currentFlow.getNameMsg());
            for (Option_21133732_PachecoParra option : currentFlow.getOptions()) {
                System.out.println(option.getCode() + ") " + option.getMessage());
            }
            System.out.print("Ingrese su eleccion (o 'salir' para finalizar): ");
            String userChoice = scanner.nextLine();
            if ("salir".equalsIgnoreCase(userChoice)) {
                chatHistory.add("Usuario " + this.userLogeado.getUsername() + " salio del chat.");
                System.out.println("Hasta pronto!");
                break;
            }
            Option_21133732_PachecoParra chosenOption = findOptionCode(currentFlow, userChoice);
            if (chosenOption == null) {
                System.out.println("Opcion no valida, intentalo nuevamente.");
                continue;
            }
            chatHistory.add("Usuario " + this.userLogeado.getUsername() + " selecciono la opcion: " + chosenOption.getMessage());
            if (chosenOption.getChatbotCodeLink() != currentChatbot.getChatbotID()) {
                currentChatbot = findChatbotId(chosenOption.getChatbotCodeLink());
                if (currentChatbot == null) {
                    System.out.println("Chatbot no encontrado. Se finaliza la conversacion");
                    break;
                }
            }
            currentFlow = findFlowId(currentChatbot, chosenOption.getInitialFlowCodeLink());
        }
    }

    /**
     * Busca un flujo por su id.
     *
     * @param chatbot el chatbot asociado con el flujo
     * @param flowId  el id del flujo
     * @return el flujo encontrado o null si no se encuentra
     */
    private Flow_21133732_PachecoParra findFlowId(Chatbot_21133732_PachecoParra chatbot, int flowId) {
        return chatbot.getFlows().stream()
                .filter(flujo -> flujo.getId() == flowId)
                .findFirst()
                .orElse(null);
    }

    /**
     * Busca una opción por su código.
     *
     * @param flow el flujo asociado con la opción
     * @param code el código de la opción
     * @return la opción encontrada o null si no se encuentra
     */
    private Option_21133732_PachecoParra findOptionCode(Flow_21133732_PachecoParra flow, String code) {
        try {
            int optionCode = Integer.parseInt(code.trim());
            return flow.getOptions().stream()
                    .filter(option -> option.getCode() == optionCode)
                    .findFirst()
                    .orElse(null);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    /**
     * Busca un chatbot por su id.
     *
     * @param chatbotId el id del chatbot
     * @return el chatbot encontrado o null si no se encuentra
     */
    private Chatbot_21133732_PachecoParra findChatbotId(int chatbotId) {
        return this.chatbots.stream()
                .filter(chatbot -> chatbot.getChatbotID() == chatbotId)
                .findFirst()
                .orElse(null);
    }

    // RFN 13: systemSynthesis
    /**
     * Muestra el historial de chat la conversación
     * Se agrega la fecha y hora de cada mensaje.
     */
    public void systemSynthesis() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Sintesis del chatbot para el usuario " + this.userLogeado.getUsername() + ":");
        for (String message : this.chatHistory) {
            String formattedDateTime = LocalDateTime.now().format(formatter);
            System.out.println("[" + formattedDateTime + "] " + message);
        }
    }

    // RFN 14: systemSimulate: Permite simular un diálogo entre dos chatbots del sistema.
    /**
     * Simula un diálogo entre dos chatbots del sistema.
     * Se generan mensajes aleatorios para cada chatbot.
     *
     * @param maxInteractions el número máximo de interacciones
     * @param seed            la semilla para generar números aleatorios
     */
    public void systemSimulate(int maxInteractions, int seed) {
        if (this.chatbots.size() < 2) {
            System.out.println("Se requieren dos chatbots para ejecutar la simulacion.");
            return;
        }
        Random random = new Random(seed);
        int interactions = 0;
        while (interactions < maxInteractions) {
            Chatbot_21133732_PachecoParra chatbot1 = this.chatbots.get(random.nextInt(this.chatbots.size()));
            Chatbot_21133732_PachecoParra chatbot2 = this.chatbots.get(random.nextInt(this.chatbots.size()));
            if (chatbot1.getChatbotID() == chatbot2.getChatbotID()) {
                continue;
            }
            String mensajeChatbot1 = "Chatbot " + chatbot1.getChatbotID() + " dice: " + generarMensaje(random);
            String mensajeChatbot2 = "Chatbot " + chatbot2.getChatbotID() + " dice: " + generarMensaje(random);
            this.chatHistory.add(mensajeChatbot1);
            this.chatHistory.add(mensajeChatbot2);
            System.out.println(mensajeChatbot1);
            System.out.println(mensajeChatbot2);
            interactions++;
        }
    }

    /**
     * Genera un mensaje aleatorio.
     *
     * @param random el generador de números aleatorios
     * @return el mensaje generado
     */
    private String generarMensaje(Random random) {
        String[] mensajes = {"Hola soy un chatbot", "Hola, que tal", "Me gusta programar", "Mi lenguaje favorito es java", "Soy un chatbot de paradigmas", "Vivo en Santiago", "Me gusta la comida china", "A mi tambien"};
        return mensajes[random.nextInt(mensajes.length)];
    }

    /**
     * Devuelve un String representacion de Sistema_21133732_PachecoParra.
     *
     * @return una representación String de Sistema_21133732_PachecoParra
     */
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
