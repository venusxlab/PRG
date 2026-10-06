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
/*
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
        IO.println("Necesitas " + billeteQuinientos + " de quinientos" + ", " + billeteDoscientos + " De doscientos");
        IO.println(", " + billeteCien + " billetes de cien" + ", " + billeteCincuenta + " de cincuenta");
        IO.println(", " + billeteVeinte + " billetes de veinte" + ", " + billeteDiez + " de diez y " + billeteCinco + " billetes de cinco.");

 */
        /*
        Scanner sc = new Scanner(System.in);
        int dinero = 0;
        // la variable que voy restando para poder calcular y no tocar la variable principal por si hay que usarla
        int dineroRestante = 0;

        //Pido la cantidad de dinero comprobando que es multiplo de 5 y tomando el valor absoluto
        // tomo el valor absoluto por si introducen un valor negativo
        do {
            IO.println("Introduzca la cantidad de dinero en multiplo de 5: ");
            dinero = Math.abs(sc.nextInt());
        } while (dinero % 5 != 0);

        int n500 = 0, n200 = 0, n100 = 0, n50 = 0, n20 = 0, n10 = 0, n5 = 0;
        String textoDinero = "Se necesitan los siguientes billetes: \n";

        dineroRestante = dinero;
        if (dineroRestante >= 500) {
            n500 = dineroRestante / 500;
            dineroRestante = dineroRestante - (n500 * 500);
            textoDinero = textoDinero + "\n" + n500 + " billetes de 500";
        }
        if (dineroRestante >= 200) {
            n200 = dineroRestante / 200;
            dineroRestante = dineroRestante - (n200 * 200);
            textoDinero = textoDinero + "\n" + n200 + " billetes de 200";
        }
        if (dineroRestante >= 100) {
            n100 = dineroRestante / 100;
            dineroRestante = dineroRestante - (n100 * 100);
            textoDinero = textoDinero + "\n" + n100 + " billetes de 100";
        }
        if (dineroRestante >= 50) {
            n50 = dineroRestante / 50;
            dineroRestante = dineroRestante - (n50 * 50);
            textoDinero = textoDinero + "\n" + n50 + " billetes de 50";
        }
        if (dineroRestante >= 20) {
            n20 = dineroRestante / 20;
            dineroRestante = dineroRestante - (n20 * 20);
            textoDinero = textoDinero + "\n" + n20 + " billetes de 20";
        }
        if (dineroRestante >= 10) {
            n10 = dineroRestante / 10;
            dineroRestante = dineroRestante - (n10 * 10);
            textoDinero = textoDinero + "\n" + n10 + " billetes de 10";
        }
        if (dineroRestante >= 5) {
            n5 = dineroRestante / 5;
            dineroRestante = dineroRestante - (n5 * 5);
            textoDinero = textoDinero + "\n" + n5 + " billetes de 5";
        }

        IO.println(textoDinero);

         */


        /*EJERCICIO 2: Realiza un programa que muestre un menú de opciones como el siguiente:
        1. Sumar
        2. Restar
        3. Multiplicar
        4. Dividir (incluir manejo de división por 0)
        5. Salir
        El menú debe de repetirse hasta que se escoja la opción 5 (Salir)*/

        /*
        IO.println("Ejercicio 2.");
        String opcionMenu;
        Scanner scan = new Scanner(System.in);
        do {
            scan = new Scanner(System.in);
            IO.println("Introduce el primer numero: ");
            double n1 = scan.nextDouble();
            IO.println("Introduce el segundo numero: ");
            scan = new Scanner(System.in);
            double n2 = scan.nextDouble();
            IO.println("1. SUMAR \n" + "2 . RESTAR \n" + "3. MULTIPLICAR \n" + "4. DIVIDIR \n" + "5 SALIR");
            scan = new Scanner(System.in);
            opcionMenu = scan.nextLine();
            switch (opcionMenu){
                case "1" -> IO.println("La suma de " + n1 + " Y " + n2 + " Es : " + (n1+n2));
                case "2" -> IO.println("La resta de " + n1 + " Y " + n2 + " Es : " + (n1-n2));
                case "3" -> IO.println("La multiplicación de " + n1 + " Y " + n2 + " Es : " + (n1*n2));
                case "4" -> {
                    if (n1 == 0 || n2 == 0){
                        IO.println("La división de un numero entre 0 siempre es 0, porfavor, intentalo de nuevo");
                    } else {
                        IO.println("La división de " + n1 + " Y " + n2 + " Es : " + (n1/n2));
                    }
                }
                case "5" -> {
                    IO.println("Gracias por usar el programa, adios.");
                    break;
                }
                default -> IO.println("Introduzca una opcion entre 1 - 5.");
                }
        } while (!opcionMenu.equals("5"));

         */

    }
}
