package Aula15_2205_CRUD;

public class Executor {
    public static void main(String[] args) {
        ClienteDAO clientes = new ClienteDAO();
        
        ProdutoDAO produtos = new ProdutoDAO();
        
        clientes.adicionarCliente(new Cliente(1, "Igor", "Rua Ezidio", 23, "Avenorte"));
        clientes.adicionarCliente(new Cliente(2, "Joao", "Rua joaozinho", 28, "Unipar"));
        clientes.adicionarCliente(new Cliente(3, "Fernando", "Rua Fernandinho", 25, "Lavenorte"));
        
        produtos.adicionarProduto(new Produto("Teclado", 30.00, "Serve pra digitar", 30, 1));
        produtos.adicionarProduto(new Produto("Mouse", 55.00, "Serve pra por a mao", 10, 2));
        
        VendaDAO vendas = new VendaDAO(); 
        
    }
}
