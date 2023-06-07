package Aula15_2205_CRUD;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {
    List<Produto> produtos;

    public ProdutoDAO() {
        produtos = new ArrayList<>();
    }
    
    public void adicionarProduto(Produto produtoLista){
        produtos.add(produtoLista);
    }
    
    public void atualizarProduto(Produto produtoLista){
        for(Produto p : this.produtos){
            if(p.getIdProduto() == produtoLista.getIdProduto()){
                p.setNome(produtoLista.getNome());
                p.setPreco(produtoLista.getPreco());
                p.setDescricao(produtoLista.getDescricao());
                p.setEstoque(produtoLista.getEstoque());
                p.setIdProduto(produtoLista.getIdProduto());
            }
        }
    }
    
    public void removerProduto(int id){
        Produto remocaoProduto = null;   //Flag no código
        for(Produto p : this.produtos){
            if (p.getIdProduto() == id) {
                remocaoProduto = p;
            }
            if (remocaoProduto != null) {
                produtos.remove(remocaoProduto);
            }
        }
    }
    
    public Produto buscarProduto(Produto buscaId){
        for(Produto p : this.produtos){
            if (p.getIdProduto() == buscaId.getIdProduto()) {
                return p;
            }
        }
        return null;
    }
    
    // retorna a lista dos produtos, printa cada um dos produtos na Main usando um laço
    public List<Produto> listarProdutos(){
        return this.produtos;
    }
}
