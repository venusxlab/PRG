void main() {
    /*Debe de pedir la cantidad total de números a almacenar al iniciar el programa.
     Debe de generar un menú con la siguiente estructura:
    o Modificar colección:
        ▪ Insertar número.
        ▪ Borrar número de una posición específica
        ▪ Modificar número de una posición específica.
    O Estadísticas de la colección:
        ▪ Media de todos los valores no nulos.
        ▪ Suma de todos los valores.
        ▪ Máximo de la colección
        ▪ Mínimo de la colección
    o Ampliar el valor de la colección.
    o Salir.
    */

    //Creo variables necesarias e inicializo scanner. Pido la longitud del array y lo inicializo.
    Scanner sc = new Scanner(System.in);
    IO.println("Introduzca la cantidad de números a almacenar: ");
    int n = sc.nextInt();
    if (n > 0) {
        int[] coleccion = new int[n];
        String opcion = "";
        int suma = 0;
        int media = 0;
        int maximo = -1;
        int minimo = 2147483647;

        //Do while para que lo haga las veces que quiera
        do {
            //Vuelvo a inicializar scanner para que no de error dentro del bucle o se repita dos veces
            sc = new Scanner(System.in);
            IO.println("Introduzca la opción que desee:");
            IO.println("- Modificar la colección (m) \n" + "- Estadísticas de la colección (e) \n"
                    + "- Ampliar el valor de la colección (ampliar) \n" + "- Salir (salir) \n");
            opcion = sc.nextLine();

            if (opcion.equalsIgnoreCase("m")) {
                IO.println("Introduzca la opción que desee para modificar la colección: " + "\n----------");
                IO.println("- Insertar numero. (i) \n" + "- Borrar numero de una posición especifica (b) \n"
                        + "- Modificar numero de una posición especifica (modificar) \n");
                opcion = sc.nextLine();

                //INSERTAR NÚMERO
                if (opcion.equalsIgnoreCase("i")) {
                    for (int i = 0; i < coleccion.length; i++) {
                        if (coleccion[i] > 0) {
                            IO.println("Numero existente en posición: " + (i + 1));
                        } else {
                            IO.println("Introduzca el numero " + (i + 1) + ": ");
                            coleccion[i] = Math.abs(sc.nextInt());
                        }
                    }
                    //BORRAR NÚMERO POSICIÓN ESPECIFICA
                } else if (opcion.equalsIgnoreCase("b")) {
                    int numeroBorrar = -1;
                    IO.println("Introduzca la posición del numero a borrar: ");
                    numeroBorrar = sc.nextInt();
                    if (coleccion[numeroBorrar] == 0) {
                        IO.println("No hay un numero en esa posición.");
                    } else {
                        coleccion[numeroBorrar] = 0;
                        IO.println("Se ha borrado correctamente.");
                    }
                    //MODIFICAR NÚMERO POSICIÓN ESPECIFICA
                } else if (opcion.equalsIgnoreCase("modificar")) {
                    IO.println("Indicame la posición del numero que quieres modificar: ");
                    int pNum = 0;
                    pNum = sc.nextInt();
                    IO.println(coleccion[pNum]);
                    IO.println("Introduce el numero: ");
                    int nCambio = 0;
                    nCambio = sc.nextInt();
                    coleccion[pNum] = nCambio;
                    IO.println(coleccion[pNum]);
                } else {
                    IO.println("Por favor, escoja una opción correcta.");
                }
                //ESTADÍSTICAS DE LA COLECCIÓN
            } else if (opcion.equalsIgnoreCase("e")) {
                IO.println("Introduzca la opción que desee sobre las estadísticas de la colección: " + "\n----------");
                IO.println("- Media de todos los valores. (media) \n" + "- Suma de todos los valores. (suma) \n"
                        + "- Maximo de la colección (max) \n" + "- Mínimo de la colección. (min) \n");
                opcion = sc.nextLine();
                if (opcion.equalsIgnoreCase("media")) {
                    //MEDIA DE TODOS LOS VALORES NO NULOS
                    for (int i = 0; i < coleccion.length; i++) {
                        if (coleccion[i] >= 0) {
                            suma = suma + coleccion[i];
                        }
                    }
                    if (suma == 0) {
                        IO.println("No había ningún numero dentro de la colección. No se puede realizar.");
                    } else {
                        media = suma / coleccion.length;
                        IO.println("La media de todos los valores es: " + media);
                        suma = 0;
                    }
                    //SUMA DE TODOS LOS VALORES
                } else if (opcion.equalsIgnoreCase("suma")) {
                    for (int i = 0; i < coleccion.length; i++) {
                        if (coleccion[i] >= 0) {
                            suma = suma + coleccion[i];
                        }
                    }
                    if (suma == 0) {
                        IO.println("No había ningún numero dentro de la colección. No se puede realizar.");
                    } else {
                        IO.println("La suma de todos los valores es: " + suma);
                    }
                    //NÚMERO MAXIMO DE LA COLECCIÓN
                } else if (opcion.equalsIgnoreCase("max")) {
                    for (int i = 0; i < coleccion.length; i++) {
                        if (coleccion[i] > maximo) {
                            maximo = coleccion[i];
                        }
                    }
                    IO.println("El numero máximo es: " + maximo);
                    //NÚMERO MÍNIMO DE LA COLECCIÓN
                } else if (opcion.equalsIgnoreCase("min")) {
                    for (int i = 0; i < coleccion.length; i++) {
                        if (coleccion[i] < minimo) {
                            minimo = coleccion[i];
                        }
                    }
                    IO.println("El numero mínimo es: " + minimo);
                } else {
                    IO.println("Escoja una opción correcta dentro de las Estadísticas.");
                }
                //AMPLIAR LONGITUD DEL ARRAY
            } else if (opcion.equalsIgnoreCase("ampliar")) {
                IO.println("Indicame la nueva longitud del array: ");
                int nuevaLongitud = 0;
                nuevaLongitud = sc.nextInt();
                int[] coleccionAmpliada = new int[nuevaLongitud];
                for (int i = 0; i < coleccion.length; i++) {
                    coleccionAmpliada[i] = coleccion[i];
                }
                coleccion = coleccionAmpliada;
            } else if (opcion.equalsIgnoreCase("salir")) {
                IO.println("Gracias por utilizar el programa, este se cerrara a continuación.");
            } else {
                IO.println("Por favor, escoja una opción correcta.");
            }

        } while (!opcion.equalsIgnoreCase("salir"));
    }else {
        IO.println("Por favor, introduzca un numero mayor que 0.");
    }

}