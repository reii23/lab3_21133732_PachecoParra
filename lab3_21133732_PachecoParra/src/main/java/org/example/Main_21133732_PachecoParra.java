package org.example;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Flow;

/**
 * Clase que representa el main del programa
 * Proporciona un método main que inicializa el sistema y lo ejecuta.
 * Crea instancias de los TDA Option, Flow, Chatbot, User y Sistema.
 * Carga datos en el sistema.
 * Sincroniza los usuarios registrados con el sistema.
 * Ejecuta el menú principal.
 */

public class Main_21133732_PachecoParra {
    public static void main(String[] args) {
        /**
         * Crea instancias de los TDA Option, Flow, Chatbot, User y Sistema.
         */
        Option_21133732_PachecoParra op1 = new Option_21133732_PachecoParra(1, "1) Viajar", 1, 1, List.of("viajar", "turistear", "conocer"));
        Option_21133732_PachecoParra op2 = new Option_21133732_PachecoParra(2, "2) Estudiar", 2, 1, List.of("estudiar", "aprender", "perfeccionarme"));
        Option_21133732_PachecoParra op3 = new Option_21133732_PachecoParra(1, "1) New York, USA", 1, 2, List.of("USA", "Estados Unidos", "New York"));
        Option_21133732_PachecoParra op4 = new Option_21133732_PachecoParra(2, "2) Paris, Francia", 1, 1, List.of("Paris", "Eiffel"));
        Option_21133732_PachecoParra op5 = new Option_21133732_PachecoParra(3, "3) Torres del Paine, Chile", 1, 1, List.of("Chile", "Torres", "Paine", "Torres Paine", "Torres del Paine"));
        Option_21133732_PachecoParra op6 = new Option_21133732_PachecoParra(4, "4) Volver", 0, 1, List.of("Regresar", "Salir", "Volver"));
        Option_21133732_PachecoParra op7 = new Option_21133732_PachecoParra(1, "1) Central Park", 1, 2, List.of("Central", "Park", "Central Park"));
        Option_21133732_PachecoParra op8 = new Option_21133732_PachecoParra(2, "2) Museos", 1, 2, List.of("Museo"));
        Option_21133732_PachecoParra op9 = new Option_21133732_PachecoParra(3, "3) Ningun otro atractivo", 1, 3, List.of("Museo"));
        Option_21133732_PachecoParra op10 = new Option_21133732_PachecoParra(4, "4) Cambiar destino", 1, 1, List.of("Cambiar", "Volver", "Salir"));
        Option_21133732_PachecoParra op11 = new Option_21133732_PachecoParra(1, "1) Solo", 1, 3, List.of("Solo"));
        Option_21133732_PachecoParra op12 = new Option_21133732_PachecoParra(2, "2) En pareja", 1, 3, List.of("Pareja"));
        Option_21133732_PachecoParra op13 = new Option_21133732_PachecoParra(3, "3) En familia", 1, 3, List.of("Familia"));
        Option_21133732_PachecoParra op14 = new Option_21133732_PachecoParra(4, "4) Agregar mas atractivos", 1, 2, List.of("Volver", "Atractivos"));
        Option_21133732_PachecoParra op15 = new Option_21133732_PachecoParra(5, "5) En realidad quiero otro destino", 1, 1, List.of("Cambiar destino"));
        Option_21133732_PachecoParra op16 = new Option_21133732_PachecoParra(1, "1) Carrera Tecnica", 2, 1, List.of("Técnica"));
        Option_21133732_PachecoParra op17 = new Option_21133732_PachecoParra(2, "2) Postgrado", 2, 1, List.of("Doctorado", "Magister", "Postgrado"));
        Option_21133732_PachecoParra op18 = new Option_21133732_PachecoParra(3, "3) Volver", 0, 1, List.of("Volver", "Salir", "Regresar"));
        Flow_21133732_PachecoParra f10 = new Flow_21133732_PachecoParra(1, "Flujo Principal Chatbot 1\nBienvenido\n¿Que te gustaria hacer?", List.of(op1, op2));
        Flow_21133732_PachecoParra f20 = new Flow_21133732_PachecoParra(1, "Flujo 1 Chatbot1\n¿Donde te gustaria ir?", List.of(op3, op4, op5, op6));
        Flow_21133732_PachecoParra f21 = new Flow_21133732_PachecoParra(2, "Flujo 2 Chatbot1\n¿Que atractivos te gustaria visitar?", List.of(op7, op8, op9, op10));
        Flow_21133732_PachecoParra f22 = new Flow_21133732_PachecoParra(3, "Flujo 3 Chatbot1\n¿Vas solo o con mas personas?", List.of(op11, op12, op13, op14, op15));
        Flow_21133732_PachecoParra f30 = new Flow_21133732_PachecoParra(1, "Flujo 1 Chatbot2\n¿Que te gustaria estudiar?", List.of(op16, op17, op18));
        Chatbot_21133732_PachecoParra cb0 = new Chatbot_21133732_PachecoParra(0, "Inicial", "Bienvenido ¿Que te gustaria hacer?", 1, List.of(f10));
        Chatbot_21133732_PachecoParra cb1 = new Chatbot_21133732_PachecoParra(1, "Agencia Viajes", "Bienvenido ¿Donde quieres viajar?", 1, List.of(f20, f21, f22));
        Chatbot_21133732_PachecoParra cb2 = new Chatbot_21133732_PachecoParra(2, "Orientador Académico", "Bienvenido ¿Que te gustaria estudiar?", 1, List.of(f30));
        List<User_21133732_PachecoParra> users = new ArrayList<>();
        User_21133732_PachecoParra user1 = new User_21133732_PachecoParra("user1", true);
        User_21133732_PachecoParra user2 = new User_21133732_PachecoParra("user2", false);
        users.add(user1);
        users.add(user2);

        Sistema_21133732_PachecoParra sistema = new Sistema_21133732_PachecoParra("Chatbots Paradigmas", 0, new ArrayList<>(List.of(cb0, cb1, cb1)), users, user1, new ArrayList<>());

        /**
         * Carga datos en el sistema.
         */
        CargaDatos_21133732_PachecoParra.addOption(op1);
        CargaDatos_21133732_PachecoParra.addOption(op2);
        CargaDatos_21133732_PachecoParra.addOption(op3);
        CargaDatos_21133732_PachecoParra.addOption(op4);
        CargaDatos_21133732_PachecoParra.addOption(op5);
        CargaDatos_21133732_PachecoParra.addOption(op6);
        CargaDatos_21133732_PachecoParra.addOption(op7);
        CargaDatos_21133732_PachecoParra.addOption(op8);
        CargaDatos_21133732_PachecoParra.addOption(op9);
        CargaDatos_21133732_PachecoParra.addOption(op10);
        CargaDatos_21133732_PachecoParra.addOption(op11);
        CargaDatos_21133732_PachecoParra.addOption(op12);
        CargaDatos_21133732_PachecoParra.addOption(op13);
        CargaDatos_21133732_PachecoParra.addOption(op14);
        CargaDatos_21133732_PachecoParra.addOption(op15);
        CargaDatos_21133732_PachecoParra.addOption(op16);
        CargaDatos_21133732_PachecoParra.addOption(op17);
        CargaDatos_21133732_PachecoParra.addOption(op18);
        CargaDatos_21133732_PachecoParra.addFlow(f10);
        CargaDatos_21133732_PachecoParra.addFlow(f20);
        CargaDatos_21133732_PachecoParra.addFlow(f21);
        CargaDatos_21133732_PachecoParra.addFlow(f22);
        CargaDatos_21133732_PachecoParra.addFlow(f30);
        CargaDatos_21133732_PachecoParra.addChatbot(cb0);
        CargaDatos_21133732_PachecoParra.addChatbot(cb1);
        CargaDatos_21133732_PachecoParra.addChatbot(cb2);
        CargaDatos_21133732_PachecoParra.addUser(user1);
        CargaDatos_21133732_PachecoParra.addUser(user2);

        /**
         * Sincroniza los usuarios registrados con el sistema.
         */
        Menu_21133732_PachecoParra.sincronizarUsuarios(sistema.getUsersRegistrados());

        /**
         * Ejecuta el menú principal.
         */
        Menu_21133732_PachecoParra.main(sistema);
    }
}