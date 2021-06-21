package src.tablero;

public class Tablero {
    private Celda[][] tablero;
    private final int x, y;

    public Tablero(int x, int y) {
        this.x = x;
        this.y = y;
        tablero = new Celda[x][y];
        inicializarTablero();
    }

    private void inicializarTablero() {
        boolean colorInicio = false;
        boolean colorInicialIteracion = false;
        for (int i = 0; i < y; i++) {
            colorInicialIteracion = !colorInicio;
            for (int j = 0; j < x; j++) {
                tablero[j][i] = new Celda(colorInicialIteracion);
                colorInicialIteracion = !colorInicialIteracion;

            }
            colorInicio = !colorInicio;
        }
    }

    public void pintarTablero() {
        for (int i = 0; i < y; i++) {
           for (int k = 0; k < 3; k++) {
                for (int j = 0; j < x; j++) {
                    System.out.print(tablero[j][i].pintarCelda(k));

                }
                System.out.println("");
            }

        }
    }

}
