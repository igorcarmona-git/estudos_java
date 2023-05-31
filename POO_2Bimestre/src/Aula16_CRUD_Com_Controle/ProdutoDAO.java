package Aula16_CRUD_Com_Controle;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {
    // atributo
    private List<Produto> produtos;

    //construtor que cria lista vazia
    public ProdutoDAO() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void atualizarProduto(Produto produto) {
        for (Produto p : produtos) {
            if (p.getId() == produto.getId()) {
                p.setNome(produto.getNome());
                p.setPreco(produto.getPreco());
            }
        }
    }

    public void removerProduto(int id) {
        Produto produtoRemover = null;
        for (Produto p : produtos) {
            if (p.getId() == id) {
                produtoRemover = p;
            }
        }
        if (produtoRemover != null) {
            produtos.remove(produtoRemover);
        }
    }

    public Produto buscarProduto(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }

    // retorna a lista dos produtos, printa cada um dos produtos na Main usando um laço
    public List<Produto> listarProdutos() {
        return produtos;
    }
}
