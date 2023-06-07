package Produti;

import java.util.List;

public class Executor {

    public static void main(String[] args) {
        ProdutoDAO produtoDAO = new ProdutoDAO();
       
        // Adicionando produtos
        produtoDAO.adicionarProduto(new Produto(1, "Camiseta", 29.99));
        produtoDAO.adicionarProduto(new Produto(2, "Calca", 59.99));
        produtoDAO.adicionarProduto(new Produto(3, "Tenis", 99.99));

        
        // Listando produtos
        List<Produto> produtos = produtoDAO.listarProdutos();
        for (Produto produto : produtos) {
            System.out.println(produto);
        }

        // Atualizando produto
        Produto produtoAtualizado = new Produto(2, "Calca Jeans", 69.99);
        produtoDAO.atualizarProduto(produtoAtualizado);

        // Buscando produto
        Produto produtoEncontrado = produtoDAO.buscarProduto(2);
        if (produtoEncontrado != null) {
            System.out.println("Produto encontrado: " + produtoEncontrado);
        } else {
            System.out.println("Produto nao encontrado.");
        }

        // Removendo produto
        produtoDAO.removerProduto(3);

        // Listando produtos atualizados
        produtos = produtoDAO.listarProdutos();
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
    
}
