package src.personas;

public class Jugador {
    private String nombre;
    private int punteo;
    

    public Jugador(String nombre, int punteo) {
        this.nombre = nombre;
        this.punteo = punteo;
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
}