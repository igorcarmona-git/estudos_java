package ListaCircular;

public class NoCircular {
    private int valor;
    private NoCircular proximo;
    
    //construtor
    public NoCircular(int valor) {
        this.valor = valor;
    }
    
    //getters
    public int getValor() {
        return valor;
    }
    
    public NoCircular getProximo() {
        return proximo;
    }
    
    //setters
    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public void setProximo(NoCircular proximo) {
        this.proximo = proximo;
    }
}
