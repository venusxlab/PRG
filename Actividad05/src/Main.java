import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*EJERCICIO 1: Crea un programa que pida una cadena de texto por teclado y luego muestre cada
        palabra de la cadena en una línea distinta.*/
        /*
        IO.println("EJERCICIO 1.");
        Scanner scan = new Scanner(System.in);
        IO.println("Dame la cadena de texto: ");
        String text = scan.nextLine();

        IO.println(text.replace(" ", "\n"));
        //IO.println(Arrays.toString(cadena));

         */


        /*EJERCICIO 2: Crea un programa que pida dos cadenas de texto por teclado y luego indique si son
        iguales, además de si son iguales sin diferenciar entre mayúsculas y minúsculas.*/
        /*
        IO.println("EJERCICIO 2.");
        Scanner scan = new Scanner(System.in);
        IO.println("Dame la primera cadena de texto: ");
        String textUno = scan.nextLine();
        scan = new Scanner(System.in);
        IO.println("Dame la segunda cadena de texto: ");
        String textDos = scan.nextLine();

        IO.println("Son iguales: " + textUno.equalsIgnoreCase(textDos));

         */

        /*EJERCICIO 3: Crea un programa que pida por teclado tres cadenas de texto: nombre y dos apellidos.
        Luego mostrará un código de usuario (en mayúsculas) formado por la concatenación de
        las tres primeras letras de cada uno de ellos. Por ejemplo, si se introduce “Lionel”,
        “Tarazón” y “Alcocer” mostrará “LIOTARALC”.*/
        /*
        IO.println("EJERCICIO 3.");
        Scanner scan = new Scanner(System.in);
        IO.println("Nombre: ");
        String nombre = scan.nextLine();
        scan = new Scanner(System.in);
        IO.println("Apellido Uno: ");
        String apellidoUno = scan.nextLine();
        scan = new Scanner(System.in);
        IO.println("Apellido Dos: ");
        String apellidoDos = scan.nextLine();

        String unoTres = nombre.substring(0,3);
        String dosTres = apellidoUno.substring(0,3);
        String tresTres = apellidoDos.substring(0,3);
        IO.println("Su código de usuario es: " + unoTres.toUpperCase() + dosTres.toUpperCase() + tresTres.toUpperCase());

         */

        /*EJERCICIO 4: Crea un programa que muestre por pantalla cuantas vocales de cada tipo hay (cuantas
            ‘a’, cuantas ‘e’, etc.) en una frase introducida por teclado. No se debe diferenciar entre
            mayúsculas y minúsculas. Por ejemplo, dada la frase “Mi mama me mima” dirá que hay:
            Nº de A's: 3
            Nº de E's: 1
            Nº de I's: 2
            Nº de O's: 0
            Nº de U's: 0

         */
        /*
        //pido por terminal la frase
        IO.println("EJERCICIO 4.");
        Scanner scan = new Scanner(System.in);
        IO.println("Escriba una frase: ");
        String frase = scan.nextLine();

        //pongo toda la frase en minusculas por si acaso.
        frase = frase.toLowerCase();

        //creo todas las variables de las vocales.
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;

        //creo un bucle para que recorra toda la frase y poder contar más tarde.
        for (int j = 0; j < frase.length(); j++) {
            //creo una variable que será la que recorra lera por letra de la frase
            char letra = frase.charAt(j);
            //creo ifs para cada letra, por lo visto funciona la comparacion sin las dibles comillas asi que las uso
            if (letra == 'a') {
                a++;
            } else if (letra == 'e') {
                e++;
            } else if (letra == 'i') {
                i++;
            } else if (letra == 'o') {
                o++;
            } else if (letra == 'u'){
                u++;
            }
        }
        IO.println("Numero de A: " + a);
        IO.println("Numero de E: " + e);
        IO.println("Numero de I: " + i);
        IO.println("Numero de O: " + o);
        IO.println("Numero de U: " + u);


         */

        /*EJERCICIO 5: Realiza un programa que lea una frase por teclado e indique si la frase es un palíndromo
        o no (ignorando espacios y sin diferenciar entre mayúsculas y minúsculas).
        Supondremos que el usuario solo introducirá letras y espacios (ni comas, ni puntos, ni
        acentos, etc.). Un palíndromo es un texto que se lee igual de izquierda a derecha que de
        derecha a izquierda.
        Por ejemplo:
        Amigo no gima
        Dabale arroz a la zorra el abad
        Amo la pacífica paloma
        A man a plan a canal Panama

         */
    }
}
