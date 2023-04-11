package ListaAssociacao;

public class Produto {
    private String nome;
    private double preco;

    //getters
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    
    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    //constructors
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
}
