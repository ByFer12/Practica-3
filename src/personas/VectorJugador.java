package src.personas;

import java.util.*;

public class VectorJugador {
    Scanner entrada = new Scanner(System.in);
    int aux = 0;
    int aux2;
    private Jugador[] jugadores = new Jugador[10];

    public VectorJugador() {
        desicion();

    }

    public void desicion() {
        int desicion;
        System.out.println("1) Ingresar nombres");
        System.out.println("2) Mostrar nombres");
        System.out.println("3) Elejir Jugador");
        desicion = entrada.nextInt();
        if (desicion == 1) {
            ingresarNombres();
        } else if (desicion == 2) {
            mostrarJugadores();
        } else if (desicion == 3) {
            elegirJugador();
        }
    }

    public void ingresarNombres() {

        String nombre;
        System.out.println("Ingresando jugadores...");

        int desicion;
        for (int i = aux; i < aux2 + 1; i++) {
            Scanner ent = new Scanner(System.in);
            System.out.println("Ingrese el nombre del jugador " + (i + 1) + ": ");
            nombre = ent.nextLine();
            jugadores[i] = new Jugador(nombre);

            System.out.println("Quiere ingresar mas jugadores \n1=Si\n2=No");
            desicion = ent.nextInt();
            if (desicion == 1) {
                aux++;
                aux2 = aux;

            } else {
                aux = 0;

            }

        }
        desicion();
    }

    public void mostrarJugadores() {
        System.out.println("JUGADORES");
        for (int i = 0; i < aux2 + 1; i++) {
            System.out.println("ID: " + (i) + " --> Nombre: " + jugadores[i].getNombre());

        }

    }

    public void elegirJugador() {
        int jugador1, jugador2;
        mostrarJugadores();
        System.out.println("Elija a dos jugadores segun su id ¿Quien desea jugar?");
        jugador1 = entrada.nextInt();
        buscarJugador(jugador1);
        System.out.println("Elija al siguiente jugador");
        jugador2 = entrada.nextInt();
        buscarJugador(jugador2);
        System.out.println("");
        System.out.println("Piedra papel o tijera...1,2,3");
        

    }

    public void buscarJugador(int it) {
        for (int i = 0; i < aux2 + 1; i++) {
            if (i == it) {
                System.out.println("ID: " + (i) + " --> Nombre: " + jugadores[i].getNombre());
            }

        }

    }



}
