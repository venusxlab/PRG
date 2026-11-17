import java.util.Scanner;

public class MiUtils {
    private static String sysytem;

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
}
