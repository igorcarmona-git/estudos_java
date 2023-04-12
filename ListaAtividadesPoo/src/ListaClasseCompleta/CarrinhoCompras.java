package ListaClasseCompleta;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<Produto> listaProduto;
    
    //getter
    public List<Produto> getListaProduto() {
        return listaProduto;
    }
    
    //constructors
    public CarrinhoCompras() {
        listaProduto = new ArrayList<>();
    }

    //metodos
    public void adicionarCompra(Produto produto) {
        listaProduto.add(produto);
    }

    public double calcularCompra(Produto produto) {
        return produto.getPreco() * produto.getQuantidade();
    }
  
}
