package aula6;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    //lista Produtos da classe Produto
    private List<Produto> listaProdutos = new ArrayList<>();
    
    
    public void adicionar(Produto novoProduto){
        this.listaProdutos.add(novoProduto);
    }

    public Produto consultar(String nome){
        for(Produto p : this.listaProdutos){
            if(p.getNome() == nome){ //p.getNome().equals(nome)
                return p;
            }
        }
        return null;   
    }

    public void remover(Produto removerProduto){
        this.listaProdutos.remove(removerProduto);
    }
}
