package src.tablero;

public class Celda {
    private boolean esColor;
    private Ficha ficha;
    private char celda = '▒';
    private char celdaColor = '▓';
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";

    public void setFicha(Ficha f){
        this.ficha=f;
    }

    public Celda(boolean esColor) {
        this.esColor = esColor;
        this.ficha = null;

    }

    public String pintarCelda(int linea) {
        String res = "";
        if (esColor) {
            if (ficha != null) {
                if ((linea == 0) || (linea == 2))
                    res = "" + ANSI_BLACK + celda + celda + ficha.getFichas() + ficha.getFichas()+ ANSI_BLACK + celda+celda+celda;
                if (linea == 1)
                    res = "" + ANSI_BLACK + celda + ficha.getFichas() + ficha.getFichas()+ficha.getFichas()+ficha.getFichas() + ANSI_BLACK + celda+celda;

            } else {
                res = "" + ANSI_BLACK + celdaColor + celdaColor + celdaColor + celdaColor + celdaColor + celdaColor + celdaColor;

            }

        } else {
            if (ficha != null) {
                if ((linea == 0) || (linea == 2))
                    res = "" + ANSI_RED + celdaColor+ celdaColor + ficha.getFichas() + ficha.getFichas()+ficha.getFichas() + ANSI_BLACK + celdaColor
                            + celdaColor;
                if (linea == 1)
                    res = "" + ANSI_RED + celdaColor + ficha.getFichas() + ficha.getFichas()+ficha.getFichas() + ANSI_BLACK + celdaColor+celdaColor+celdaColor;

            } else {
                res = "" + ANSI_RED + celdaColor + celdaColor + celdaColor + celdaColor + celdaColor + celdaColor + celdaColor;

            }

        }

        return res;

    }
}
