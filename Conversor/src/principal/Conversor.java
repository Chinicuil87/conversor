package principal;

import java.awt.*;
import java.util.Scanner;
// Calse principal.
public class Conversor {
    public static void main(String[] args) {

        // Nuevo objeto scanner.
        Scanner sc = new Scanner(System.in);

        // Variables.
        String menu = """
                          MENU
                          
                1. Peso Mexicano a Dolar
                2. Dolar a Peso Mexicano
                3. Peso Mexicano a Euro
                4. Euro a Peso Mexicano
                5. Dolar a Euro
                6. Euro  a Dolar
                7. Otras divisas
                8. Consulta de conversiones
                9. Salir
                """;

        String separador = "--------------------------------------------------";

        boolean ejecutar = true;

        // Inicio del ciclo
    while (ejecutar){

        System.out.println(separador);

        System.out.println(menu);

        System.out.println(separador);

        System.out.print("Elige la opcion que deseas: ");
        int elecccion = sc.nextInt();

            // Ejecucion de la eleccion
        switch (elecccion){
            case 1:
                System.out.println(separador);
                System.out.println("Peso Mexicano a Dolar");
                System.out.println(separador);
                break;
            case 2:
                System.out.println(separador);
                System.out.println("Dolar a Peso Mexicano");
                System.out.println(separador);
                break;
            case 3:
                System.out.println(separador);
                System.out.println("Peso Mexicano a Euro");
                System.out.println(separador);
                break;
            case 4:
                System.out.println(separador);
                System.out.println("Euro a Peso Mexicano");
                System.out.println(separador);
                break;
            case 5:
                System.out.println(separador);
                System.out.println("Dolar a Euro");
                System.out.println(separador);
                break;
            case 6:
                System.out.println(separador);
                System.out.println("Euro  a Dolar");
                System.out.println(separador);
                break;
            case 7:
                System.out.println(separador);
                System.out.println("Otras divisas");
                System.out.println(separador);
                break;
            case 8:
                System.out.println(separador);
                System.out.println("Consulta de conversiones");
                System.out.println(separador);
                break;
            case 9:
                System.out.println(separador);
                System.out.println("        Finalizando programa");
                System.out.println("Gracias por usar el Converso de Monedas.");
                System.out.println("           Vuelve pronto.");
                System.out.println(separador);
                ejecutar = false;
                break;

        } // Final switch

    } // final while

    }// final main

} // final de la clase

