package p2lab4_rigoberto_luis;

public class Vehiculo {
    protected String nombre;
    protected int dano;
    protected int X;
    protected int Y;
    protected Jugador conductor;
    protected String color;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getX() {
        return X;
    }

    public void setX(int X) {
        this.X = X;
    }

    public int getY() {
        return Y;
    }

    public void setY(int Y) {
        this.Y = Y;
    }

    public Jugador getConductor() {
        return conductor;
    }

    public void setConductor(Jugador conductor) {
        this.conductor = conductor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Vehiculo() {
    }

    public Vehiculo(String nombre, int dano, int X, int Y, Jugador conductor, String color) {
        this.nombre = nombre;
        this.dano = dano;
        this.X = X;
        this.Y = Y;
        this.conductor = conductor;
        this.color = color;
    }
    
    
}
