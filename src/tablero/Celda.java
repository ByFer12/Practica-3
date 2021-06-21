package src.tablero;

public class Celda {
    private boolean esColor;
    private Ficha ficha;
    private char celda = '▒';
    private char celdaColor = '▓';
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_BLUE = "\u001B[31m";

    public Celda(boolean esColor) {
        this.esColor = esColor;
        this.ficha = null;

    }

    public String pintarCelda(int linea) {
        String res = "";
        if (esColor) {
            res=""+ANSI_WHITE+celda+celda+celda+celda+celda+celda+celda;
        } else {
            res=""+ANSI_BLUE+celdaColor+celdaColor+celdaColor+celdaColor+celdaColor+celdaColor+celdaColor;
        }

        return res;

    }
}
