package src.personas;

public class Jugador {
    private String nombre;
    private int punteo;
    private int ganados;
    private int perdidos;
    

    public Jugador(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPunteo() {
        return this.punteo;
    }

    public void setPunteo(int punteo) {
        this.punteo = punteo;
    }

    public int getGanados() {
        return this.ganados;
    }

    public void setGanados(int ganados) {
        this.ganados = ganados;
    }

    public int getPerdidos() {
        return this.perdidos;
    }

    public void setPerdidos(int perdidos) {
        this.perdidos = perdidos;
    }
}

    