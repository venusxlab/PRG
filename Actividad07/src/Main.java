import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        /*Explicarle al jugador cómo se juega.
         Generar la jugada aleatoria del ordenador.
         Pedir al jugador su jugada mediante una letra (P para piedra, L para papel, T para tijeras,
        o S para salir terminando la partida):
         Decidir quién ha ganado.*/

        //Inicializo el scanner y creo la variable opcion que usare luego (le doy el valor s directamente para no dejarla vacia)
        Scanner sc = new Scanner(System.in);
        sc = new Scanner(System.in);
        String opcion = "S";
        //creo el contador del marcador tanto del usuario como del programa
        int contadorUsuario = 0;
        int contadorPrograma = 0;
        //Explico el juego al usuario antes de comenzar el programa.

        IO.println("Bienvenido al juego de Piedra, papel o tijera! ");
        IO.println("Primero deberá de escoger la jugada, y despues se mostrará por pantalla quien ha sido el ganador. ");
        IO.println("Tu como jugador tendrás un contador de rondas ganadas, al igual que el propio programa.");
        IO.println("Por cada ronda ganada se sumara 1 punto a tu contador, y si quedas empate, no se suma ningun punto!");
        IO.println("El juego se repetirá hasta que escoja la opción S (Salir). ");
        IO.println("Al terminar la partida se mostrará quien ha sido el ganador! Mucha suerte!");
        do {
            //Creo variable opcionAleatoria donde se generan 3 numeros aleatorios constantemente (1, 2 y 3)
            // MULTIPLICO X3 YA QUE SON SOLO 3 OPCIONES (1 PIEDRA, 2 PAPEL O 3 TIJERA)
            int opcionAleatoria = 1 + (int) (Math.random()*3);

            //Le indico al usuario las opciones
            IO.println("Por favor, escoja su jugada: ");
            IO.println("P) Piedra ");
            IO.println("L) Papel ");
            IO.println("T) Tijeras ");
            IO.println("S) Salir ");

            //Doy el valor a la variable opcion
            opcion = sc.nextLine();
            //creo un if para asegurarme de que el usuario introduzca si o si una de esas opciones, y si no lo hace que le diga que escoja bien
            if (opcion.equalsIgnoreCase("p") || opcion.equalsIgnoreCase("l") || opcion.equalsIgnoreCase("t") || opcion.equalsIgnoreCase("s")) {
                switch (opcion.toLowerCase()) {
                    //En caso de que el usuario escoja piedra
                    case "p" -> {
                        if (opcionAleatoria == 1) {
                            //Como ha escogido piedra y el programa tambien es empate, no sumo nada
                            IO.println("La opción aleatoria del programa ha sido Piedra!");
                            IO.println("Empate! Vuelve a intentarlo");
                            //Muestro el marcador para que sepa que tal va
                            IO.println("Marcador-------------");
                            IO.println("Programa: " + contadorPrograma + " |||||| Jugador: " + contadorUsuario);
                            IO.println("---------------------");
                        } else if (opcionAleatoria == 2) {
                            //Como ha escogido piedra y el programa papel, gana el programa, sumo 1 al contador programa
                            IO.println("La opción aleatoria del programa ha sido Papel!");
                            IO.println("Oh no! Ha ganado el programa, vuelve a intentarlo.");
                            contadorPrograma++;
                            //Muestro el marcador para que sepa que tal va
                            IO.println("Marcador-------------");
                            IO.println("Programa: " + contadorPrograma + " |||||| Jugador: " + contadorUsuario);
                            IO.println("---------------------");
                        } else {
                            //Como ha escogido piedra y el programa tijera, gana el usuario, sumo 1 al contador usuario
                            IO.println("La opción aleatoria del programa ha sido Tijera!");
                            IO.println("Muy bien! Has ganado esta ronda!");
                            contadorUsuario++;
                            //Muestro el marcador para que sepa que tal va
                            IO.println("Marcador-------------");
                            IO.println("Programa: " + contadorPrograma + " |||||| Jugador: " + contadorUsuario);
                            IO.println("---------------------");
                        }
                    }
                    //En caso de que el usuario escoja papel
                    case "l" -> {
                        if (opcionAleatoria == 1) {
                            //Como ha escogido papel y el programa piedra, gana el usuario, sumo 1 al contador usuario.
                            IO.println("La opción aleatoria del programa ha sido Piedra!");
                            IO.println("Muy bien! Has ganado esta ronda!");
                            contadorUsuario++;
                            IO.println("Marcador-------------");
                            IO.println("Programa: " + contadorPrograma + " |||||| Jugador: " + contadorUsuario);
                            IO.println("---------------------");
                        } else if (opcionAleatoria == 2) {
                            //Como ha escogido papel y el programa papel, gana el usuario, empate y no sumo nada
                            IO.println("La opción aleatoria del programa ha sido Papel!");
                            IO.println("Empate! Vuelve a intentarlo");
                            //Muestro el marcador para que sepa que tal va
                            IO.println("Marcador-------------");
                            IO.println("Programa: " + contadorPrograma + " |||||| Jugador: " + contadorUsuario);
                            IO.println("---------------------");
                        } else {
                            //Como ha escogido papel y el programa tijera, gana el programa, sumo 1 al contador programa
                            IO.println("La opción aleatoria del programa ha sido Tijera!");
                            IO.println("Oh no! Ha ganado el programa, vuelve a intentarlo.");
                            contadorPrograma++;
                            //Muestro el marcador para que sepa que tal va
                            IO.println("Marcador-------------");
                            IO.println("Programa: " + contadorPrograma + " |||||| Jugador: " + contadorUsuario);
                            IO.println("---------------------");
                        }
                    }
                    //En caso de que el usuario escoja tijera
                    case "t" -> {
                        if (opcionAleatoria == 1) {
                            //Como ha escogido tijera y el programa piedra, gana el programa, sumo 1 al contador programa
                            IO.println("La opción aleatoria del programa ha sido Piedra!");
                            IO.println("Oh no! Ha ganado el programa, vuelve a intentarlo.");
                            contadorPrograma++;
                            //Muestro el marcador para que sepa que tal va
                            IO.println("Marcador-------------");
                            IO.println("Programa: " + contadorPrograma + " |||||| Jugador: " + contadorUsuario);
                            IO.println("---------------------");
                        } else if (opcionAleatoria == 2) {
                            //Como ha escogido tijera y el programa papel, gana el usuario, sumo 1 al contador usuario
                            IO.println("La opción aleatoria del programa ha sido Papel!");
                            IO.println("Muy bien! Has ganado esta ronda!");
                            contadorUsuario++;
                            //Muestro el marcador para que sepa que tal va
                            IO.println("Marcador-------------");
                            IO.println("Programa: " + contadorPrograma + " |||||| Jugador: " + contadorUsuario);
                            IO.println("---------------------");
                        } else {
                            //Como ha escogido tijera y el programa tijera, es empate y no sumo nada
                            IO.println("La opción aleatoria del programa ha sido Tijera!");
                            IO.println("Empate! Vuelve a intentarlo");
                            //Muestro el marcador para que sepa que tal va
                            IO.println("Marcador-------------");
                            IO.println("Programa: " + contadorPrograma + " |||||| Jugador: " + contadorUsuario);
                            IO.println("---------------------");
                        }
                    }
                    case "s" -> {
                        //Muestro el marcador tambien por si acaso e indico que se cierra el programa
                        IO.println("Gracias por jugar! La partida ha terminado y el programa se cerrará.");
                        IO.println("Puntos del programa: " + contadorPrograma + " |||||| Puntos del usuario: " + contadorUsuario);
                        //creo if para saber quien ha ganado, perdido o si han empatado
                        if (contadorPrograma > contadorUsuario) {
                            IO.println("La partida la ha ganado el programa! Suerte para la proxima.");
                        } else if (contadorPrograma == contadorUsuario) {
                            IO.println("Habeis quedado empate! Muy bien jugado!");
                        } else {
                            IO.println("Has ganado la partida!");
                        }
                    }
                }
            } else {
                IO.println("Por favor, escoja una de las opciones dadas.");
            }

        }while (!opcion.equalsIgnoreCase("S"));


    }
}
