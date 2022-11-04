package p2lab4_rigoberto_luis;

public class Barco extends Vehiculo {

    public Barco() {
    }

    public Barco(String nombre, int dano, int X, int Y, Jugador conductor, String color) {
        super(nombre, dano, X, Y, conductor, color);
    }

    @Override
    public String toString() {
        return "Barco: " + nombre;
    }
    
}
