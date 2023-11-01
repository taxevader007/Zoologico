package ui;

import java.util.Scanner;
import model.Controller;


public class Main {
    private static final Scanner scan = new Scanner(System.in);
    private Controller controller;

    public Main() {
        controller = new Controller();
    }

    public static void main(String[] args) {
        Main m = new Main();
        int op = -1;

        do {
            m.menu();
            op = scan.nextInt();
            m.executeOption(op);

        } while (op != 0);

    }

    public void menu() {
        System.out.println("""
                0. Exit
                1.Informar si existen jaulas ocupadas con la misma cantidad de animales
                2.Encontrar las 3 jaulas con mayor porcentaje de ocupación.
                3.Encontrar la jaula con mayor cantidad de animales de la misma especie.
                4.Saber si es posible agregar un animal a una jaula

                """);
    }

    public void executeOption(int op) {
        switch (op) {
            case 0:
                System.out.println("bye");
                break;
            case 1:
                
                break;
            case 2:

                break;
            case 3:
                
                break;

            case 4:
                    
                    break;  
            default:
                System.out.println("Invalid");
                break;
        }
    }

    public void alquilarLocal() {

        System.out.println("Ingrese el identificador del usuario");
        String identificadorUsuario = scan.next();

        System.out.println("ingresa el tipo de lo local que quieres alquilar\n" +
            "1. local industrial\n" +
            "2. local persona natural\n" +
            "3. local especiales");
        int tipoLocal = scan.nextInt();

        

        switch (tipoLocal) {
            case 1 -> {
                // add code for case 1 here
            }
            case 2 -> {
                // add code for case 2 here
            }
            case 3 -> {
                // add code for case 3 here
            }
            default -> {
                System.out.println("invalido");
                break;
            }
        }
    }

    

}