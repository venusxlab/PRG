void main() {
    IO.println("Bienvenido al inicio para crear su cuenta bancaria.");
    //Guardo el IBAN y el titular en variables para hacerlo despues.
    IO.println("Introduzca el IBAN: (Ejemplo: ES1234567891234567891234)");
    Scanner sc = new Scanner(System.in);
    String iban = sc.nextLine();
    IO.println("Introduzca su nombre completo: (Ejemplo: Darlenis Severino)");
    String titular = sc.nextLine();
    //Mientras el metodo de falso se repite hasta que introduce un IBAN que cumpla el patron dado en el metodo
    while(!ValidarIban(iban)){
        IO.println("El iban introducido no es correcto, introduzca uno valido.");
        IO.println("Introduzca el IBAN correcto:");
        iban = sc.nextLine();
        ValidarIban(iban);
    }

    //Si el metodo devuelve true se hace el programa
    if (ValidarIban(iban)){
        //Creamos la cuenta
        CuentaBancaria nuevaCuenta = new CuentaBancaria(iban, titular);
        String opcion = "";
        do {
            //Vuelvo a inicializar scanner para que no de error dentro del bucle o se repita dos veces
            sc = new Scanner(System.in);
            IO.println("Introduzca la opción que desee:");
            IO.println("- Datos de la cuenta (d) \n" + "- Mostrar IBAN (i) \n"
                    + "- Mostrar el titular (t) \n" + "- Mostrar el saldo (s) \n"
                    + "- Ingresar Dinero (ingreso) \n" + "- Retirar Dinero (retirar) \n"
                    + "- Mostrar movimientos (m) \n" + "- Salir (salir) \n");
            opcion = sc.nextLine();
            //Mostrar informacion de la cuenta
            if (opcion.equalsIgnoreCase("d")){
                nuevaCuenta.infoCuentaBancaria();
            }
            //Mostrar IBAN
            else if (opcion.equalsIgnoreCase("i")) {
                IO.println("El IBAN de tu cuenta es: " + nuevaCuenta.getIban());
            }
            //Mostrar el titular
            else if (opcion.equalsIgnoreCase("t")) {
                IO.println("El titular de tu cuenta es: " + nuevaCuenta.getTitular());
            }
            //Mostrar el saldo
            else if (opcion.equalsIgnoreCase("s")) {
                IO.println("El saldo de tu cuenta es: " + nuevaCuenta.getSaldo() + "€");
            }
            //Ingresar dinero
            else if (opcion.equalsIgnoreCase("ingreso")) {

            }
            //retirar dinero
            else if (opcion.equalsIgnoreCase("retirar")) {

            }
            //Mostrar historial de movimientos
            else if (opcion.equalsIgnoreCase("m")) {
                //Recorrer array de movimientos
                //Teniendo en cuenta que no hay que recorrerlo todas las 100 posiciones si no está lleno.
            }
            //Salir del programa
            else if (opcion.equalsIgnoreCase("salir")) {

            }
            //Por si el usuario es tonto y pone cualquier otra cosa
            else {
                IO.println("Porfavor, introduzca una opcion correcta.");
            }

        }while (!opcion.equalsIgnoreCase("salir");
    }
}
//Metodo validar iban
public static boolean ValidarIban(String iban){
    Pattern patronIban = Pattern.compile("^ES\\d{2}\\d{22}$"); //dos letras y 22 numeros
    Matcher mat = patronIban.matcher(iban); //Devuelve verdadero o falso si el string cumple el patron compilado
    return mat.matches();
}