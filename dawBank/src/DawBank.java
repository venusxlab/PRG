void main() {
    IO.println("Bienvenido al inicio para crear su cuenta bancaria.");
    //Guardo el IBAN y el titular en variables para hacerlo despues.
    IO.println("Introduzca el IBAN: (Ejemplo: ES1234567891234567891234)");
    Scanner sc = new Scanner(System.in);
    String iban = sc.nextLine();
    IO.println("Introduzca su nombre completo: (Ejemplo: Darlenis Severino)");
    String titular = sc.nextLine();
    //Hago comprobacion para que no dejen vacio el titular.
    while (titular == null || titular == ""){
        IO.println("Porfavor, debe introducir un nombre correcto:");
        titular = sc.nextLine();
    }
    //Mientras el metodo de falso se repite hasta que introduce un IBAN que cumpla el patron dado en el metodo
    while(!ValidarIban(iban)){
        IO.println("El iban introducido no es correcto, introduzca uno valido.");
        IO.println("Introduzca el IBAN correcto:");
        iban = sc.nextLine();
        ValidarIban(iban);
    }

    //Si el metodo devuelve true y la variable titular no está vacia se ejecuta el programa
    if (ValidarIban(iban) && titular != null){
        //Creamos la cuenta
        CuentaBancaria nuevaCuenta = new CuentaBancaria(iban, titular);
        String opcion = "salir";

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
                IO.println(nuevaCuenta.infoCuentaBancaria());
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
                IO.println("Por favor, introduzca la cantidad en euros que desee ingresar:");
                String ingreso = sc.nextLine();
                //Comprobacion para que introduzcan solo numeros
                while (!soloNumeros(ingreso)){
                    IO.println("Error, porfavor, introduce un numero:");
                    ingreso = sc.nextLine();
                }
                //Convierto de string a double
                double cantidad = Double.valueOf(ingreso);
                //Dentro de la condicion se ejecuta el metodo que da true y si da false muestra error
                if (nuevaCuenta.ingresarDinero(cantidad)){
                    IO.println("Se ha ingresado dinero correctamente.");
                } else {
                    IO.println("No se ha podido ingresar el dinero, porfavor, vuelva a intentarlo.");
                }
                if(cantidad > 3000){
                    IO.println("AVISO: Notificar a hacienda.");
                }
            }
            else if (opcion.equalsIgnoreCase("retirar")) {
                IO.println("Por favor, introduzca la cantidad en euros que desee retirar:");
                String retirar = sc.nextLine();
                while (!soloNumeros(retirar)){
                    IO.println("Error, porfavor, introduce un numero:");
                    retirar = sc.nextLine();
                }
                double cantidad = Double.valueOf(retirar);
                //nuevaCuenta.retirarDinero(cantidad);
                if (nuevaCuenta.retirarDinero(cantidad)){
                    IO.println("Se ha retirado dinero correctamente.");
                } else {
                    IO.println("No se ha podido retirar el dinero, porfavor, vuelva a intentarlo.");
                }
                if(nuevaCuenta.getSaldo() < 0 && nuevaCuenta.getSaldo() >= -50){
                    IO.println("AVISO: Saldo negativo.");
                }
            }
            //Mostrar historial de movimientos
            else if (opcion.equalsIgnoreCase("m")) {
                //Recorrer array de movimientos
                //Teniendo en cuenta que no hay que recorrer todas las 100 posiciones si no está lleno.
                IO.println(nuevaCuenta.HistorialMovimientos());
            }
            //Salir del programa
            else if (opcion.equalsIgnoreCase("salir")) {
                IO.println("Gracias, se cerrara el menú a continuación.");
            }
            //Por si el usuario es tonto y pone cualquier otra cosa
            else {
                IO.println("Porfavor, introduzca una opcion correcta.");
            }

        } while(!opcion.equalsIgnoreCase("salir"));
    }
}
//Metodo validar iban
public static boolean ValidarIban(String iban){
    Pattern patronIban = Pattern.compile("^[A-Za-z]{2}\\d{22}$"); //dos letras y 22 numeros
    Matcher mat = patronIban.matcher(iban); //Devuelve verdadero o falso si el string cumple el patron compilado
    return mat.matches();
}

//Metodo introducir solo numeros (para que no de error grande java)
public static boolean soloNumeros(String numero){
    Pattern patronNumero = Pattern.compile("^\\d+(\\.\\d{1,2})?$");
    Matcher match = patronNumero.matcher(numero);
    return match.matches();
}