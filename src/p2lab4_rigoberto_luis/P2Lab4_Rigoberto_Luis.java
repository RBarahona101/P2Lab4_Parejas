package p2lab4_rigoberto_luis;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class P2Lab4_Rigoberto_Luis {

static Random r = new Random();
static Scanner lea = new Scanner(System.in);

    public static void main(String[] args) {
        
        String [][]tabla = new String [10][10];
        ArrayList<String> nombres = new ArrayList();
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
                    
                    break;
                }
                case 2: {
                    
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
