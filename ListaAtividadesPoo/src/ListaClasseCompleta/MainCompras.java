//3. Sistema de vendas: crie uma classe Produto com os atributos nome,
//preço e quantidade. Em seguida, crie uma classe CarrinhoCompras que
//contém uma lista de objetos da classe Produto e métodos para adicionar,
//remover e calcular o valor total da compra.

package ListaClasseCompleta;

public class MainCompras {
    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();
        
        Produto p = new Produto("Bulmerang", 15.00, 10);
        Produto p1 = new Produto("Celular", 1800.00, 3);
        Produto p2 = new Produto("Tenis", 80.55, 1);
        Produto p3 = new Produto("Teclado", 50.50, 1);
        
        carrinho.adicionarCompra(p);
        carrinho.adicionarCompra(p1);
        carrinho.adicionarCompra(p2);
        carrinho.adicionarCompra(p3);

        for(Produto item : carrinho.getListaProduto()){
            double total = carrinho.calcularCompra(item);
            System.out.println("Total de valores do item "+ item.getNome() + " --> "+ total);
        }
    }
    
}
