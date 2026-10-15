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
        double [] arrayNum = new double[10];

        for (int i = 0; i < arrayNum.length ; i++) {
            Scanner scan = new Scanner(System.in);
            IO.println("Indicame el numero " + (i+1));
            arrayNum [i] = scan.nextDouble();
        }
        //SE PUEDE CON UN FOR EACH O PONIENDO EN EL PRIMER BUCLE UN IO PRINT PARA QUE ENSEÑE EL VALOR DE LA POSICION.
        for (int j = 0; j < arrayNum.length; j++) {
            IO.println("La posicion " + j + " = " + arrayNum[j]);
        }

         */


        //EJERCICIO 2
        /*Crea un programa que pida diez números reales por teclado, los almacene en un array,
        y luego muestre la suma de todos los valores.
        */
        /*
        double [] arrayNum = new double[10];
        double suma = 0.0;

        for (int i = 0; i < arrayNum.length ; i++) {
            Scanner scan = new Scanner(System.in);
            IO.println("Indicame el numero " + (i + 1));
            arrayNum [i] = scan.nextDouble();
            suma = suma + arrayNum[i];
        }
        // LO ARREGLE PONIENDO LA SUMA DENTRO DEL PRIMER BUCLE
        for (int j = 0; j < arrayNum.length; j++) {
            suma = suma + arrayNum[j];
        }



        IO.println("La suma de todos los numeros es = " + suma);

         */

        //EJERCICIO 3
        /*Crea un programa que pida diez números reales por teclado, los almacene en un array,
        y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla.*/
        /*

        double [] arrayNum = new double[10];
        double mayor = arrayNum[0];
        // EL NUMERO MÁXIMO DE UN DOUBLE EN NEGATIVO SABIENDO QUE CUALQUIER NUMERO ES MAYOR QUE ESO
        // Y EL NUMERO MÁXIMO EN EL MINIMO PARA LO MISMO, CUALQUIER NUMERO ES MENOR QUE ESE
        // double maxE3 = - Double.MAX_VALUE, minE3 = Double.MAX_VALUE;


        for (int i = 0; i < arrayNum.length ; i++) {
            Scanner scan = new Scanner(System.in);
            IO.println("Indicame el numero " + (i + 1));
            arrayNum [i] = scan.nextDouble();
            //maxE3 = Math.max(numerosE3[i], maxE3);
            //minE3 = Math.min(numerosE3[i], minE3);
        }
        //IO.ptintln(maxE3);
        //IO.ptintln(minE3);
        for (int j = 1; j < arrayNum.length; j++) {
            if (arrayNum[j] > mayor) {
                mayor = arrayNum[j];
            }
        }
        double menor = arrayNum[0];

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
        int sumaPos = 0, sumaNeg = 0;

        for (int i = 0; i < arrayNum.length ; i++) {
            Scanner scan = new Scanner(System.in);
            IO.println("Indicame el numero " + (i + 1));
            arrayNum [i] = scan.nextInt();
            if (arrayNum[i] < 0){
                sumaPos += arrayNum[i];
            } else {
                sumaNeg += arrayNum[i];
            }
        }
        IO.println("La suma de todos los valores positivos es: " + sumaPos);
        IO.println("La suma de todos los valores negativos es: " + sumaNeg);

         */


        //EJERCICIO 5
        /*Crea un programa que pida veinte números reales por teclado, los almacene en un array
        y luego lo recorra para calcular y mostrar la media: (suma de valores) / nº de valores.*/
        /*
        double [] arrayNum = new double[20];
        double suma = 0.0;

        for (int i = 0; i < arrayNum.length ; i++) {
            Scanner scan = new Scanner(System.in);
            IO.println("Indicame el numero " + (i + 1));
            arrayNum [i] = scan.nextDouble();
            suma = suma + arrayNum[i];
        }
        //for (int j = 0; j < arrayNum.length; j++) {
            //suma = suma + arrayNum[j];
        //}
        double media = suma / arrayNum.length;
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

        //la creacion se puede meter en un if n > 0 se hace y si no, no.
        int [] arrayN = new int[N];
        //TAMBIEN CON UN SOLO FOR SE RELLENA Y SE PINTA, QUE ES MÁS EFICIENTE.
        Arrays.fill(arrayN,M);

        for (int arrayNN : arrayN) {
            IO.println(arrayNN);
        }

         */

        //EJERCICIO 7
        /*Crea un programa que pida dos valores enteros P y Q, luego cree un array que contenga
        todos los valores desde P hasta Q, y lo muestre por pantalla.*/
        /*
        //SI P ES 3 Y Q ES 7, EL ARRAY TIENE QUE RELLENARSE ASI: 3,4,5,6,7.
        int P;
        int Q;
        Scanner scan = new Scanner(System.in);
        IO.println("Introduce el primer numero: ");
        P = scan.nextInt();
        scan = new Scanner(System.in);
        IO.println("Introduce el segundo numero: ");
        Q = scan.nextInt();
        //POR SI EL USUARIO PONE NUM NEGATIVO PARA QUE SALGA BIEN
        int valor = Math.abs(Q - P) + 1;
        //POR SI Q ES MAYOR O MENOR QUE P
        int [] arrayN = new int[valor];
        for (int i = 0; i < valor; i++) {
            if (Q > P) {
                arrayN[i] = P + i;
            } else {
                arrayN[i] = Q + i;
            }
            IO.println(arrayN[i]);
        }

         */

        //EJERCICIO 8
        /*Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 y 1.0,
        utilizando Math.random(), y luego le pida al usuario un valor real R. Por último, mostrará
        cuántos valores del array son igual o superiores a R*/
        /*
        IO.println("EJERCICIO 8.");
        double[] arrayR = new double[100];
        int n = 0;
        for (int i = 0; i < arrayR.length; i++) {
            arrayR[i] = Math.random();
        }
        IO.println("Introduce un numero real: ");
        Scanner scan = new Scanner(System.in);
        double R = scan.nextDouble();
        //CREO UNA CONDICION CON IF PARA QUE SE CUMPLA Y SI NO, NO REALIZA EL PROCESO
        //BUCLE FOR PARA MIRAR SI SE CUMPLE LO PEDIDO EN EL ENUNCIADO, EN CASO DE QUE SI, SE VA SUMANDO
        //POR ULTIMO MUESTRO EL NUMERO
        //SE PODRIA HACER UN CONTADOR PARA MENORES Y EN EL DE MAYORES METER TAMBIEN LOS IGUALES
        if (R >= 0.0 && R <= 1.0){
            for (int j = 0; j < arrayR.length; j++) {
                if (R >= arrayR[j]) {
                    n++;
                    //IO.println(arrayR[j]);
                }
            }
            IO.println("La cantidad de valores que son igual o superiores a su numero es: " + n);
        } else {
            IO.println("Porfavor introduce un numero entre 0.0 y 1.0");
        }

         */

        //EJERCICIO 9
        /*Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con valores
        enteros aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego pedirá un valor N
        y mostrará en qué posiciones del array aparece N.
        */
        /*
        IO.println("EJERCICIO 9.");
        int[] arrayE = new int[100];
        for (int i = 0; i < arrayE.length; i++) {
            arrayE[i] = (int) (1 + (Math.random()*10));
        }
        IO.println("Introduce un numero entero: ");
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        if (N >= 1 && N <= 10){
            for (int j = 0; j < arrayE.length; j++) {
                if (N == arrayE[j]) {
                    IO.println("Tu numero aparece en la posicion: " + j);
                }
            }
        } else {
            IO.println("Porfavor introduce un numero entre 1 - 10.");
        }

         */

        //EJERCICIO 10
        /*Crea un programa para realizar cálculos relacionados con la altura (en metros) de
        personas. Pedirá un valor N y luego almacenará en un array N alturas introducidas por teclado. Luego mostrará
        la altura media, máxima y mínima, así como cuántas personas miden por encima y por debajo de la media.*/
        /*
        IO.println("EJERCICIO 10.");
        IO.println("Introduce el numero de alturas: ");
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        double A;
        double suma = 0;
        double[] arrayA = new double[N];
        for (int i = 0; i < arrayA.length; i++) {
            IO.println("Introduce la altura " + (i+1) + " en metros:");
            scan = new Scanner(System.in);
            A = Math.abs(scan.nextDouble());
            arrayA[i]= A;
            suma = suma + A;
        }
        Arrays.sort(arrayA);
        IO.println("La altura minima es: " + arrayA[0]);
        IO.println("La altura maxima es: " + arrayA[N-1]);
        double media = (suma / N);
        IO.println("La altura media es: " + media);
        int count = 0;
        int count2 = 0;
        for (int j = 0; j < arrayA.length; j++) {
            if (arrayA[j] > media){
                count++;
            }
            if (arrayA[j] < media){
                count2++;
            }
        }
        IO.println("La cantidad de personas que miden más que la media: " + count);
        IO.println("La cantidad de personas que miden menos que la media: " + count2);

         */

        //EJERCICIO 11
        /*Crea un programa que cree dos arrays de enteros de tamaño 100. Luego introducirá en
        el primer array todos los valores del 1 al 100. Por último, deberá copiar todos los valores
        del primer array al segundo array en orden inverso, y mostrar ambos por pantalla.*/
        /*
        IO.println("EJERCICIO 10.");
        int[] arrayUno = new int[100];
        int[] arrayDos = new int[100];
        //Voy a llenar los arrays con valores aleatorios para que tengan un sentido.
        for (int i = 0; i < arrayUno.length; i++) {
            arrayUno[i] = (int) (1 + (Math.random()*10));
        }

        for (int i = 0; i < arrayDos.length; i++) {
            arrayDos[i] = (int) (1 + (Math.random()*10));
        }

         */


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
