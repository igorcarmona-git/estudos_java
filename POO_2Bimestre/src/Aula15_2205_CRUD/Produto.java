package Aula15_2205_CRUD;

public class Produto {
    private String nome;
    private double preco;
    private String descricao;
    private int estoque;
    private int idProduto;

    //getters
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public String getDescricao() {
        return descricao;
    }
    public int getEstoque() {
        return estoque;
    }
    public int getIdProduto() {
        return idProduto;
    }
    
    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }
    
    //construtor
    public Produto(String nome, double preco, String descricao, int estoque, int idProduto) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.estoque = estoque;
        this.idProduto = idProduto;
    }
 
    //ToString
    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + ", preco=" + preco + ", descricao=" + descricao + ", estoque=" + estoque + ", idProduto=" + idProduto + '}';
    }
    
}
