package Aula14_CRUD;

public class Produto {
    private String nome;
    private String Preco;
    private int id;
    private String marca;
    private String quantidade;
    
    //getters
    public String getNome() {
        return nome;
    }
    public String getPreco() {
        return Preco;
    }
    public int getId() {
        return id;
    }
    public String getMarca() {
        return marca;
    }
    public String getQuantidade() {
        return quantidade;
    }
    
    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(String Preco) {
        this.Preco = Preco;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + ", Preco=" + Preco + ", id=" + id + ", marca=" + marca + ", quantidade=" + quantidade + '}';
    }
    
}
