package ListaAssociacao;

public class Loja {
    private Produto produto;

    //getters
    public Produto getProduto() {
        return produto;
    }

    //setters
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    //metodos
    public String vender(Produto venda){
        return "Vendendo o produto... ";
    }
}
