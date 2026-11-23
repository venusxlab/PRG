import java.util.Scanner;

public class MiUtils {
    //Para leer double por pantalla y pedirlo.
    public static double leerDoublePantalla(String mensaje){
        Scanner sc = new Scanner(System.in);
        IO.println(mensaje);
        return sc.nextDouble();
    }

    //Para leer texto por pantalla y pedirlo.
    public static String leerTextoPantalla(String mensaje){
        Scanner sc = new Scanner(System.in);
        IO.println(mensaje);
        return sc.nextLine();
    }

    //Para comprobar patrones una sola vez.
    public static boolean comprobarPatron(String patron, String texto){
        boolean isOk = false;
        isOk = texto.matches(patron);
        return isOk;
    }

    //Comprobar patron repetidamente hasta que lo introduzca bien.
    public static String comprobarPatronRepetidamente(String patron, String mensaje){
        boolean isOk = false;
        String texto = "";

        do{
            texto = MiUtils.leerTextoPantalla(mensaje);
            isOk = MiUtils.comprobarPatron(patron, texto);
            if (!isOk){
                IO.println("El formato es incorrecto, vuelva a intentarlo.");
            }
        }while (!isOk);
        return texto;
    }

    //Se pasa un array con todas las opciones y el metodo las muestra por pantalla. Asi genera un menu de manera sencilla
    public void generarMenuOpciones(String[] opciones){
        IO.println("Por favor escoja la opcion deseada");
        if (opciones.length > 0){
            for (String opcion : opciones){
                IO.println(opcion);
            }
        }
    } // String [] opciones = {"1. Datos de la cuenta", "2. IBAN", "3. Titular", "4. Saldo",
    //"5. Ingreso", "6. Retirar", "7. Movimientos", "8. Salir"};
    // MiUtils.generarMenuOpciones(opciones);
}
}
