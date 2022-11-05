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
        nombres.add("Rigoberto");
        nombres.add("Carlos");
        nombres.add("Luis");
        nombres.add("Jose");
        nombres.add("Beto");
        nombres.add("Lucy");
        nombres.add("Valeria");
        nombres.add("Fernando");
        nombres.add("Leo");
        nombres.add("Andres");
        nombres.add("Nuila");
        nombres.add("Esther");
        nombres.add("Ingrid");
        nombres.add("Pedro");
        nombres.add("Hector");
        nombres.add("Tavo");
        nombres.add("Gerson");
        nombres.add("Elias");
        nombres.add("Mia");
        nombres.add("Jessica");
        nombres.add("Maria");
        nombres.add("Marlon");
        nombres.add("Lucas");
        nombres.add("Marco");
        nombres.add("Oscar");
        nombres.add("Yahir");
        nombres.add("Meleodas");
        nombres.add("Neo");
        nombres.add("Carmen");
        nombres.add("Mark");
        ArrayList<String> nombresv = new ArrayList();
        nombresv.add("Halcon");
        nombresv.add("Ala-X");
        nombresv.add("Caza-TIE");
        nombresv.add("Destructor");
        nombresv.add("Lanzador");
        nombresv.add("El-Rubi");
        nombresv.add("Control");
        nombresv.add("Supreme");
        nombresv.add("Tfire");
        nombresv.add("Aventador");
        nombresv.add("Locomotora");
        nombresv.add("Luz");
        nombresv.add("Boom");
        nombresv.add("Brim");
        nombresv.add("Jett");
        nombresv.add("Phoenix");
        nombresv.add("Clutch");
        nombresv.add("Sova");
        nombresv.add("Cypher");
        nombresv.add("Sage");
        nombresv.add("Killjoy");
        nombresv.add("Omen");
        nombresv.add("Ben");
        nombresv.add("Razw");
        nombresv.add("Breach");
        nombresv.add("Reyna");
        nombresv.add("Yoru");
        nombresv.add("KAY/O");
        nombresv.add("Neon");
        nombresv.add("Astra");
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
                    System.out.print("Cantidad de Jugadores a Generar: ");
                    try{
                        int cant = lea.nextInt();
                        for (int i = 0; i < cant; i++){
                            int j = r.nextInt(nombres.size() );
                            String nombre = nombres.get(j);
                            jugadores.add( new Jugador(nombre, 0) );
                        }
                        System.out.println("Generacion Exitosa");
                    } catch (Exception e){
                        System.out.println("Hubo un Error");
                    }
                    break;
                }
                case 4: {
                    System.out.print("Cantidad a Vehiculos a Generar: ");
                    try{
                        int cant = lea.nextInt();
                        for (int i = 0; i < cant; i++){
                            int j = r.nextInt(2);
                            int z = r.nextInt(nombresv.size());
                            String nombre = nombresv.get(z);
                            int dano = 100 + r.nextInt(150);
                            int X = r.nextInt(9);
                            int Y = r.nextInt(9);
                            Jugador conductor = new Jugador ("", 0);
                            String color = "";
                            switch(j) {
                                case 0: {
                                    vehiculos.add( new Aviones (nombre, dano, X, Y, conductor, color ) );
                                    break;
                                }
                                case 1: {
                                    vehiculos.add( new Barco ( nombre, dano, X , Y , conductor, color ) );
                                    break;
                                }
                                case 2: {
                                    vehiculos.add( new Submarino ( nombre, dano, X, Y, conductor, color ) );
                                    break;
                                }
                            }
                        }
                        System.out.println("Generacion Exitosa");
                    } catch (Exception e){
                        System.out.println("Hubo un Error");
                    }
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
                case 7: {
                    if (jugadores.isEmpty() || vehiculos.isEmpty() ){
                        System.out.println("No se puede jugar aun");
                    }else{
                        int cant = r.nextInt(vehiculos.size());

                        ArrayList<Vehiculo> Rojo = new ArrayList();
                        ArrayList<Vehiculo> Azul = new ArrayList();

                        ArrayList<Vida> R_Vida = new ArrayList();
                        ArrayList<Vida> A_Vida = new ArrayList();

                        for (int i = 0; i < Rojo.size(); i++) {
                            R_Vida.add(new Vida(500 + r.nextInt(500)));
                            A_Vida.add(new Vida(500 + r.nextInt(500)));
                        }
                        int cycle = 0;

                        while (cycle < cant) {
                            int x = r.nextInt(jugadores.size());
                            int y = r.nextInt(vehiculos.size());
                            
                            vehiculos.get(y).setConductor(jugadores.get(x));
                            vehiculos.get(y).setColor("Rojo");
                            Rojo.add(vehiculos.get(y));
                            
                            x = r.nextInt(jugadores.size());
                            y = r.nextInt(vehiculos.size());
                            
                            vehiculos.get(y).setConductor(jugadores.get(x));
                            vehiculos.get(y).setColor("Azul");
                            Azul.add(vehiculos.get(y));
                            
                            cycle++;
                        }
                        System.out.println("Equipos Cargados");
                        System.out.println("====================================================");
                        boolean juego = true;
                        boolean empate = false;
                        tabla = Fill(tabla, Rojo, Azul);
                        Imprimir(tabla);
                        while(juego == true){
                            tabla = Juego(tabla,Azul,Rojo,R_Vida,A_Vida);
                            Imprimir(tabla);
                            for (int i = 0; i < tabla.length; i++){
                                for (int j = 0; j < tabla[i].length; j++){
                                    
                                }
                            }
                            if (Rojo.isEmpty() || Azul.isEmpty() ){
                                juego = false;
                            }
                        }
                        if (Rojo.isEmpty() ){
                            System.out.println("El Equipo Azul Ha Ganado!");
                            for (int i = 0; i < Azul.size(); i++){
                                int victorias = Azul.get(i).getConductor().getVictorias() + 1;
                                Azul.get(i).getConductor().setVictorias(victorias);
                            }
                        } else if (Azul.isEmpty() ){
                            System.out.println("El Equipo Rojo Ha Ganado!");
                            for (int i = 0; i < Rojo.size(); i++){
                                int victorias = Rojo.get(i).getConductor().getVictorias() + 1;
                                Rojo.get(i).getConductor().setVictorias(victorias);
                            }
                        }
                    }
                    break;
                }
                default:{
                    flag = false;
                    break;
                }
            }
        }
    }
    
    public static void Imprimir(String [][] tabla){
        for (int i = 0; i < tabla.length; i++){
            for (int j = 0; j < tabla[i].length; j++){
                    System.out.print("[" + tabla[i][j] + "]"); 
                
            }
            System.out.println();
        }
    }
    public static String [][] Juego (String [][] tabla, ArrayList<Vehiculo> Azul, ArrayList<Vehiculo> Rojo, ArrayList<Vida>R_Vida, ArrayList<Vida> A_Vida){
        // X = j y Y = i
        String [][] temp = tabla;
        int cont = 0;
        int turno = 1;
        int contR = 0;
        int contA = 0;
        try{
            while (cont < Rojo.size() + Azul.size() ){
                if (turno%2 != 0){
                    int Y = 0;
                    int X = 0;
                    if (Rojo.get(contR) instanceof Aviones){
                        for (int i = 0; i < temp.length; i++){
                            for (int j = 0; j < temp[i].length; j++){
                                if (temp[i][j] == "A" + contR){
                                    Y = i;
                                    X = j;
                                }
                            }
                        }
                        for (int i = Y; i < temp.length; i++){
                            for (int j = 0; j < Azul.size(); j++){
                                if (temp[i][X] == "b"+j){
                                    int dano = 100 + r.nextInt(150);
                                    int vida = A_Vida.get(j).getVida() - dano;
                                    A_Vida.get(j).setVida(vida);
                                    if (vida <= 0){
                                        A_Vida.remove(j);
                                        Azul.remove(j);
                                    }
                                }
                            }
                        }
                        temp[Y][X] = "  ";
                        boolean repeat = true;
                        while(repeat == true){
                            X = r.nextInt(temp.length);
                            Y = r.nextInt(4);
                            if (temp[Y][X] == "  "){
                                temp[Y][X] = "A" + contR;
                                repeat = false;
                            }
                        }
                    } else if (Rojo.get(contR) instanceof Barco){
                        for (int i = 0; i < temp.length; i++){
                            for (int j = 0; j < temp[i].length; j++){
                                if (temp[i][j] == "B" + contR){
                                    Y = i;
                                    X = j;
                                }
                            }
                        }
                        for (int i = Y; i < temp.length; i++){
                            for (int j = 0; j < Azul.size(); j++){
                                if (temp[i][X] == "s"+j){
                                    int dano = 100 + r.nextInt(150);
                                    int vida = A_Vida.get(j).getVida() - dano;
                                    A_Vida.get(j).setVida(vida);
                                    if (vida <= 0){
                                        A_Vida.remove(j);
                                        Azul.remove(j);
                                    }
                                }
                            }
                        }
                        temp[Y][X] = "  ";
                        boolean repeat = true;
                        while(repeat == true){
                            X = r.nextInt(temp.length);
                            if (temp[Y][X] == "  "){
                                temp[Y][X] = "A" + contR;
                                repeat = false;
                            }
                        }                        
                    } else if (Rojo.get(contR) instanceof Submarino){
                        for (int i = 0; i < temp.length; i++){
                            for (int j = 0; j < temp[i].length; j++){
                                if (temp[i][j] == "S" + contR){
                                    Y = i;
                                    X = j;
                                }
                            }
                        }
                        for (int i = Y; i < temp.length; i++){
                            for (int j = 0; j < Azul.size(); j++){
                                if (temp[i][X] == "a"+j){
                                    int dano = 100 + r.nextInt(150);
                                    int vida = A_Vida.get(j).getVida() - dano;
                                    A_Vida.get(j).setVida(vida);
                                    if (vida <= 0){
                                        A_Vida.remove(j);
                                        Azul.remove(j);
                                    }
                                }
                            }
                        }
                        temp[Y][X] = "  ";
                        boolean repeat = true;
                        while(repeat == true){
                            X = r.nextInt(temp.length);
                            if (temp[Y][X] == "  "){
                                temp[Y][X] = "S" + contR;
                                repeat = false;
                            }
                        }
                    }
                    contR++;
                    cont++;
                    // Azul
                } else{
                    int Y = 0;
                    int X = 0;
                    if (Azul.get(contR) instanceof Aviones){
                        for (int i = 0; i < temp.length; i++){
                            for (int j = 0; j < temp[i].length; j++){
                                if (temp[i][j] == "a" + contA){
                                    Y = i;
                                    X = j;
                                }
                            }
                        }
                        for (int i = Y; i < temp.length; i++){
                            for (int j = 0; j < Rojo.size(); j++){
                                if (temp[i][X] == "B"+j){
                                    int dano = 100 + r.nextInt(150);
                                    int vida = R_Vida.get(j).getVida() - dano;
                                    R_Vida.get(j).setVida(vida);
                                    if (vida <= 0){
                                        R_Vida.remove(j);
                                        Rojo.remove(j);
                                    }
                                }
                            }
                        }
                        temp[Y][X] = "  ";
                        boolean repeat = true;
                        while(repeat == true){
                            X = r.nextInt(temp.length);
                            Y = 5 + r.nextInt(4);
                            if (temp[Y][X] == "  "){
                                temp[Y][X] = "a" + contA;
                                repeat = false;
                            }
                        }
                    } else if (Azul.get(contR) instanceof Barco){
                        for (int i = 0; i < temp.length; i++){
                            for (int j = 0; j < temp[i].length; j++){
                                if (temp[i][j] == "b" + contA){
                                    Y = i;
                                    X = j;
                                }
                            }
                        }
                        for (int i = Y; i < temp.length; i++){
                            for (int j = 0; j < Rojo.size(); j++){
                                if (temp[i][X] == "S"+j){
                                    int dano = 100 + r.nextInt(150);
                                    int vida = R_Vida.get(j).getVida() - dano;
                                    R_Vida.get(j).setVida(vida);
                                    if (vida <= 0){
                                        R_Vida.remove(j);
                                        Rojo.remove(j);
                                    }
                                }
                            }
                        }
                        temp[Y][X] = "  ";
                        boolean repeat = true;
                        while(repeat == true){
                            X = r.nextInt(temp.length);
                            if (temp[Y][X] == "  "){
                                temp[Y][X] = "b" + contA;
                                repeat = false;
                            }
                        }                        
                    } else if (Azul.get(contR) instanceof Submarino){
                        for (int i = 0; i < temp.length; i++){
                            for (int j = 0; j < temp[i].length; j++){
                                if (temp[i][j] == "s" + contA){
                                    Y = i;
                                    X = j;
                                }
                            }
                        }
                        for (int i = Y; i < temp.length; i++){
                            for (int j = 0; j < Rojo.size(); j++){
                                if (temp[i][X] == "A"+j){
                                    int dano = 100 + r.nextInt(150);
                                    int vida = R_Vida.get(j).getVida() - dano;
                                    R_Vida.get(j).setVida(vida);
                                    if (vida <= 0){
                                        R_Vida.remove(j);
                                        Rojo.remove(j);
                                    }
                                }
                            }
                        }
                        temp[Y][X] = "  ";
                        boolean repeat = true;
                        while(repeat == true){
                            X = r.nextInt(temp.length);
                            if (temp[Y][X] == "  "){
                                temp[Y][X] = "s" + contA;
                                repeat = false;
                            }
                        }
                    }
                    contA++;
                    cont++;
                }
            }
            // Fin de Cont
        } catch (Exception IndexoutofBounds){
            System.out.println("Oops");
        }
        return temp;
    }
    public static String [][] Fill (String [][] tabla, ArrayList<Vehiculo> Azul, ArrayList<Vehiculo> Rojo ) {
        String [][] temp = tabla;
        for (int i = 0; i < temp.length; i++){
            for (int j = 0; j < temp[i].length; j++){
                temp[i][j] = "  ";
            }
        }
        int cont = 0;
        while(cont < Rojo.size() ){
            boolean pos = false;
            int X = r.nextInt(temp.length);
            int Y = r.nextInt(4);
            if (temp[Y][X] == "  "){
                if (Rojo.get(cont) instanceof Aviones){
                    temp[Y][X] = "A" + cont;
                } else if (Rojo.get(cont) instanceof Barco){
                    temp[Y][X] = "B" + cont;
                } else if (Rojo.get(cont) instanceof Submarino){
                    temp[Y][X] = "S" + cont;
                }
                cont++;
            } else {
                
            }
        }
        cont = 0;
        while(cont < Azul.size() ){
            boolean pos = false;
            int X = r.nextInt(temp.length);
            int Y = 5 + r.nextInt(4);
            if (temp[Y][X] == "  "){
                if (Azul.get(cont) instanceof Aviones){
                    temp[Y][X] = "a" + cont;
                } else if (Azul.get(cont) instanceof Barco){
                    temp[Y][X] = "b" + cont;
                } else if (Azul.get(cont) instanceof Submarino){
                    temp[Y][X] = "s" + cont;
                }
                cont++;
            } else{
                
            }
        }
        return temp;
    }
}
