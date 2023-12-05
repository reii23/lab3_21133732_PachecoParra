package org.example;

public class User_21133732_PachecoParra {
    String username;
    boolean esAdministrador;

    public User_21133732_PachecoParra(String username, boolean esAdministrador) {
        this.username = username;
        this.esAdministrador = esAdministrador;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean esAdministrador() {
        return esAdministrador;
    }

    public void setAdmin(boolean admin) {
        esAdministrador = admin;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", esAdministrador=" + esAdministrador +
                '}';
    }
}
