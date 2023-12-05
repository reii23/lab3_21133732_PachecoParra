package org.example;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Menu_21133732_PachecoParra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("### Sistema de Chatbots - Inicio ###");
        System.out.println("1. Login de Usuario");
        System.out.println("2. Registro de Usuario");
        System.out.println("INTRODUZCA SU OPCIÓN:");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                // Proceso de login
                System.out.println("### Sistema de Chatbots - Login ###");
                System.out.println("INTRODUZCA NOMBRE DE USUARIO:");
                String nombreUsuario = scanner.next();
                // Aquí asumimos que se verifica si el usuario es administrador o normal
                mostrarMenuPrincipal(nombreUsuario, false); // false para usuario normal
                break;
            case 2:
                // Proceso de registro
                System.out.println("### Sistema de Chatbots - Registro ###");
                System.out.println("1. Registrar usuario normal");
                System.out.println("2. Registrar usuario administrador");
                System.out.println("INTRODUZCA SU OPCIÓN:");
                int opcionRegistro = scanner.nextInt();

                switch (opcionRegistro) {
                    case 1:
                        System.out.println("### Sistema de Chatbots - Registro Usuario Normal ###");
                        System.out.println("INTRODUZCA NOMBRE DE USUARIO:");
                        String nombreUsuarioNormal = scanner.next();
                        mostrarMenuPrincipal(nombreUsuarioNormal, false); // false para usuario normal
                        break;
                    case 2:
                        System.out.println("### Sistema de Chatbots - Registro Usuario Administrador ###");
                        System.out.println("INTRODUZCA NOMBRE DEL USUARIO ADMINISTRADOR:");
                        String nombreUsuarioAdministrador = scanner.next();
                        mostrarMenuPrincipal(nombreUsuarioAdministrador, true); // true para usuario administrador
                        break;
                }
                break;
        }
    }

    private static void mostrarMenuPrincipal(String nombreUsuario, boolean esAdministrador) {
        if (esAdministrador) {
            mostrarMenuAdministrador(nombreUsuario);
        } else {
            mostrarMenuUsuarioNormal(nombreUsuario);
        }
    }

    private static void mostrarMenuAdministrador(String nombreUsuario) {
        System.out.println("### Sistema de Chatbots - Usuario Administrador ###");
        System.out.println("Bienvenido " + nombreUsuario + " usted es administrador.");
        System.out.println("1. Crear un Chatbot");
        System.out.println("2. Modificar un Chatbot");
        System.out.println("3. Ejecutar un Chatbot");
        System.out.println("4. Visualizar todos los chatbots existentes en el sistema");
        System.out.println("5. Visualizar todos los chatbots con sus flujos y opciones creadas");
        System.out.println("6. Ejecutar una simulación del sistema de chatbot");
        System.out.println("7. Salir");
        System.out.println("INTRODUZCA SU OPCIÓN:");
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("### Sistema de Chatbots - Crear Option ###");
                System.out.print("INTRODUZCA CODE DEL OPTION: ");
                int code = scanner.nextInt();
                scanner.nextLine();

                System.out.print("INTRODUZCA MESSAGE DEL OPTION: ");
                String mensaje = scanner.nextLine();

                System.out.print("INTRODUZCA CHATBOT CODE LINK DEL OPTION: ");
                int chatbotCodeLink = scanner.nextInt();
                scanner.nextLine();

                System.out.print("INTRODUZCA INITIAL FLOW CODE LINK DEL OPTION: ");
                int initialFlowCodeLink = scanner.nextInt();
                scanner.nextLine();

                System.out.print("INTRODUZCA KEYWORDS DEL OPTION (separadas por espacio): ");
                String  keywords = scanner.nextLine();
                Option_21133732_PachecoParra option = new Option_21133732_PachecoParra(code, mensaje, chatbotCodeLink, initialFlowCodeLink, List.of(keywords));
                System.out.println(option);
                System.out.println("Se ha creado el Option exitosamente.");
                break;
            case 2:
                // Modificar un Chatbot
                System.out.println("### Sistema de Chatbots - Modificar Option ###");
                System.out.print("INTRODUZCA CODE DEL OPTION: ");
                int codeOption = scanner.nextInt();
                scanner.nextLine();
                System.out.print("INTRODUZCA MESSAGE DEL OPTION: ");
                String mensajeOption = scanner.nextLine();
                System.out.print("INTRODUZCA CHATBOT CODE LINK DEL OPTION: ");
                int chatbotCodeLinkOption = scanner.nextInt();
                scanner.nextLine();
                System.out.print("INTRODUZCA INITIAL FLOW CODE LINK DEL OPTION: ");
                int initialFlowCodeLinkOption = scanner.nextInt();
                scanner.nextLine();
                System.out.print("INTRODUZCA KEYWORDS DEL OPTION (separadas por espacio): ");
                String  keywordsOption = scanner.nextLine();
                Option_21133732_PachecoParra optionModificar = new Option_21133732_PachecoParra(codeOption, mensajeOption, chatbotCodeLinkOption, initialFlowCodeLinkOption, List.of(keywordsOption));
                System.out.println(optionModificar);
                System.out.println("Se ha modificado el Option exitosamente.");
                break;
            case 3:
                // Ejecutar un Chatbot
                break;
            case 4:
                // Visualizar todos los chatbots existentes en el sistema

                break;
            case 5:
                // Visualizar todos los chatbots con sus flujos y opciones creadas
                break;
            case 6:
                // Ejecutar una simulación del sistema de chatbot
                break;
            case 7:
                // Salir
                break;
        }
    }

    private static void mostrarMenuUsuarioNormal(String nombreUsuario) {
        System.out.println("### Sistema de Chatbots - Usuario Normal ###");
        System.out.println("Bienvenido " + nombreUsuario + " usted es usuario normal.");
        System.out.println("1. Visualizar todos los chatbots existentes en el sistema");
        System.out.println("2. Visualizr todos los chatbots con sus flujos y opciones creadas");
        System.out.println("3. Ejecutar una simulación del sistema de chatbot");
        System.out.println("4. Salir");
        System.out.println("INTRODUZCA SU OPCIÓN:");
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                // Visualizar todos los chatbots existentes en el sistema
                break;
            case 2:
                // Visualizar todos los chatbots con sus flujos y opciones creadas
                break;
            case 3:
                // Ejecutar una simulación del sistema de chatbot
                break;
            case 4:
                // Salir
                break;
        }
    }

}


