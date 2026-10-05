import java.util.Scanner;
public class Actividad03 {
    public static void main(String[] args) {
    /*EJERCICIO 1: Realiza un programa que dada una cantidad de euros que el usuario introduce por
    teclado (múltiplo de 5 €) mostrará los billetes de cada tipo que serán necesarios para
    alcanzar dicha cantidad (utilizando billetes de 500, 200, 100, 50, 20, 10 y 5). Hay que
    indicar el mínimo de billetes posible. Por ejemplo, si el usuario introduce 145 el
    programa indicará que será necesario 1 billete de 100 €, 2 billetes de 20 € y 1 billete de
    5 € (no será válido por ejemplo 29 billetes de 5, que aunque sume 145 € no es el mínimo
    número de billetes posible).*/

        IO.println("Ejercicio 1");
        Scanner scan = new Scanner(System.in);
        IO.println("Introduce la cantidad de euros en multiplos de 5: ");
        double dinero = scan.nextDouble();
        int billeteQuinientos = 0, billeteDoscientos = 0, billeteCien = 0, billeteCincuenta = 0, billeteVeinte = 0;
        int billeteDiez = 0, billeteCinco = 0;

        if (dinero % 5 == 0) {
            if (dinero >= 500){
                billeteQuinientos++;
                dinero = dinero - 500;
                if (dinero != 0) {
                    if (dinero >= 200){
                        billeteDoscientos++;
                        dinero = dinero - 200;
                    } else if (dinero >= 100){
                        billeteCien++;
                        dinero  = dinero - 100;
                    } else if (dinero >= 50) {
                        billeteCincuenta++;
                        dinero = dinero - 50;
                    } else if (dinero >= 20) {
                        billeteVeinte++;
                        dinero = dinero - 20;
                    } else if (dinero >= 10){
                        billeteDiez++;
                        dinero = dinero - 10;
                    } else if (dinero >= 5) {
                        billeteCinco++;
                        dinero = dinero - 5;
                    }
                    IO.println("Te quedan: " + dinero);
                }
            }

        } else {
            IO.println("Porfavor introduce un multiplo de 5 para poder calcular los billetes.");
        }

        /*EJERCICIO 2: Realiza un programa que muestre un menú de opciones como el siguiente:
        1. Sumar
        2. Restar
        3. Multiplicar
        4. Dividir (incluir manejo de división por 0)
        5. Salir
        El menú debe de repetirse hasta que se escoja la opción 5 (Salir)*/
        /*
        IO.println("Ejercicio 2.");
        Scanner scan = new Scanner(System.in);
        IO.println("Introduzca la opción que desea elegir: ");
        int opcion = scan.nextInt();

         */

    }
}
