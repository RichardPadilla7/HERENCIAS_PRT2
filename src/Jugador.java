//RICHARD PADILLA
import java.util.Scanner;

public class Jugador {
    protected String equipo, nombre;
    protected int edad;

    public Jugador(String equipo, String nombre, int edad){
        this.equipo = equipo;
        this.nombre = nombre;
        this.edad = edad;
    }

    public void ImprimirPadre(){
        System.out.println("Nombre del equipo: " + equipo);
        System.out.println("Nombre del jugador: " + nombre);
        System.out.println("Edad del jugador: " + edad);
    }



    public static void main(String[] args) {

        /*
        Portero portero = new Portero("Aucas","Ariel",21,10,2,22);
        portero.Imprimir();
        System.out.println("\n");

        Delantero delantero = new Delantero("Aucas","Ricardo",24);
        delantero.Imprimir();
        System.out.println("\n");

        Defensa defensa = new Defensa("Mushuruna","Richard",20,5);
        defensa.Imprimir();
        System.out.println("\n");
        */

        Scanner ingresar = new Scanner(System.in);

        Portero portero = new Portero();
        Delantero delantero = new Delantero();
        Defensa defensa = new Defensa();

        System.out.println("Ingrese el nombre del equipo: ");
        String equipo = ingresar.nextLine();

        System.out.println("Ingrese el nombre del jugador: ");
        String nombre = ingresar.nextLine();

        System.out.println("Ingrese la edad del jugador: ");
        int edad = ingresar.nextInt();
        ingresar.nextLine();
        System.out.println("\n");

        // PORTERO

        System.out.println("--- PORTERO ---");
        System.out.println("Ingrese el numero de atojadas: ");
        int atojadas = ingresar.nextInt();

        System.out.println("Ingresar el numero de goles recibidos: ");
        int golesRecibidos = ingresar.nextInt();

        System.out.println("Ingrese el numero de camistea: ");
        int nCamiseta = ingresar.nextInt();
        ingresar.nextLine();
        portero.Imprimir();










    }
}