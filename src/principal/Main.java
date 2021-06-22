package src.principal;

import src.tablero.Tablero;
import src.personas.*;

public class Main {
    public static void main(String[] args) {

      VectorJugador v1= new VectorJugador();
      Tablero t1= new Tablero(8,8,false);
      t1.pintarTablero();
    }
    
}
