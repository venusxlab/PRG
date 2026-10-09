import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        //EJERCICIO 1
        /*Crea un programa que pida diez números reales por teclado, los almacene en un array,
        y luego muestre todos sus valores.
        */
        /*
        int [] arrayNum = new int[10];

        for (int i = 0; i < arrayNum.length ; i++) {
            Scanner scan = new Scanner(System.in);
            IO.println("Indicame el numero " + i);
            arrayNum [i] = scan.nextInt();
        }
        for (int j = 0; j < arrayNum.length; j++) {
            IO.println("La posicion " + j + " = " + arrayNum[j]);
        }

         */

        //EJERCICIO 2
        /*Crea un programa que pida diez números reales por teclado, los almacene en un array,
        y luego muestre la suma de todos los valores.
        */
        /*
        int [] arrayNum = new int[10];
        int suma = 0;

        for (int i = 0; i < arrayNum.length ; i++) {
            Scanner scan = new Scanner(System.in);
            IO.println("Indicame el numero " + (i + 1));
            arrayNum [i] = scan.nextInt();
        }
        for (int j = 0; j < arrayNum.length; j++) {
            suma = suma + arrayNum[j];
        }

        IO.println("La suma de todos los numeros es = " + suma);

         */


        //EJERCICIO 3
        /*Crea un programa que pida diez números reales por teclado, los almacene en un array,
        y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla.*/
        /*

        int [] arrayNum = new int[10];
        int mayor = arrayNum[0];

        for (int i = 0; i < arrayNum.length ; i++) {
            Scanner scan = new Scanner(System.in);
            IO.println("Indicame el numero " + (i + 1));
            arrayNum [i] = scan.nextInt();
        }
        for (int j = 1; j < arrayNum.length; j++) {
            if (arrayNum[j] > mayor) {
                mayor = arrayNum[j];
            }
        }
        int menor = arrayNum[0];

        for (int k = 1; k < arrayNum.length; k++) {
            if (arrayNum[k] < menor) {
                menor = arrayNum[k];
            }
        }

        IO.println("El numero mayor es = " + mayor + ", y el menor es = " + menor);

         */

        //EJERCICIO 4
        /*Crea un programa que pida veinte números enteros por teclado, los almacene en un
        array y luego muestre por separado la suma de todos los valores positivos y negativos.*/
        /*

        int [] arrayNum = new int[20];
        int suma = 0;

        for (int i = 0; i < arrayNum.length ; i++) {
            Scanner scan = new Scanner(System.in);
            IO.println("Indicame el numero " + (i + 1));
            arrayNum [i] = scan.nextInt();
        }
        for (int j = 0; j < arrayNum.length; j++) {
            suma = suma + arrayNum[j];
            IO.println("El resultado de la suma es: " + suma);
        }

         */


        //EJERCICIO 5
        /*Crea un programa que pida veinte números reales por teclado, los almacene en un array
        y luego lo recorra para calcular y mostrar la media: (suma de valores) / nº de valores.*/

        //MIRAR LA PÁGINA 5 DEL PDF DE LA UNIDAD DOS PARA CALCULAR LA MEDIA
        //USAR ESTE MISMO CÓDIGO.
        /*
        int [] arrayNum = new int[20];
        int suma = 0;

        for (int i = 0; i < arrayNum.length ; i++) {
            Scanner scan = new Scanner(System.in);
            IO.println("Indicame el numero " + (i + 1));
            arrayNum [i] = scan.nextInt();
        }
        for (int j = 0; j < arrayNum.length; j++) {
            suma = suma + arrayNum[j];
        }
        int media = suma / arrayNum.length;
        IO.println("La media de la suma de los 20 numeros es:  " + media);

         */

        //EJERCICIO 6
        /*Crea un programa que pida dos valores enteros N y M, luego cree un array de tamaño
        N, escriba M en todas sus posiciones y lo muestre por pantalla.*/
        /*
        int N;
        int M;
        Scanner scan = new Scanner(System.in);
        IO.println("Introduce el primer numero: ");
        N = scan.nextInt();
        scan = new Scanner(System.in);
        IO.println("Introduce el segundo numero: ");
        M = scan.nextInt();

        int [] arrayN = new int[N];
        Arrays.fill(arrayN,M);

        for (int arrayNN : arrayN) {
            IO.println(arrayNN);
        }

         */


        //EJERCICIO 7
        /*Crea un programa que pida dos valores enteros P y Q, luego cree un array que contenga
        todos los valores desde P hasta Q, y lo muestre por pantalla.*/

        //SI P ES 3 Y Q ES 7, EL ARRAY TIENE QUE RELLENARSE ASI: 3,4,5,6,7.
        /*
        int P;
        int Q;
        Scanner scan = new Scanner(System.in);
        IO.println("Introduce el primer numero: ");
        P = scan.nextInt();
        scan = new Scanner(System.in);
        IO.println("Introduce el segundo numero: ");
        Q = scan.nextInt();

        int valor = (Q - P) + 1;

        int [] arrayN = new int[valor];
        for (int i = 0; i < valor; i++) {
            arrayN[i] = P + i;
        }

        for (int num : arrayN) {
            IO.println(num);
        }

         */


        //EJERCICIO 8
        /*Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 y 1.0,
        utilizando Math.random(), y luego le pida al usuario un valor real R. Por último, mostrará
        cuántos valores del array son igual o superiores a R*/



        //EJERCICIO 9
        /*Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con valores
        enteros aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego pedirá un valor N
        y mostrará en qué posiciones del array aparece N.
        */

        //EJERCICIO 10
        /*Crea un programa para realizar cálculos relacionados con la altura (en metros) de
        personas. Pedirá un valor N y luego almacenará en un array N alturas introducidas por teclado. Luego mostrará
        la altura media, máxima y mínima, así como cuántas personas miden por encima y por debajo de la media.*/

        //EJERCICIO 11
        /*Crea un programa que cree dos arrays de enteros de tamaño 100. Luego introducirá en
        el primer array todos los valores del 1 al 100. Por último, deberá copiar todos los valores
        del primer array al segundo array en orden inverso, y mostrar ambos por pantalla.*/

        //EJERCICIO 12
        /*Crea un programa que cree un array de 10 enteros y luego muestre el siguiente menú
        con distintas opciones:
        a. Mostrar valores.
        b. Introducir valor.
        c. Salir.
        La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá un valor V y una
        posición P, luego escribirá V en la posición P del array. El menú se repetirá indefinidamente hasta
        que el usuario elija la opción ‘c’ que terminará el programa.
        */

        //EJERCICIO 13
        /*Crea un programa que permita al usuario almacenar una secuencia aritmética en un
        array y luego mostrarla. Una secuencia aritmética es una serie de números que
        comienza por un valor inicial V, y continúa con incrementos de I. Por ejemplo, con V=1
        e I=2, la secuencia sería 1, 3, 5, 7, 9… Con V=7 e I=10, la secuencia sería 7, 17, 27, 37… El
        programa solicitará al usuario V, I además de N (nº de valores a crear).*/

        //EJERCICIO 14
        /*Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de
        valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces, y luego la
        muestre por pantalla.*/

    }
}
