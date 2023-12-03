package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // CARGA DE DATOS
        List<Chatbot> chatbotsIniciales= new ArrayList<>();
        List<Flow> flows = new ArrayList<>();
        List<Option> options = new ArrayList<>();
        List<String> keywords = new ArrayList<>();
        keywords.add("hola");
        keywords.add("hi");
        keywords.add("hello");
        Option o1 = new Option(1, "Hola, soy una opción", 1, 1, keywords);
        options.add(o1);
        Flow f1 = new Flow(1, "Hola, soy un flow", options);
        flows.add(f1);
        Chatbot c1 = new Chatbot(1, "Chatbot", "Hola, soy un chatbot", 1, flows);
        chatbotsIniciales.add(c1);
        User user = new User("Reinaldo", true);
        User user2 = new User("Java", false);
        List <User> usuarios = new ArrayList<>();
        usuarios.add(user);
        Sistema sistema = new Sistema("Sistema", 0, chatbotsIniciales, usuarios, user, new ArrayList<>());

        // mostrar sistema
        System.out.println(sistema);


    }
}
