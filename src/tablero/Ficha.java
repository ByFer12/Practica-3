package src.tablero;

public class Ficha {
    private boolean esNegro;
    private char celda = '▒';
    private char celdaColor = '▓';
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public Ficha(boolean esNegro) {
        this.esNegro = esNegro;

    }

    public String getFichas() {
        String res = (esNegro) ? ANSI_BLUE + celda : "" + ANSI_WHITE + celda;

        return res;
    }

}
