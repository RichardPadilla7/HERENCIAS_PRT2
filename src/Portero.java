public class Portero extends Jugador{

    private int atojadas, golesRecibidos, nCamiseta;
    public Portero(atojadas){
        super();
        this.atojadas = atojadas;
        this.golesRecibidos = golesRecibidos;
        this.nCamiseta = nCamiseta;
    }

    public int Atojadas(int atojadas){
        return atojadas;
    }

    public int GolesRecibidos(int golesRecibidos){
        return golesRecibidos;
    }

    public int NCamiseta(int nCamiseta){
        return nCamiseta;
    }

    @Override
    public void Imprimir(){
        super.Imprimir();
        System.out.println("El numero de atajadas es: " + Atojadas(atojadas));
        System.out.println("El numero de goles recibidos es: " + GolesRecibidos(golesRecibidos));
        System.out.println("La camiseta es: " + NCamiseta(nCamiseta));
    }

}
