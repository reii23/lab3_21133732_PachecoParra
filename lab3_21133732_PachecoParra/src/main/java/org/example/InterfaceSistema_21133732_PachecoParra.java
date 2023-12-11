package org.example;

/**
 * Interfaz que representa un sistema de chatbots
 * Proporciona métodos para agregar un chatbot y un usuario al sistema, así como para iniciar y cerrar sesión.
 */
public interface InterfaceSistema_21133732_PachecoParra {
    void systemAddChatbot(Chatbot_21133732_PachecoParra chatbot);
    void systemAddUser(User_21133732_PachecoParra user);
    void systemLogin(User_21133732_PachecoParra user);
    void systemLogout();
}
