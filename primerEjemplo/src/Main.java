//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println("Hola Mundo!");
}*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int edad = 10000;
        //System.out.print("MI SALARIO ES: " + a);

        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca Su edad: ");
        edad = scan.nextInt();
        System.out.println("Su edad es: " + --edad);

    }
}