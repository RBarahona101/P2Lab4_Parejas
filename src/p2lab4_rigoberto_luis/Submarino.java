package p2lab4_rigoberto_luis;

public class Submarino extends Vehiculo {

    public Submarino() {
    }

    public Submarino(String nombre, int dano, int X, int Y, Jugador conductor, String color) {
        super(nombre, dano, X, Y, conductor, color);
    }

    @Override
    public String toString() {
        return "Submarino: " + nombre;
    }
    
}
