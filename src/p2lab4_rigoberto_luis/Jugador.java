package p2lab4_rigoberto_luis;


public class Jugador {
    private String nombre;
    private int victorias;

    public Jugador() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public Jugador(String nombre, int victorias) {
        this.nombre = nombre;
        this.victorias = victorias;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
