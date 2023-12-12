
package org.example;

import java.util.*;

/**
 * Clase que representa el menu principal del sistema de chatbots
 * Proporciona metodos para mostrar el menu principal, el menu de opciones, el menu de flujos y el menu de chatbots.
 */

public class Menu_21133732_PachecoParra {
    private static Sistema_21133732_PachecoParra sistema;
    private static Map<Integer, Option_21133732_PachecoParra> opciones = new HashMap<>();
    private static Map<Integer, Flow_21133732_PachecoParra> flujos = new HashMap<>();
    private static Map<Integer, Chatbot_21133732_PachecoParra> chatbots = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);
    private static Map<String, Boolean> usuariosRegistrados = new HashMap<>();

    /**
     * Punto de entrada principal para mostrar el menú del sistema de chatbots.
     * Permite a los usuarios iniciar sesión, registrarse o salir del sistema.
     *
     * @param sistemaEntrante Sistema de chatbots actual
     */
    public static void main(Sistema_21133732_PachecoParra sistemaEntrante) {
        sistema = sistemaEntrante;
        while (true) {
            System.out.println("### Sistema de Chatbots - Inicio ###");
            System.out.println("1. Login de Usuario");
            System.out.println("2. Registro de Usuario");
            System.out.println("3. Salir");
            System.out.print("INTRODUZCA SU OPCION:");
            int opcion = 0;
            try {
                if (scanner.hasNextInt()) {
                    opcion = scanner.nextInt();
                    scanner.nextLine();
                } else {
                    System.out.println("Por favor, introduce un numero entero.");
                    scanner.nextLine();
                    continue;
                }
            } catch (NoSuchElementException e) {
                System.out.println("Error al leer la entrada. Por favor, reintente.");
                return;
            }
            switch (opcion) {
                case 1:
                    procesoLogin();
                    break;
                case 2:
                    procesoRegistro();
                    break;
                case 3:
                    System.out.println("Hasta luego!");
                    return;
                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
        }
    }

    /**
     * Maneja el proceso de inicio de sesión de los usuarios.
     * Autentica al usuario y muestra el menú correspondiente a su rol.
     */
    private static void procesoLogin() {
        System.out.println("### Sistema de Chatbots - Login ###");
        System.out.print("INTRODUZCA NOMBRE DE USUARIO:");
        String nombreUsuario = scanner.nextLine().toLowerCase();

        if (usuariosRegistrados.containsKey(nombreUsuario)) {
            mostrarMenuPrincipal(nombreUsuario, usuariosRegistrados.get(nombreUsuario));
        } else {
            System.out.println("Usuario no registrado. Por favor, registrese primero.");
        }
    }

    /**
     * Maneja el proceso de registro de nuevos usuarios.
     * Permite a los usuarios registrarse como usuarios normales o administradores.
     * @see User_21133732_PachecoParra
     */
    private static void procesoRegistro() {
        System.out.println("### Sistema de Chatbots - Registro ###");
        System.out.print("INTRODUZCA NOMBRE DE USUARIO:");
        String nombreUsuario = scanner.nextLine().toLowerCase();

        if (usuariosRegistrados.containsKey(nombreUsuario)) {
            System.out.println("El nombre de usuario ya esta registrado. Por favor, elija otro nombre.");
            return;
        }
        System.out.println("1. Registrar usuario normal");
        System.out.println("2. Registrar usuario administrador");
        System.out.print("INTRODUZCA SU OPCION:");
        try {
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
                    System.out.println("Opcion no valida.");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Por favor, introduce un número entero.");
            scanner.nextLine();
        }
    }

    /**
     * Muestra el menú principal, diferenciando entre usuarios normales y administradores.
     *
     * @param nombreUsuario Nombre del usuario
     * @param esAdministrador Indica si el usuario es administrador o no
     */
    private static void mostrarMenuPrincipal(String nombreUsuario, boolean esAdministrador) {
        if (esAdministrador) {
            mostrarMenuAdministrador(nombreUsuario);
        } else {
            mostrarMenuUsuarioNormal(nombreUsuario);
        }
    }

    /**
     * Muestra el menú principal para los usuarios administradores.
     * Permite acceder a los menús de opciones, flujos y chatbots.
     * También permite visualizar los chatbots existentes en el sistema y ejecutar una simulación.
     * @param nombreUsuario Nombre del usuario
     */
    private static void mostrarMenuAdministrador(String nombreUsuario) {
        boolean continuar = true;
        while (continuar) {
            System.out.println("### Sistema de Chatbots - Usuario Administrador ###");
            System.out.println("Bienvenido " + nombreUsuario + " usted es administrador.");
            System.out.println("1. Acceder al menu option");
            System.out.println("2. Acceder al menu flow");
            System.out.println("3. Acceder al menu chatbot");
            System.out.println("4. Visualizar todos los chatbots existentes en el sistema");
            System.out.println("5. Visualizar todos los chatbots con sus flujos y opciones creadas");
            System.out.println("6. Ejecutar una simulacion del sistema de chatbot");
            System.out.println("7. Sintesis del Chatbot");
            System.out.println("8. Simulacion entre Chatbots");
            System.out.println("9. Salir");
            System.out.print("INTRODUZCA SU OPCION:");
            try {
                int opcion = 0;
                if (scanner.hasNextInt()) {
                    opcion = scanner.nextInt();
                    scanner.nextLine();
                } else {
                    throw new InputMismatchException("Ingresa un numero entero");
                }

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
                    sintesisChatbot();
                    break;
                case 8:
                    simulacionEntreChatbots();
                    break;
                case 9:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
            } catch (InputMismatchException e) {
                System.out.println("Entrada no valida: " + e.getMessage());
                scanner.nextLine();
            }
        }
    }

    /**
     * Muestra el menú de opciones.
     * Permite crear y modificar opciones.
     * @return true si el usuario desea salir al menú anterior, false en caso contrario
     */
    private static boolean menuOption() {
        while (true) {
            System.out.println("### Sistema de Chatbots - Menu Option ###");
            System.out.println("1. Crear opcion");
            System.out.println("2. Modificar opcion");
            System.out.println("3. Salir al menu anterior");
            System.out.print("INTRODUZCA SU OPCION:");
            try {
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
                    System.out.println("Opcion no valida, intentelo nuevamente");
                    break;
            }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, introduce un numero entero.");
                scanner.nextLine();
            }
        }
    }

    /**
     * Muestra el menú crearOpcion
     * Permite crear una opcion
     * @return true si el usuario desea salir al menú anterior, false en caso contrario
     */
    private static void crearOpcion() {
        System.out.println("### Sistema de Chatbots - Menu Option - Crear opcion ###");
        System.out.print("INTRODUZCA EL CODE DEL OPTION:");
        int codeOption = scanner.nextInt();
        scanner.nextLine();

        if (opciones.containsKey(codeOption)) {
            System.out.println("Error: El codigo de opcion ya existe.");
            return;
        }

        System.out.print("INTRODUZCA EL MESSAGE DEL OPTION:");
        String messageOption = scanner.nextLine();

        System.out.print("INTRODUZCA EL CHATBOTCODELINK DEL OPTION:");
        int chatbotCodeLinkOption = scanner.nextInt();
        scanner.nextLine();

        System.out.print("INTRODUZCA EL INITIALFLOWCODELINK DEL OPTION:");
        int initialFlowCodeLinkOption = scanner.nextInt();

        System.out.print("INTRODUZCA KEYWORDS DEL OPTION (separadas por espacio): ");
        String keywordsInput = scanner.nextLine();
        List<String> keywordsOption = Arrays.asList(keywordsInput.split("\\s+"));

        Option_21133732_PachecoParra optionCrear = new Option_21133732_PachecoParra(codeOption, messageOption, chatbotCodeLinkOption, initialFlowCodeLinkOption, keywordsOption);
        opciones.put(codeOption, optionCrear);
        System.out.println(optionCrear);
        System.out.println("Se ha creado el Option exitosamente.");
    }

    /**
     * Muestra el menú modificarOpcion
     * Permite modificar una opcion
     * @return true si el usuario desea salir al menú anterior, false en caso contrario
     */
    private static void modificarOpcion() {
        System.out.println("### Sistema de Chatbots - Menu Option - Modificar opcion ###");
        System.out.print("INTRODUZCA EL CODE DEL OPTION:");
        int codeOptionModificar = scanner.nextInt();
        scanner.nextLine();

        if (!opciones.containsKey(codeOptionModificar)) {
            System.out.println("Error: El código de opcion no existe.");
            return;
        }

        System.out.print("INTRODUZCA EL MESSAGE DEL OPTION:");
        String messageOptionModificar = scanner.nextLine();

        System.out.print("INTRODUZCA EL CHATBOTCODELINK DEL OPTION:");
        int chatbotCodeLinkOptionModificar = scanner.nextInt();
        scanner.nextLine();

        System.out.print("INTRODUZCA EL INITIALFLOWCODELINK DEL OPTION:");
        int initialFlowCodeLinkOptionModificar = scanner.nextInt();
        scanner.nextLine();

        System.out.print("INTRODUZCA KEYWORDS DEL OPTION (separadas por espacio): ");
        String keywordsOptionModificar = scanner.nextLine();
        List<String> keywordsModificar = Arrays.asList(keywordsOptionModificar.split("\\s+"));

        Option_21133732_PachecoParra optionModificar = new Option_21133732_PachecoParra(codeOptionModificar, messageOptionModificar, chatbotCodeLinkOptionModificar, initialFlowCodeLinkOptionModificar, keywordsModificar);
        opciones.put(codeOptionModificar, optionModificar);
        System.out.println(optionModificar);
        System.out.println("Se ha modificado el Option exitosamente.");
    }

    /**
     * Muestra el menú de flujos.
     * Permite crear y modificar flujos.
     * @return true si el usuario desea salir al menú anterior, false en caso contrario
     */
    private static void menuFlow() {
        boolean continuar = true;
        while (continuar) {
        System.out.println("### Sistema de Chatbots - Menu Flow ###");
        System.out.println("1. Crear flujo");
        System.out.println("2. Agregar opcion a flujo");
        System.out.println("3. Salir al menu principal");
        System.out.print("INTRODUZCA SU OPCION:");
        try {
            int opcion = 0;
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Por favor, introduce un numero entero.");
                scanner.nextLine();
                continue;
            }

            switch (opcion) {
            case 1:
                crearFlow();
            case 2:
                modificarFlow();
            case 3:
                continuar = false;
                break;
            default:
                System.out.println("Opción no valida, intentelo nuevamente");
                break;
        }
        } catch (InputMismatchException e) {
            System.out.println("Por favor, introduce un numero entero.");
            scanner.nextLine();
        }
    }
}

    /**
     * Muestra el menú crearFlow
     * Permite crear un flujo
     * @return true si el usuario desea salir al menú anterior, false en caso contrario
     */
    private static void crearFlow()
    {
        System.out.println("### Sistema de Chatbots - Menu Flow - Crear flujo ###");
        System.out.print("INTRODUZCA EL ID DEL FLOW:");
        int idFlow = scanner.nextInt();
        scanner.nextLine();
        if (flujos.containsKey(idFlow)) {
            System.out.println("Error: Ya existe un flujo con ese ID.");
            return;
        }
        System.out.print("INTRODUZCA EL NAMEMSG DEL FLOW:");
        String nameMsgFlow = scanner.nextLine();
        Flow_21133732_PachecoParra flowCrear = new Flow_21133732_PachecoParra(idFlow, nameMsgFlow, new ArrayList<>());
        flujos.put(idFlow, flowCrear);
        System.out.println(flowCrear);
        System.out.println("Se ha creado el Flow exitosamente.");
    }

    /**
     * Muestra el menú modificarFlow
     * Permite agregar una opcion a un flujo
     * @return true si el usuario desea salir al menú anterior, false en caso contrario
     */
    private static void modificarFlow() {
        System.out.println("### Sistema de Chatbots - Menu Flow - Agregar opcion a flujo ###");
        System.out.print("INTRODUZCA EL ID DEL FLOW:");
        int idFlow = scanner.nextInt();
        scanner.nextLine();
        if (!flujos.containsKey(idFlow)) {
            System.out.println("Error: El flujo con el ID especificado no existe.");
            return;
        }
        Flow_21133732_PachecoParra flujoExistente = flujos.get(idFlow);
        System.out.print("INTRODUZCA EL CODE DEL OPTION:");
        int codeOption = scanner.nextInt();
        scanner.nextLine();
        if (!opciones.containsKey(codeOption)) {
            System.out.println("Error: La opcion con el codigo especificado no existe.");
            return;
        }
        Option_21133732_PachecoParra opcionExistente = opciones.get(codeOption);
        flujoExistente.flowAddOption(opcionExistente);

        System.out.println("Se ha agregado el Option al Flow exitosamente.");
        System.out.println(flujoExistente);
    }

    /**
     * Muestra el menú de chatbots.
     * Permite crear y modificar chatbots.
     * @return true si el usuario desea salir al menú anterior, false en caso contrario
     */
    private static void menuChatbot() {
        System.out.println("### Sistema de Chatbots - Menu Chatbot ###");
        System.out.println("1. Crear chatbot");
        System.out.println("2. Agregar flujo a chatbot");
        System.out.println("3. Salir al menu principal");
        System.out.print("INTRODUZCA SU OPCION:");
        int opcion = scanner.nextInt();
        scanner.nextLine();
        switch (opcion) {
            case 1:
                crearChatbot();
            case 2:
                modificarChatbot();
        }
    }

    /**
     * Muestra el menú crearChatbot
     * Permite crear un chatbot
     * @return true si el usuario desea salir al menú anterior, false en caso contrario
     */
    private static void crearChatbot() {
        System.out.println("### Sistema de Chatbots - Menu Chatbot - Crear chatbot ###");
        System.out.println("INTRODUZCA EL CHATBOTID DEL CHATBOT:");
        int chatbotIDChatbot = scanner.nextInt();
        scanner.nextLine();

        if (chatbots.containsKey(chatbotIDChatbot)) {
            System.out.println("Error: Ya existe un chatbot con ese ID.");
            return;
        }

        System.out.print("INTRODUZCA EL NAME DEL CHATBOT:");
        String nameChatbot = scanner.nextLine();
        System.out.print("INTRODUZCA EL WELCOMEMESSAGE DEL CHATBOT:");
        String welcomeMessageChatbot = scanner.nextLine();
        System.out.print("INTRODUZCA EL STARTFLOWID DEL CHATBOT:");
        int startFlowIdChatbot = scanner.nextInt();
        scanner.nextLine();
        Chatbot_21133732_PachecoParra chatbotCrear = new Chatbot_21133732_PachecoParra(chatbotIDChatbot, nameChatbot, welcomeMessageChatbot, startFlowIdChatbot, new ArrayList<>());
        chatbots.put(chatbotIDChatbot, chatbotCrear);
        System.out.println(chatbotCrear);
        System.out.println("Se ha creado el Chatbot exitosamente.");
    }

    /**
     * Muestra el menú modificarChatbot
     * Permite agregar un flujo a un chatbot
     * @return true si el usuario desea salir al menú anterior, false en caso contrario
     */
    private static void modificarChatbot(){
        System.out.println("### Sistema de Chatbots - Menu Chatbot - Agregar flujo a chatbot ###");
        System.out.print("INTRODUZCA EL ID DEL CHATBOT:");
        int idChatbot = scanner.nextInt();
        scanner.nextLine();
        if (!chatbots.containsKey(idChatbot)) {
            System.out.println("Error: El chatbot con el ID especificado no existe.");
            return;
        }
        Chatbot_21133732_PachecoParra chatbotExistente = chatbots.get(idChatbot);
        System.out.print("INTRODUZCA EL ID DEL FLOW:");
        int idFlow = scanner.nextInt();
        scanner.nextLine();
        if (!flujos.containsKey(idFlow)) {
            System.out.println("Error: El flujo con el ID especificado no existe.");
            return;
        }
        Flow_21133732_PachecoParra flujoExistente = flujos.get(idFlow);
        chatbotExistente.chatbotAddFlow(flujoExistente);
        System.out.println(chatbotExistente);
        System.out.println("Se ha agregado el Flow al Chatbot exitosamente.");
    }

    /**
     * Muestra todos los chatbots existentes en el sistema.
     * Si no hay chatbots registrados, muestra un mensaje de error.
     * @return true si el usuario desea salir al menú anterior, false en caso contrario
     * @see Sistema_21133732_PachecoParra#getChatbots()
     * @see Chatbot_21133732_PachecoParra#toString()
     */
    private static void visualizarChatbots() {
        System.out.println("### Sistema de Chatbots - Visualizar Chatbots ###");

        if (sistema == null || sistema.getChatbots().isEmpty()) {
            System.out.println("No hay chatbots registrados en el sistema.");
            return;
        }

        for (Chatbot_21133732_PachecoParra chatbot : sistema.getChatbots()) {
            System.out.println(chatbot);
        }
    }

    /**
     * Muestra todos los chatbots existentes en el sistema, con sus flujos y opciones.
     * Si no hay chatbots registrados, muestra un mensaje de error.
     * @return true si el usuario desea salir al menú anterior, false en caso contrario
     * @see Sistema_21133732_PachecoParra#getChatbots()
     * @see Chatbot_21133732_PachecoParra#getFlows()
     * @see Flow_21133732_PachecoParra#getOptions()
     * @see Option_21133732_PachecoParra#getMessage()
     */
    private static void visualizarChatbotsConFlujos() {
        if (sistema == null || sistema.getChatbots().isEmpty()) {
            System.out.println("No hay chatbots registrados en el sistema.");
            return;
        }

        for (Chatbot_21133732_PachecoParra chatbot : sistema.getChatbots()) {
            System.out.println("Chatbot: " + chatbot.getName());
            for (Flow_21133732_PachecoParra flujo : chatbot.getFlows()) {
                System.out.println("  Flujo: " + flujo.getNameMsg());
                for (Option_21133732_PachecoParra opcion : flujo.getOptions()) {
                    System.out.println("Opcion: " + opcion.getMessage());
                }
            }
        }
    }

    /**
     * Muestra el menú de simulación.
     * Permite ejecutar una simulación del sistema de chatbots.
     * @return true si el usuario desea salir al menú anterior, false en caso contrario
     * @see Sistema_21133732_PachecoParra#systemTalk()
     */
    private static void ejecutarSimulacion() {
        if (sistema.getUserLogeado() == null) {
            System.out.println("No hay ningún usuario logueado para ejecutar la simulacion.");
            return;
        }

        System.out.println("### Simulacion del Sistema de Chatbots ###");
        String input = "";
        Scanner scanner = new Scanner(System.in);
        while (!"salir".equalsIgnoreCase(input)) {
            System.out.println("Ingrese un mensaje para iniciar la simulacion o 'salir' para salir del menu:");
            input = scanner.nextLine();

            if (!"salir".equalsIgnoreCase(input)) {
                sistema.systemTalk();
            }
        }
    }

    /**
     * Muestra el menú de usuario normal.
     * Permite visualizar los chatbots existentes en el sistema, visualizar los chatbots con sus flujos y opciones, ejecutar una simulación, obtener la síntesis del chatbot y ejecutar una simulación entre chatbots.
     * @param nombreUsuario Nombre del usuario
     */
    private static void mostrarMenuUsuarioNormal(String nombreUsuario){
        boolean continuar = true;
        while (continuar) {
        System.out.println("### Sistema de Chatbots - Usuario Normal ###");
        System.out.println("Bienvenido " + nombreUsuario + " usted es un usuario normal.");
        System.out.println("1. Visualizar todos los chatbots existentes en el sistema");
        System.out.println("2. Visualizar todos los chatbots con sus flujos y opciones creadas");
        System.out.println("3. Ejecutar una simulacion del sistema de chatbot");
        System.out.println("4. Sintesis del Chatbot");
        System.out.println("5. Simulacion entre Chatbots");
        System.out.println("6. Salir");
        System.out.print("INTRODUZCA SU OPCION:");

            int opcion = 0;
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Por favor, introduce un número entero.");
                scanner.nextLine();
                continue;
            }

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
                sintesisChatbot();
                break;
            case 5:
                simulacionEntreChatbots();
                break;
            case 6:
                continuar = false;
                break;
            default:
                System.out.println("Opcion no válida.");
                break;
           }
        }
    }

    /**
     * Muestra el menú de sintesis del chatbot.
     * Permite obtener la sintesis del chatbot.
     * @return true si el usuario desea salir al menú anterior, false en caso contrario
     * @see Sistema_21133732_PachecoParra#systemSynthesis()
     */
    private static void sintesisChatbot() {
        if (sistema.getUserLogeado() == null) {
            System.out.println("No hay ningún usuario logueado para obtener la sintesis de Chatbots");
            return;
        }
        System.out.println("### Sintesis del Chatbot ###");
        System.out.println("Hola " + sistema.getUserLogeado().getUsername() + " bienvenido al sistema de sintesis");
        sistema.systemSynthesis();
    }

    /**
     * Muestra el menú de simulación entre chatbots.
     * Permite ejecutar una simulación entre chatbots.
     * @return true si el usuario desea salir al menú anterior, false en caso contrario
     * @see Sistema_21133732_PachecoParra#systemSimulate(int, int)
     */
    private static void simulacionEntreChatbots() {
        System.out.println("### Simulacion del Sistema de Chatbots ###");
        String input = "";
        Scanner scanner = new Scanner(System.in);

        while (!"salir".equalsIgnoreCase(input)) {
            System.out.println("Ingrese un mensaje para iniciar la simulacion o 'salir' para salir del menu:");
            input = scanner.nextLine();

            if (!"salir".equalsIgnoreCase(input)) {
                sistema.systemSimulate(10,123);
            }
        }
    }

    /**
     * Sincroniza los usuarios del sistema con los usuarios registrados (permite ir actualizando los usuarios del sistema).
     * @param usuariosSistema Lista de usuarios del sistema
     */
    public static void sincronizarUsuarios(List<User_21133732_PachecoParra> usuariosSistema) {
        for (User_21133732_PachecoParra usuario : usuariosSistema) {
            usuariosRegistrados.put(usuario.getUsername().toLowerCase(), usuario.esAdministrador());
        }
    }
}






