//RICHARD PADILLA

public class Jugador {
    protected String equipo, nombre;
    protected int edad;

    public Jugador(String equipo, String nombre, int edad){
        this.equipo = equipo;
        this.nombre = nombre;
        this.edad = edad;
    }

    public void Imprimir(){
        System.out.println("Nombre del equipo: " + equipo);
        System.out.println("Nombre del jugador: " + nombre);
        System.out.println("Edad del jugador: " + edad);
    }



    static class Portero extends Jugador{

        private int atojadas, golesRecibidos;
        public Portero(String equipo, String nombre, int edad, int atojadas, int golesRecibidos){
            super(equipo, nombre, edad);
            this.atojadas = atojadas;
            this.golesRecibidos = golesRecibidos;
        }

        public int Atojadas(int atojadas){
            return atojadas;
        }

        public int GolesRecibidos(int golesRecibidos){
            return golesRecibidos;
        }

        @Override
        public void Imprimir(){
            super.Imprimir();
            System.out.println("El numero de atajadas es: " + Atojadas(atojadas));
            System.out.println("El numero de goles recibidos es: " + GolesRecibidos(golesRecibidos));
        }

    }

    static class Defensa extends Jugador{

        private int bloqueos;

        public Defensa(String equipo, String nombre, int edad,int bloqueos){
            super(equipo, nombre, edad);
            this.bloqueos = bloqueos;
        }

        public int Bloqueos(int bloqueos){
            return bloqueos;
        }

        @Override
        public void Imprimir(){
            super.Imprimir();
            System.out.println("El numero de bloqueos es: " + Bloqueos(bloqueos));
        }
    }

    static class Delantero extends Jugador{
        public Delantero (String equipo, String nombre, int edad){
            super(equipo, nombre, edad);
        }
    }


    public static void main(String[] args) {

        Portero portero = new Portero("Aucas","Ariel",21,10,5);
        portero.Imprimir();
        System.out.println("\n");

        Delantero delantero = new Delantero("Aucas","Ricardo",24);
        delantero.Imprimir();
        System.out.println("\n");

        Defensa defensa = new Defensa("Mushuruna","Richard",20,5);
        defensa.Imprimir();
        System.out.println("\n");


    }
}