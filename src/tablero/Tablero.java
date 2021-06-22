package src.tablero;


public class Tablero {
    private Celda[][] tablero;
    private final int x, y;
    private boolean juegoBlancas;

    public Tablero(int x, int y, boolean juegoBlancas) {
        this.juegoBlancas=juegoBlancas;
        this.x = x;
        this.y = y;
        tablero = new Celda[x][y];
        inicializarTablero();
        inicilizarFichas(0, 3, true,  "AA");
        inicilizarFichas(5, 8, false,"BB");
   
    }

    private void inicilizarFichas(int ini, int cant,boolean esBlanca, String id){
        for (int i = ini; i < cant; i++) {
            for (int j = 0; j < x; j++) {
                if(tablero[j][i].esColor()==!juegoBlancas){
                    tablero[j][i].setFicha(new Ficha(!esBlanca, id));
                    
                }
                
            }
        }

    }

    public boolean moverFicha(int xi,int yi,int xf,int yf){
        boolean resultado=false;
        if(tablero[xi][yi].ocupadoPorFicha()){
            if(!tablero[xf][yf].ocupadoPorFicha()){
                tablero[xf][yf].setFicha(tablero[xi][yi].getFicha());
            }
        }
        return resultado;

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
        System.out.println("\n\n\n");
    }

}
