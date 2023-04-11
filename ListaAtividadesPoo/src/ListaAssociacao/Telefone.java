package ListaAssociacao;

public class Telefone {
    private int ddd;
    private int numero;

    //getters
    public int getDdd() {
        return ddd;
    }
    public int getNumero() {
        return numero;
    }

    //setters
    public void setDdd(int ddd) {
        this.ddd = ddd;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    //constructors
    public Telefone(int ddd, int numero){
        this.ddd = ddd;
        this.numero = numero;
    }
}
