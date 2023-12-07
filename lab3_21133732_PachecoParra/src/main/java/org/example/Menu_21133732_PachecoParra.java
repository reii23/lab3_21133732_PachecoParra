
// nombre de funciones implementadas:
// construir option: "Option_21133732_PachecoParra"
// construir flow: "Flow_21133732_PachecoParra"
// agregar option al flow: "flowAddOption"
// construir chatbot: "Chatbot_21133732_PachecoParra"
// agregar flow al chatbot: "chatbotAddFlow"
// construir sistema: "Sistema_21133732_PachecoParra"
// agregar chatbot al sistema: "systemAddChatbot"
// agregar usuario al sistema: "systemAddUser"
// login de usuario: "systemLogin"
// logout de usuario: "systemLogout"

package org.example;

import java.util.*;

public class Menu_21133732_PachecoParra {
    private static Map<Integer, Option_21133732_PachecoParra> opciones = new HashMap<>();
    private static Map<Integer, Flow_21133732_PachecoParra> flujos = new HashMap<>();

    private static Scanner scanner = new Scanner(System.in);
    private static Map<String, Boolean> usuariosRegistrados = new HashMap<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("### Sistema de Chatbots - Inicio ###");
            System.out.println("1. Login de Usuario");
            System.out.println("2. Registro de Usuario");
            System.out.println("3. Salir");
            System.out.println("INTRODUZCA SU OPCIÓN:");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    procesoLogin();
                    break;
                case 2:
                    procesoRegistro();
                    break;
                case 3:
                    System.out.println("Saliendo del sistema...");
                    return;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }

    private static void procesoLogin() {
        System.out.println("### Sistema de Chatbots - Login ###");
        System.out.println("INTRODUZCA NOMBRE DE USUARIO:");
        String nombreUsuario = scanner.nextLine().toLowerCase();

        if (usuariosRegistrados.containsKey(nombreUsuario)) {
            mostrarMenuPrincipal(nombreUsuario, usuariosRegistrados.get(nombreUsuario));
        } else {
            System.out.println("Usuario no registrado. Por favor, registrese primero.");
        }
    }

    private static void procesoRegistro() {
        System.out.println("### Sistema de Chatbots - Registro ###");
        System.out.println("INTRODUZCA NOMBRE DE USUARIO:");
        String nombreUsuario = scanner.nextLine().toLowerCase();

        if (usuariosRegistrados.containsKey(nombreUsuario)) {
            System.out.println("El nombre de usuario ya esta registrado. Por favor, elija otro nombre.");
            return;
        }

        System.out.println("1. Registrar usuario normal");
        System.out.println("2. Registrar usuario administrador");
        System.out.println("INTRODUZCA SU OPCIÓN:");
        int opcionRegistro = scanner.nextInt();
        scanner.nextLine();

        switch (opcionRegistro) {
            case 1:
                usuariosRegistrados.put(nombreUsuario, false);
                System.out.println("Usuario normal registrado exitosamente.");
                break;
            case 2:
                usuariosRegistrados.put(nombreUsuario, true);
                System.out.println("Usuario administrador registrado exitosamente.");
                break;
            default:
                System.out.println("Opción no válida.");
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

    /////
    private static void mostrarMenuAdministrador(String nombreUsuario) {
        boolean continuar = true;
        while (continuar) {
            System.out.println("### Sistema de Chatbots - Usuario Administrador ###");
            System.out.println("Bienvenido " + nombreUsuario + " usted es administrador.");
            System.out.println("1. Acceder al menú option");
            System.out.println("2. Acceder al menú flow");
            System.out.println("3. Acceder al menú chatbot");
            System.out.println("4. Visualizar todos los chatbots existentes en el sistema");
            System.out.println("5. Visualizar todos los chatbots con sus flujos y opciones creadas");
            System.out.println("6. Ejecutar una simulación del sistema de chatbot");
            System.out.println("7. Salir");
            System.out.println("INTRODUZCA SU OPCIÓN:");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    menuOption();
                    break;
                case 2:
                    menuFlow();
                    break;
                case 3:
                    menuChatbot();
                    break;
                case 4:
                    visualizarChatbots();
                    break;
                case 5:
                    visualizarChatbotsConFlujos();
                    break;
                case 6:
                    ejecutarSimulacion();
                    break;
                case 7:
                    continuar = false; // Salir del menú
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }

    private static boolean menuOption() {
        while (true) {
            System.out.println("### Sistema de Chatbots - Menú Option ###");
            System.out.println("1. Crear opción");
            System.out.println("2. Modificar opción");
            System.out.println("3. Salir al menú anterior");
            System.out.println("INTRODUZCA SU OPCIÓN:");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    crearOpcion();
                    break;
                case 2:
                    modificarOpcion();
                    break;
                case 3:
                    return true;
                default:
                    System.out.println("Opción no válida, intentelo nuevamente");
                    break;
            }
        }
    }

    private static void crearOpcion() {
        System.out.println("### Sistema de Chatbots - Menú Option - Crear opción ###");
        System.out.println("INTRODUZCA EL CODE DEL OPTION:");
        int codeOption = scanner.nextInt();
        scanner.nextLine();

        if (opciones.containsKey(codeOption)) {
            System.out.println("Error: El código de opción ya existe.");
            return;
        }

        System.out.println("INTRODUZCA EL MESSAGE DEL OPTION:");
        String messageOption = scanner.nextLine();

        System.out.println("INTRODUZCA EL CHATBOTCODELINK DEL OPTION:");
        int chatbotCodeLinkOption = scanner.nextInt();
        scanner.nextLine();

        System.out.println("INTRODUZCA EL INITIALFLOWCODELINK DEL OPTION:");
        int initialFlowCodeLinkOption = scanner.nextInt();

        System.out.print("INTRODUZCA KEYWORDS DEL OPTION (separadas por espacio): ");
        String keywordsInput = scanner.nextLine();
        List<String> keywordsOption = Arrays.asList(keywordsInput.split("\\s+"));

        Option_21133732_PachecoParra optionCrear = new Option_21133732_PachecoParra(codeOption, messageOption, chatbotCodeLinkOption, initialFlowCodeLinkOption, keywordsOption);
        opciones.put(codeOption, optionCrear);
        System.out.println(optionCrear);
        System.out.println("Se ha creado el Option exitosamente.");
    }

    private static void modificarOpcion() {
        System.out.println("### Sistema de Chatbots - Menú Option - Modificar opción ###");
        System.out.println("INTRODUZCA EL CODE DEL OPTION:");
        int codeOptionModificar = scanner.nextInt();
        scanner.nextLine();

        // Verificar si el código de opción existe
        if (!opciones.containsKey(codeOptionModificar)) {
            System.out.println("Error: El código de opción no existe.");
            return;
        }

        System.out.println("INTRODUZCA EL MESSAGE DEL OPTION:");
        String messageOptionModificar = scanner.nextLine();

        System.out.println("INTRODUZCA EL CHATBOTCODELINK DEL OPTION:");
        int chatbotCodeLinkOptionModificar = scanner.nextInt();
        scanner.nextLine();

        System.out.println("INTRODUZCA EL INITIALFLOWCODELINK DEL OPTION:");
        int initialFlowCodeLinkOptionModificar = scanner.nextInt();
        scanner.nextLine();

        System.out.print("INTRODUZCA KEYWORDS DEL OPTION (separadas por espacio): ");
        String keywordsOptionModificar = scanner.nextLine();
        List<String> keywordsModificar = Arrays.asList(keywordsOptionModificar.split("\\s+"));

        Option_21133732_PachecoParra optionModificar = new Option_21133732_PachecoParra(codeOptionModificar, messageOptionModificar, chatbotCodeLinkOptionModificar, initialFlowCodeLinkOptionModificar, keywordsModificar);
        opciones.put(codeOptionModificar, optionModificar); // Actualizar la opción existente
        System.out.println(optionModificar);
        System.out.println("Se ha modificado el Option exitosamente.");
    }

    private static void menuFlow() {
        System.out.println("### Sistema de Chatbots - Menú Flow ###");
        System.out.println("1. Crear flujo");
        System.out.println("2. Agregar opción a flujo");
        System.out.println("3. Salir al menú principal");
        System.out.println("INTRODUZCA SU OPCIÓN:");
        int opcion = scanner.nextInt();
        scanner.nextLine();
        switch (opcion) {
            case 1:
                crearFlow();

            case 2:
                modificarFlow();
        }
    }


    private static void crearFlow()
    {
        System.out.println("### Sistema de Chatbots - Menú Flow - Crear flujo ###");
        // FLOW = id (Int) X nameMsg (String) X options (lista de 0 o más options)
        System.out.println("INTRODUZCA EL ID DEL FLOW:");
        int idFlow = scanner.nextInt();
        scanner.nextLine();
        System.out.println("INTRODUZCA EL NAMEMSG DEL FLOW:");
        String nameMsgFlow = scanner.nextLine();
        Flow_21133732_PachecoParra flowCrear = new Flow_21133732_PachecoParra(idFlow, nameMsgFlow, List.of());
        System.out.println(flowCrear);
        System.out.println("Se ha creado el Flow exitosamente.");
    }

    private static void modificarFlow() {
        System.out.println("### Sistema de Chatbots - Menú Flow - Agregar opción a flujo ###");
        System.out.println("INTRODUZCA EL ID DEL FLOW:");
        int idFlowAgregar = scanner.nextInt();
        scanner.nextLine();
        System.out.println("INTRODUZCA EL NAMEMSG DEL FLOW:");
        String nameMsgFlowAgregar = scanner.nextLine();
        System.out.println("INTRODUZCA EL CODE DEL OPTION:");
        int codeOptionAgregar = scanner.nextInt();
        scanner.nextLine();
        System.out.println("INTRODUZCA EL MESSAGE DEL OPTION:");
        String messageOptionAgregar = scanner.nextLine();
        System.out.println("INTRODUZCA EL CHATBOTCODELINK DEL OPTION:");
        int chatbotCodeLinkOptionAgregar = scanner.nextInt();
        scanner.nextLine();
        System.out.println("INTRODUZCA EL INITIALFLOWCODELINK DEL OPTION:");
        int initialFlowCodeLinkOptionAgregar = scanner.nextInt();
        scanner.nextLine();
        System.out.print("INTRODUZCA KEYWORDS DEL OPTION (separadas por espacio): ");
        String keywordsOptionAgregar = scanner.nextLine();
        Option_21133732_PachecoParra optionAgregar = new Option_21133732_PachecoParra(codeOptionAgregar, messageOptionAgregar, chatbotCodeLinkOptionAgregar, initialFlowCodeLinkOptionAgregar, List.of(keywordsOptionAgregar));
        Flow_21133732_PachecoParra flowAgregar = new Flow_21133732_PachecoParra(idFlowAgregar, nameMsgFlowAgregar, List.of(optionAgregar));
        System.out.println(flowAgregar);
        System.out.println("Se ha agregado el Option al Flow exitosamente.");
    }

    private static void menuChatbot() {
        // chatbotID (int) X name (String) X welcomeMessage (String) X startFlowId(int) X  flows (Lista de 0 o más flujos)
        System.out.println("### Sistema de Chatbots - Menú Chatbot ###");
        System.out.println("1. Crear chatbot");
        System.out.println("2. Agregar flujo a chatbot");
        System.out.println("3. Salir al menú principal");
        System.out.println("INTRODUZCA SU OPCIÓN:");
        int opcion = scanner.nextInt();
        scanner.nextLine();
        switch (opcion) {
            case 1:
                crearChatbot();
            case 2:
                modificarChatbot();
        }
    }

    private static void crearChatbot() {
        System.out.println("### Sistema de Chatbots - Menú Chatbot - Crear chatbot ###");
        System.out.println("INTRODUZCA EL CHATBOTID DEL CHATBOT:");
        int chatbotIDChatbot = scanner.nextInt();
        scanner.nextLine();
        System.out.println("INTRODUZCA EL NAME DEL CHATBOT:");
        String nameChatbot = scanner.nextLine();
        System.out.println("INTRODUZCA EL WELCOMEMESSAGE DEL CHATBOT:");
        String welcomeMessageChatbot = scanner.nextLine();
        System.out.println("INTRODUZCA EL STARTFLOWID DEL CHATBOT:");
        int startFlowIdChatbot = scanner.nextInt();
        scanner.nextLine();
        // la lista de flows se crea vacía
        Chatbot_21133732_PachecoParra chatbotCrear = new Chatbot_21133732_PachecoParra(chatbotIDChatbot, nameChatbot, welcomeMessageChatbot, startFlowIdChatbot, List.of());
        System.out.println(chatbotCrear);
        System.out.println("Se ha creado el Chatbot exitosamente.");
    }

    private static void modificarChatbot(){
        // chatbotAddFlow
        System.out.println("### Sistema de Chatbots - Menú Chatbot - Agregar flujo a chatbot ###");
        System.out.println("INTRODUZCA EL CHATBOTID DEL CHATBOT:");
        int chatbotIDChatbotAgregar = scanner.nextInt();
        scanner.nextLine();
        System.out.println("INTRODUZCA EL NAME DEL CHATBOT:");
        String nameChatbotAgregar = scanner.nextLine();
        System.out.println("INTRODUZCA EL WELCOMEMESSAGE DEL CHATBOT:");
        String welcomeMessageChatbotAgregar = scanner.nextLine();
        System.out.println("INTRODUZCA EL STARTFLOWID DEL CHATBOT:");
        int startFlowIdChatbotAgregar = scanner.nextInt();
        scanner.nextLine();
        System.out.println("INTRODUZCA EL ID DEL FLOW:");
        int idFlowAgregar = scanner.nextInt();
        scanner.nextLine();
        System.out.println("INTRODUZCA EL NAMEMSG DEL FLOW:");
        String nameMsgFlowAgregar = scanner.nextLine();
        scanner.nextLine();
        System.out.println("INTRODUZCA EL CODE DEL OPTION:");
        int codeOptionAgregar = scanner.nextInt();
        scanner.nextLine();
        System.out.println("INTRODUZCA EL MESSAGE DEL OPTION:");
        String messageOptionAgregar = scanner.nextLine();
        scanner.nextLine();
        System.out.println("INTRODUZCA EL CHATBOTCODELINK DEL OPTION:");
        int chatbotCodeLinkOptionAgregar = scanner.nextInt();
        scanner.nextLine();
        System.out.println("INTRODUZCA EL INITIALFLOWCODELINK DEL OPTION:");
        int initialFlowCodeLinkOptionAgregar = scanner.nextInt();
        scanner.nextLine();
        System.out.print("INTRODUZCA KEYWORDS DEL OPTION (separadas por espacio): ");
        String keywordsOptionAgregar = scanner.nextLine();
        Option_21133732_PachecoParra optionAgregar = new Option_21133732_PachecoParra(codeOptionAgregar, messageOptionAgregar, chatbotCodeLinkOptionAgregar, initialFlowCodeLinkOptionAgregar, List.of(keywordsOptionAgregar));
        Flow_21133732_PachecoParra flowAgregar = new Flow_21133732_PachecoParra(idFlowAgregar, nameMsgFlowAgregar, List.of(optionAgregar));
        Chatbot_21133732_PachecoParra chatbotAgregar = new Chatbot_21133732_PachecoParra(chatbotIDChatbotAgregar, nameChatbotAgregar, welcomeMessageChatbotAgregar, startFlowIdChatbotAgregar, List.of(flowAgregar));
        System.out.println(chatbotAgregar);
        System.out.println("Se ha agregado el Flow al Chatbot exitosamente.");
    }

    private static void visualizarChatbots() {
        // visualizar todos los chatbots existentes en el sistema
       // tener una lista de chatbots creados y mostrarlos
        System.out.println("### Sistema de Chatbots - Visualizar Chatbots ###");
    }

    private static void visualizarChatbotsConFlujos() {
        // visualizar todos los chatbots con sus flujos y opciones
        System.out.println("### Sistema de Chatbots - Visualizar Chatbots con Flujos ###");
    }

    private static void ejecutarSimulacion() {
        // ejecutar una simulación del sistema de chatbot
    }

    private static void mostrarMenuUsuarioNormal(String nombreUsuario) {
        System.out.println("### Sistema de Chatbots - Usuario Normal ###");
        System.out.println("Bienvenido " + nombreUsuario + " usted es un usuario normal.");
        System.out.println("1. Visualizar todos los chatbots existentes en el sistema");
        System.out.println("2. Visualizar todos los chatbots con sus flujos y opciones creadas");
        System.out.println("3. Ejecutar una simulación del sistema de chatbot");
        System.out.println("4. Salir");
        System.out.println("INTRODUZCA SU OPCIÓN:");

        int opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1:
                visualizarChatbots();
                break;
            case 2:
                visualizarChatbotsConFlujos();
                break;
            case 3:
                ejecutarSimulacion();
                break;
            case 4:
                // Salir
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }
}

// TO DO:
// 1- Para flowAddOption, chatbotAddFlow, systemAddChatbot crear funciones que busquen la option, el flow o el chatbot y se realice un append a la lista que deba almacenarlos
// 2- Implementar verificacion de tipos y errores en los input del usuario entregando sout de error y volviendo a pedir el input.
// 3- Crear la opciones del menuUsuarioNormal





