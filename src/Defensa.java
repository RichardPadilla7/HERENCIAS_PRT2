public class Defensa extends Jugador{

    private int bloqueos;

    public Defensa(){
        super();
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

