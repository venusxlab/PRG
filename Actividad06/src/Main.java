import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*EJERCICIO 1: Crea un programa que cree una matriz de tamaño 5x5 que almacene los números del 1 al 25
        y luego muestre la matriz por pantalla.*/
        /*
        IO.println("EJERCICIO 1.");
        int matriz[][] = new int[5][5];
        int n = 1;
        // Para cada fila
        for (int i = 0; i < matriz.length; i++) {
            // Para cada columna
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = n;
                n++;
                IO.print(matriz[i][j] + " ");
            }
            IO.println();
        }

         */

        /*EJERCICIO 2: Crea un programa que cree una matriz de 10x10 e introduzca los valores de las tablas de
        multiplicar del 1 al 10 (cada tabla en una fila). Luego mostrará la matriz por pantalla.
        */
        // PONGO 11 PARA QUE LLEGUE AL 10 INICIALIZADO DESDE LA POSICIÓN 1 EN VEZ DE 0
        /*
        IO.println("EJERCICIO 2.");
        int matriz2[][] = new int[10][10];
        // Para cada fila
        for (int i = 0; i < matriz2.length; i++) {
            // Para cada columna
            IO.println("Tabla de multiplicar del " + (i + 1) + " :");
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz2[i][j] = (i +1) *(j+1);
                IO.println((i + 1) + " x " + (i + 1) + " = " + matriz2[i][j]);
                //IO.print(matriz2[i][j] + " ");
            }
            IO.println("________________");
        }

         */

        /*EJERCICIO 3: Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por teclado) e
        introduzca en ella NxM valores (también introducidos por teclado). Luego deberá recorrer la
        matriz y al final mostrar por pantalla cuántos valores son mayores que cero, cuántos son
        menores que cero y cuántos son igual a cero.*/
        /*
        IO.println("EJERCICIO 3.");
        //PRIMERO PIDO EL TAMAÑO DEL ARRAY POR PANTALLA
        IO.println("Introduce el tamaño de las filas (N): ");
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        IO.println("Introduce el tamaño de las columnas (M): ");
        int M = scan.nextInt();
        //CREO VARIABLES QUE SERÁN UTILES MÁS ADELANTE
        // Para cada fila
        if (N > 0 && M > 0) {
            int valor = 0;
            int mayor0 = 0, menor0 = 0, igual0 = 0;
            int matriz3[][] = new int[N][M];
            for (int i = 0; i < matriz3.length; i++) {
                // Para cada columna
                for (int j = 0; j < matriz3[i].length; j++) {
                    IO.println("Intorduzca el valor: ");
                    valor = scan.nextInt();
                    matriz3[i][j] = valor;
                    if (matriz3[i][j] > 0) {
                        mayor0++;
                    } else if (matriz3[i][j] < 0) {
                        menor0++;
                    } else {
                        igual0++;
                    }
                }
            }
            IO.println("Numero de valores mayor que cero: " + mayor0);
            IO.println("Numero de valores menor que cero: " + menor0);
            IO.println("Numero de valores igual que cero: " + igual0);
        } else {
            IO.println("Los valores deben de ser enteros y positivos");
        }

         */

        /*EJERCICIO 4: Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados “Alumno
        1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las notas por teclado y luego el
        programa mostrará la nota mínima, máxima y media de cada alumno.*/
        /*
        IO.println("EJERCICIO 4.");
        //CREO VARIABLES QUE SERÁN UTILES MÁS ADELANTE
        int valor = 0;
        int maxima = 0, minima = 10, media = 0;
        int suma = 0;
        //4 ALUMNOS 5 NOTAS
        int matriz4[][] = new int[4][5];
        // Para cada fila (alumno)
        for (int i = 0; i < matriz4.length; i++) {
            // Para cada columna
            IO.println("Notas del alumno " + (i+1) + ":");
            for (int j = 0; j < matriz4[i].length; j++) {
                IO.println("Introduzca las notas del alumno " + (i+1) + ": ");
                Scanner scan = new Scanner(System.in);
                valor = scan.nextInt();
                matriz4[i][j] = valor;
                maxima = Math.max(matriz4[i][j], maxima);
                minima = Math.min(matriz4[i][j], minima);
                suma = suma + matriz4[i][j];
            }
            media = suma / matriz4[i].length;
            IO.println("La nota máxima del alumno " + (i+1) + "= " + maxima);
            IO.println("La nota minima del alumno " + (i+1) + "= " + minima);
            IO.println("La media del alumno " + (i+1) + "= " + media);
            maxima = 0;
            minima = 10;
            media = 0;
        }

        //MIRAR GITHUB DE ANUAR Y ENTENDER LO QUE HIZO MEJOR


         */

        /*EJERCICIO 5: Necesitamos crear un programa para registrar sueldos de hombres y mujeres de una empresa
        y detectar si existe brecha salarial entre ambos. El programa pedirá por teclado la información
        de N personas distintas (valor también introducido por teclado). Para cada persona, pedirá su
        género (0 para varón y 1 para mujer) y su sueldo. Esta información debe guardarse en una única
        matriz. Luego se mostrará por pantalla el sueldo medio de cada género.*/
        //NO LO HICE, COPIADO DE ANUAR
        IO.println("EJERCICIO 5.");
        Scanner scan = new Scanner(System.in);
        IO.println("Introduzca el numero de personas: ");
        int nPersonas = scan.nextInt();

        int [][] matriz5 = new int[nPersonas][2]; //numero de personas y por cada persona salario y genero.
        double mediaH = 0.0, mediaM = 0.0;
        int contadorH = 0, contadorM = 0;

        for (int i = 0; i < matriz5.length; i++) {
               scan = new Scanner(System.in);
               IO.println("Ingrese el genero de la persona 0 varon, 1 mujer: ");
               matriz5[i][0] = scan.nextInt();
                IO.println("Ingrese el valor del salario: ");
                matriz5[i][1] = scan.nextInt();

                if (matriz5[i][0] == 0.0){

                }
        }
    }
}
/*
public static void pintarMatriz (int[][] matriz) {
    for (int i = 0; i < matriz.length; i++) {
        // Para cada columna
        for (int j = 0; j < matriz[i].length; j++) {
            IO.print(matriz[i][j] + " ");
        }
        IO.println();
    }
}

 */