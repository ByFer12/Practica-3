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
    public Ficha getFicha(){
        Ficha tmp=this.ficha;
        this.ficha=null;
        return tmp;
    }

    public boolean ocupadoPorFicha(){
        return (ficha!=null);

    }

    public Celda(boolean esColor) {
        this.esColor = esColor;
        this.ficha = null;

    }
    public boolean esColor(){
        return this.esColor;
    }

    public String pintarCelda(int linea) {
        String res = "";
        if (esColor) {
           res =imprimir(ANSI_BLACK, linea);

        } else {
         res=imprimir(ANSI_RED, linea);

        }

        return res;

    }


    private String imprimir(String color, int linea){
        String res="";
        if (ficha != null) {
            if ((linea == 0) || (linea == 2))
                res = "" + color+ celdaColor+ celdaColor + ficha.getFichas() + ficha.getFichas()+ color + celdaColor+celdaColor
                        + celdaColor;
            if (linea == 1)
                res = "" + color + celdaColor + ficha.getFichas() + ficha.getId() +ficha.getFichas()+ color + celdaColor+celdaColor;

        } else {
            res = "" + color+ celdaColor + celdaColor + celdaColor + celdaColor + celdaColor + celdaColor + celdaColor;

        }


        return res;
    
    }
}
