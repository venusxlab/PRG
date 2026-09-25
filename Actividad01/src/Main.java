import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Ejercicio 1: Escribe un programa que dé los “buenos días”.
         */

        //System.out.print("EJERCICIO 1");
        //System.out.println("Buenos dias!");

        /*
        Ejercicio 2: Escribe un programa que calcule y muestre el área de un cuadrado de lado igual a 5
         */

        //System.out.print("EJERCICIO 2");
        //double lado = 5;
        //System.out.println("El resultado del calculo del area de un cuadrado de lado igual a 5 es: " + (lado * lado));

        /*
        Ejercicio 3: Escribe un programa que calcule el área de un cuadrado cuyo lado se introduce por teclado.
         */
        /*
        System.out.print("EJERCICIO 3");
        double lado;
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduzca el numero del lado del cuadrado: ");
        lado = scan.nextDouble();
        System.out.println("El resultado del calculo del area del cuadrado es: " + (lado * lado));


         */
        /*
        Ejercicio 4: Escribe un programa que lea dos números, calcule y muestre el valor de sus suma, resta, producto y división.
         */

        /*
        System.out.print("EJERCICIO 4");
        double a;
        double b;
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduzca el primer numero: ");
        a = scan.nextDouble();
        scan = new Scanner(System.in);
        System.out.print("Introduzca el segundo numero: ");
        b = scan.nextDouble();
        System.out.println("El primer numero es: " + a);
        System.out.println("El segundo numero es: " + b);
        //double suma = a + b;
        System.out.println("La suma de los dos numeros es : " + (a + b));
        System.out.println("La resta de los dos numeros es : " + (a - b));
        System.out.println("El producto de los dos numeros es : " + (a * b));
        System.out.println("La division de los dos numeros es : " + (a / b));


         */

        /*
        Ejercicio 5: Escribe un programa que toma como dato de entrada un número que corresponde a la
longitud de un radio y nos escribe la longitud de la circunferencia, el área del círculo y el
volumen de la esfera que corresponden con dicho radio.
         */

        //PRIMERO DEFINO LAS VARIABLES Y PIDO LOS DATOS NECESARIOS PARA CADA APARTADO
        //AQUI SE VA A CALCULAR LA LONGITUD DE LA CIRCUNFERENCIA
        /*
        System.out.print("EJERCICIO 5");
        double PI = Math.PI;
        int radio;
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduzca la longitud del radio: ");
        radio = scan.nextInt();
        //System.out.print("La longitud de la circunferencia es: " + (2 * PI * radio));


        /*
        // AQUI SE VA A CALCULAR EL AREA DE UN CIRCULO
        System.out.println("La longitud de radio introducida es: " + radio);
        //PRIMERO GAURDO EL EXPONENTE QUE VOY A USAR PARA LA OPERACION MATEMATICA DENTRO DE UN DOUBLE
        double exponente1 = 2.0;
        //DESPUES CALCULO EL RADIO AL CUADRADO CON EL EXPONENTE ANTES GUARDADO
        double radio2 = Math.pow(radio, exponente1);
        //MIENTRAS LO MUESTRO EN PANTALLA HAGO EL CALCULO DEL AREA PARA MOSTRARLO ENTERO.
        System.out.print("El area del circulo es: " + (PI * radio2));
         */

        //AQUI SE VA A CALCULAR EL VOLUMEN DE UNA ESFERA
        /*
        double exponente2 = 3.0;
        double radio3 = Math.pow(radio, exponente2);
        System.out.print("El volumen de la esfera es: " + ((4/3.0)*PI*exponente2));
         */

        // EJERCICIO 6:  Escribe un programa que dado el precio de un artículo y el precio de venta real nos
        //muestre el porcentaje de descuento realizado.

        //PRIMERO PEDIMOS EL PRECIO ACTUAL CON DESCUENTO
        /*
        System.out.print("EJERCICIO 6");
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca el precio del articulo Actual: ");
        double precioActual = scan.nextDouble();
        //PEDIMOS DESPUES EL PRECIO ORIGINAL DEL ARTICULO
        scan = new Scanner(System.in);
        System.out.println("Introduzca el precio del articulo Real: ");
        double precioReal = scan.nextDouble();
        //MIENTRAS LO MOSTRAMOS EN PANTALLA REALIZAMOS EL CALCULO MOSTRANDO FINALMENTE EL PORCENTAJE DE DESCUENTO
        System.out.println("El porcentaje de descuento realizado es: " + ((precioReal - precioActual) / precioReal * 100 + "%"));

         */

        //EJERCICIO 7: Escribe un programa que lea un valor correspondiente a una distancia en millas marinas
        //y escriba la distancia en metros. Sabiendo que una milla marina equivale a 1.852 metros.
        /*
        System.out.println("EJERCICIO 7");
        //PRIMERO PEDIMOS EL NUMERO DE MILLAS
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca el numero de millas marinas: ");
        double millas = scan.nextDouble();
        //MOSTRAMOS EL TEXTO Y DESPUES CALCULO
        System.out.println("La distancia en metros es: " + (millas * 1852) + "m");

         */

        //EJERCICIO 8: Escribe un programa que lee dos números y los visualiza en orden ascendente.
        







    }
}