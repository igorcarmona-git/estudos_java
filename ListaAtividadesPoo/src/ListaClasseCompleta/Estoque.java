package ListaClasseCompleta;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> listaProdutos;
    
   //getters
    public List<Produto> getListaProdutos(){    
        return listaProdutos;
    }
    
    //setters
    public void setListaProdutos(List<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }
    
    //constructors
    public Estoque() {
        listaProdutos = new ArrayList<>();
    }
    
    //metodos
    public void adicionar(Produto novoProduto) {
        this.listaProdutos.add(novoProduto);
    }
    
    public void remover(Produto removerProduto){
        this.listaProdutos.remove(removerProduto);
    }
    
    public String consultar(String nomeProduto){
        for(Produto item : this.listaProdutos){
            if(item.getNome().equals(nomeProduto))
                return item.getNome();
        }
        return "Vazio";
    }
    
    public void printar(Produto produto){
        System.out.println("O nome do produto --> " + produto.getNome());
        System.out.println("O valor do produto --> " + produto.getPreco());
        System.out.println("A quantidade do produto --> " + produto.getQuantidade());
    }
}
