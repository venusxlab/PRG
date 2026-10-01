import java.util.Scanner;

public class Actividad02 {
    public static void main(String[] args) {
        //EJEMPLOS DE SWITCH, IGNORAR.
        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca el mes: ");
        int mes = scan.nextInt();
        switch (mes) {
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
            default:
                System.out.println("Error: Introduzca un valor del 1 - 12.");
        }
        //SINTAXIS DE SWITCH MODERNA
        switch(opcion) {
            case "A" -> System.out.println("Lunes");
            case "B" -> {
                System.out.println("Martes");
            }

         */

        //EJERCICIO 1: Escribe un programa que pide la edad por teclado y nos muestra el mensaje de “Eres
        //mayor de edad” solo si lo somos
        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca su edad: ");
        int edad = scan.nextInt();
        if (edad>=18) {
            System.out.println("Eres mayor de edad");
        }


         */
        //EJERCICIO 2: Escribe un programa que pide la edad por teclado y nos muestra el mensaje de “eres
        //mayor de edad” o el mensaje de “eres menor de edad”.
        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca su edad: ");
        int edad = scan.nextInt();
        if (edad>=18 && edad <= 100) {
            System.out.println("Eres mayor de edad");
        } else if (edad <18 && edad >= 0){
            System.out.println("Eres menor de edad");
        } else {
            System.out.println("Porfavor introduzca un numero valido.");
        }

         */


        //EJERCICIO 3: Realiza un programa que muestre por pantalla los 20 primeros números naturales (1, 2,
        //3... 20).
        /*
        for(int i = 0; i <= 20; i++) {
            System.out.println(i);
        }

         */

        //EJERCICIO 4: Realiza un programa que muestre los números pares comprendidos entre el 1 y el 200.
        //Para ello utiliza un contador y suma de 2 en 2.
        /*
        int suma = 0;
        for(int i = 2; i <= 200; i = i + 2){
            System.out.println(i);
        }

         */

        //EJERCICIO 5: Realiza un programa que muestre los números pares comprendidos entre el 1 y el 200.
        //Esta vez utiliza un contador sumando de 1 en 1.
        /*
        int suma = 0;
        int i;
        for(i = 2; i <= 200; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }

         */

        //EJERCICIO 6: Realiza un programa que muestre los números desde el 1 hasta un número N que se
        //introducirá por teclado
        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca el numero máximo: ");
        int numMax = scan.nextInt();
        int i = 1;
        while(i <= numMax){
            System.out.println(i);
            i++;
        }

         */

        //EJERCICIO 7: Escribe un programa que lea una calificación numérica entre 0 y 10 y la transforma en
        //calificación alfabética, escribiendo el resultado.
        //• de 0 a <3 Muy Deficiente.
        //• de 3 a <5 Insuficiente.
        //• de 5 a <6 Bien.
        //• de 6 a <9 Notable
        //• de 9 a 10 Sobresaliente
        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca su nota: ");
        int nota = scan.nextInt();

        if (nota >= 0 && nota < 3) {
            System.out.println("Muy Deficiente");
        } else if (nota >= 3 && nota < 5) {
            System.out.println("Insuficiente");
        } else if (nota >= 5 && nota < 6) {
            System.out.println("Bien");
        } else if (nota >= 6 && nota < 9) {
            System.out.println("Notable");
        } else if (nota == 9 || nota == 10) {
            System.out.println("Sobresaliente");
        } else {
            System.out.println("Introduzca una nota valida porfavor.");
        }


         */

        //EJERCICIO 8: Realiza un programa que lea un número positivo N y calcule y visualice su factorial N!
        //Siendo el factorial:
        //• 0! = 1
        //• 1! = 1
        //• 2! = 2 * 1
        //• 3! = 3 * 2* 1
        //• N! = N * (N-1) * (N-2)........* 3*2*1
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca su numero positivo para calcular el factorial: ");
        int n = scan.nextInt();
        long fact;
        if (n < 0) {
            System.out.println("Por favor, introduzca un numero positivo.");
        } else {
            for (long i = 1; i <= n; i++) {
                fact = n * i;
            }

        }
        System.out.println(fact);


        //EJERCICIO 9: Escribe un programa que recibe como datos de entrada una hora expresada en horas,
        //minutos y segundos que nos calcula y escribe la hora, minutos y segundos que serán,
        //transcurrido un segundo.

        //EJERCICIO 10: Realiza un programa que lea 10 números no nulos y luego muestre un mensaje de si ha
        //leído algún número negativo o no.

        //EJERCICIO 11: Realiza un programa que lea 10 números no nulos y luego muestre un mensaje
        //indicando cuántos son positivos y cuantos negativos.

        //EJERCICIO 12: Realiza un programa que lea una secuencia de números no nulos hasta que se introduzca
        //un 0, y luego muestre si ha leído algún número negativo, cuantos positivos y cuantos
        //negativos.

        //EJERCICIO 13: Realiza un programa que calcule y escriba la suma y el producto de los 10 primeros
        //números naturales.

        //EJERCICIO 14:  Escribe un programa que calcula el salario neto semanal de un trabajador en función del
        //número de horas trabajadas y la tasa de impuestos de acuerdo a las siguientes hipótesis:
        //• Las primeras 35 horas se pagan a tarifa normal.
        //• Las horas que pasen de 35 se pagan a 1,5 veces la tarifa normal.
        //• Las tasas de impuestos son:
        //• Los primeros 500 euros son libres de impuestos.
        //• Los siguientes 400 tienen un 25% de impuestos.
        //• Los restantes un 45% de impuestos.
        //Escribir nombre, salario bruto, tasas y salario neto.
    }
}
