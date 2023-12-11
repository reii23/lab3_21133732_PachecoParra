package org.example;

/**
 * Clase que representa un usuario del sistema
 * Proporciona atributos como un nombre de usuario y un booleano que indica si es administrador o no.
 */

public class User_21133732_PachecoParra {
    String username;
    boolean esAdministrador;

    /**
     * Construye una nueva instancia de User_21133732_PachecoParra
     *
     * @param username        el nombre de usuario
     * @param esAdministrador un booleano que indica si es administrador o no
     */
    public User_21133732_PachecoParra(String username, boolean esAdministrador) {
        this.username = username;
        this.esAdministrador = esAdministrador;
    }

    /**
     * Devuelve el nombre de usuario.
     *
     * @return el nombre de usuario
     */
    public String getUsername() {
        return username;
    }

    /**
     * Establece el nombre de usuario.
     *
     * @param username el nombre de usuario
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Devuelve un booleano que indica si es administrador o no.
     *
     * @return un booleano que indica si es administrador o no
     */
    public boolean esAdministrador() {
        return esAdministrador;
    }

    /**
     * Establece el booleano que indica si es administrador o no.
     *
     * @param admin un booleano que indica si es administrador o no
     */
    public void setAdmin(boolean admin) {
        esAdministrador = admin;
    }

    /**
     * Devuelve un String representacion de User_21133732_PachecoParra.
     *
     * @return una representación String de User_21133732_PachecoParra
     */
    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", esAdministrador=" + esAdministrador +
                '}';
    }
}
