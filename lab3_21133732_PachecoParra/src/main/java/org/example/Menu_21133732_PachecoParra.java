package org.example;

import java.util.Scanner;
import static java.lang.System.exit;

public class Menu_21133732_PachecoParra {
    // Menú de opciones con Scanner
    // 1. Crear un Option
    // 2. Crear un Flow
    // 3. Crear un Chatbot
    // 4. Crear un Sistema
    // 5. Salir

    // Menú Option
    // 1. Ingrese el código de la opción
    // 2. Ingrese el mensaje de la opción
    // 3. Ingrese el código del chatbot al que se vincula la opción
    // 4. Ingrese el código del flow al que se vincula la opción
    // 5. Ingrese las palabras claves de la opción

    // Menú Flow
    // 1. Ingrese el código del flow
    // 2. Ingrese el mensaje del flow
    // 3. Ingrese el código del chatbot al que se vincula el flow
    // 4. Ingrese las opciones del flow

    // Menú Chatbot
    // 1. Ingrese el código del chatbot
    // 2. Ingrese el nombre del chatbot
    // 3. Ingrese el mensaje de bienvenida del chatbot
    // 4. Ingrese el código del flow inicial del chatbot
    // 5. Ingrese los flows del chatbot

    // Menú Sistema
    // 1. Ingrese el nombre del sistema
    // 2. Ingrese el código del chatbot inicial del sistema
    // 3. Ingrese los chatbots del sistema
    // 4. Ingrese los usuarios registrados del sistema
    // 5. Ingrese el usuario logeado del sistema
    // 6. Ingrese el historial de mensajes del sistema

    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var selectedOption = 0;

        while (selectedOption != 5) {
            selectedOption = showMenu();
            switch (selectedOption) {
                case 1:
                    System.out.println("Ha seleccionado la opcion 1: Crear un Option");
                    System.out.println("Ingrese el codigo de la opcion y luego presione ENTER:");
                    var inputOptionCode = input.nextInt();
                    System.out.println("Ingrese el mensaje de la opcion y luego presione ENTER:");
                    var inputOptionMessage = input.next();
                    System.out.println("Ingrese el codigo del chatbot al que se vincula la opcion y luego presione ENTER:");
                    var inputOptionChatbotCode = input.nextInt();
                    System.out.println("Ingrese el codigo del flow al que se vincula la opcion y luego presione ENTER:");
                    var inputOptionFlowCode = input.nextInt();
                    System.out.println("Ingrese las palabras claves de la opcion y luego presione ENTER:");
                    var inputOptionKeywords = input.next();
                    break;
                case 2:
                    System.out.println("Ha seleccionado la opcion 2: Crear un Flow");
                    System.out.println("Ingrese el codigo del flow y luego presione ENTER:");
                    var inputFlowCode = input.nextInt();
                    System.out.println("Ingrese el mensaje del flow y luego presione ENTER:");
                    var inputFlowMessage = input.next();
                    System.out.println("Ingrese el codigo del chatbot al que se vincula el flow y luego presione ENTER:");
                    var inputFlowChatbotCode = input.nextInt();
                    System.out.println("Ingrese las opciones del flow y luego presione ENTER:");
                    var inputFlowOptions = input.next();
                    break;
                case 3:
                    System.out.println("Ha seleccionado la opcion 3: Crear un Chatbot");
                    System.out.println("Ingrese el codigo del chatbot y luego presione ENTER:");
                    var inputChatbotCode = input.nextInt();
                    System.out.println("Ingrese el nombre del chatbot y luego presione ENTER:");
                    var inputChatbotName = input.next();
                    System.out.println("Ingrese el mensaje de bienvenida del chatbot y luego presione ENTER:");
                    var inputChatbotWelcomeMessage = input.next();
                    System.out.println("Ingrese el codigo del flow inicial del chatbot y luego presione ENTER:");
                    var inputChatbotInitialFlowCode = input.nextInt();
                    System.out.println("Ingrese los flows del chatbot y luego presione ENTER:");
                    var inputChatbotFlows = input.next();
                    break;
                case 4:
                    System.out.println("Ha seleccionado la opcion 4: Crear un Sistema");
                    System.out.println("Ingrese el nombre del sistema y luego presione ENTER:");
                    var inputSystemName = input.next();
                    System.out.println("Ingrese el codigo del chatbot inicial del sistema y luego presione ENTER:");
                    var inputSystemInitialChatbotCode = input.nextInt();
                    System.out.println("Ingrese los chatbots del sistema y luego presione ENTER:");
                    var inputSystemChatbots = input.next();
                    System.out.println("Ingrese los usuarios registrados del sistema y luego presione ENTER:");
                    var inputSystemRegisteredUsers = input.next();
                    System.out.println("Ingrese el usuario logeado del sistema y luego presione ENTER:");
                    var inputSystemLoggedUser = input.next();
                    System.out.println("Ingrese el historial de mensajes del sistema y luego presione ENTER:");
                    var inputSystemChatHistory = input.next();
                    break;
                case 5:
                    exit(0);
                default:
                    System.out.println("Ingrese opcion correcta");
            }
        }
    }

    public static int showMenu() {

        var selectedOption = 0;
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Main Menu:");
        System.out.println("--------------");
        System.out.println("1.Crear un Option");
        System.out.println("2.Crear un Flow");
        System.out.println("3.Crear un Chatbot");
        System.out.println("4.Crear un Sistema");
        System.out.println("5.Salir");
        System.out.println("--------------");
        System.out.println("Ingrese su opcion (1,2 3, 4 o 5) y luego aprete tecla ENTER:");
        selectedOption = keyboardInput.nextInt();

        return selectedOption;
    }

}