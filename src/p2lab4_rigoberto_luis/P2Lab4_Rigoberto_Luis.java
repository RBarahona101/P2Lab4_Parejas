package p2lab4_rigoberto_luis;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class P2Lab4_Rigoberto_Luis {

static Random r = new Random();
static Scanner lea = new Scanner(System.in);
public static final String ANSI_RED = "\u001B[31m";
public static final String ANSI_BLUE = "\u001B[34m";
public static final String ANSI_RESET = "\u001B[om";

    public static void main(String[] args) {
        
        String [][]tabla = new String [10][10];
        ArrayList<String> nombres = new ArrayList();
        ArrayList<String> nombresv = new ArrayList();
        ArrayList<Jugador> jugadores = new ArrayList();
        ArrayList<Vehiculo> vehiculos = new ArrayList();
        
        boolean flag = true;
        while (flag == true){
            System.out.println("1) Agregar Jugador");
            System.out.println("2) Agregar Vehiculo");
            System.out.println("3) Crear Jugador Automaticamente");
            System.out.println("4) Crear Vehiculo Automaticamente");
            System.out.println("5) Listar Jugadores");
            System.out.println("6) Listar Vehiculos");
            System.out.println("7) Combate");
            System.out.println("8) Salir");
            System.out.print("Eligir Opcion: ");
            int opcion = lea.nextInt();
            switch(opcion){
                case 1: {
                    System.out.println("---Agregar Jugador---");
                    System.out.println("Ingrese el nombre del jugador");
                    String nombre = lea.next();
                    int victorias = 0;
                    jugadores.add( new Jugador( nombre, victorias));
                    break;
                }
                case 2: {
                    System.out.println("---Agregar Vehiculo---");
                    System.out.println("Ingrese el nombre del vehiculo");
                    String nombre = lea.next();
                    System.out.println("Ingrese el daño del vehiculo");
                    int daño = lea.nextInt();
                    System.out.println("Ingrese posicion X");
                    int X = lea.nextInt();
                    System.out.println("Ingrese posicion Y");
                    int Y = lea.nextInt();
                    String color = "";
                    Jugador conductor = new Jugador ("", 0);
                    System.out.println("Que tipo de vehiculo desea ingresar\n"
                            + "1) Avion\n"
                            + "2) Barco\n"
                            + "3) Submarino");
                    int tipo = lea.nextInt();
                    
                    switch (tipo){
                        case 1: {
                            vehiculos.add ( new Aviones (nombre, daño, X, Y, conductor, color));
                            System.out.println("Avion creado exitosamente");
                            break;
                        }
                        case 2: {
                            vehiculos.add ( new Barco (nombre, daño, X, Y, conductor, color));
                            System.out.println("Barco creado exitosamente");
                            break;
                        }
                        case 3: {
                            vehiculos.add ( new Submarino (nombre, daño, X, Y, conductor, color));
                            System.out.println("Submarino creado exitosamente");
                            break;
                        }
                        default: 
                            System.out.println("Opcion inexcistente");
                    }
                    break;
                }
                case 3: {
                    System.out.println("Esto no estaba antes");
                    System.out.println("Te odio Java");
                    System.out.println("Epico ");
                    break;
                }
                case 5: {
                    if (jugadores.isEmpty() ){
                        System.out.println("No Hay Jugadores");
                    } else{
                        String salida = "";
                        for (Object temp : jugadores) {
                            if (temp instanceof Jugador) {
                                salida += jugadores.indexOf(temp) + " - " + temp + "\n";
                            }
                        }
                        System.out.println(salida);
                    }
                    break;
                }
                case 6: {
                    if (vehiculos.isEmpty() ){
                        System.out.println("No Hay Vehiculos");
                    }else{
                        String salida = "";
                        for (Object temp : vehiculos) {
                            if (temp instanceof Vehiculo) {
                                salida += vehiculos.indexOf(temp) + " - " + temp + "\n";
                            }
                        }
                        System.out.println(salida);
                    }
                    break;
                }
            }
        }
    }
    
    public static void Imprimir(String [][] matriz){
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print("[ " + matriz[i][j] + " ]");            
            }
            System.out.println();
        }
    }
    
}
