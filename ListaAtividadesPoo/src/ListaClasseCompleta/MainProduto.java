package ListaClasseCompleta;

public class MainProduto {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
    
        Produto produto1 = new Produto("Carrinho", 50, 2);
        Produto produto2 = new Produto("Hotwheels", 35, 1);
        Produto produto3 = new Produto("peixe", 3.90, 5);
        
        estoque.adicionar(produto1);
        estoque.adicionar(produto2);
        estoque.adicionar(produto3);
        
        estoque.printar(produto1);
        System.out.println(estoque.consultar("existe?"));
        
        estoque.remover(produto2);
        System.out.println(estoque.consultar("Carrinho"));
        System.out.println(estoque.consultar("peix"));
    }
    
}
