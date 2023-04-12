//2. Sistema de cadastro de clientes: crie uma classe Cliente com os atributos
//nome, endereço e telefone. Em seguida, crie uma classe
//CadastroClientes que contém uma lista de objetos da classe Cliente e
//métodos para adicionar, remover e consultar clientes no cadastro.

package ListaClasseCompleta;

public class MainCliente {
    public static void main(String[] args) {
        CadastroClientes cadastro = new CadastroClientes();
        Cliente comprador = new Cliente("Igor", "Rua Ezidio", 0);
        Cliente comprador2 = new Cliente("Fernando", "Rua Pedrinho", 0);
        Cliente comprador3 = new Cliente("Henrique", "Avenida Brasil", 0);
        
        cadastro.adicionar(comprador);
        cadastro.adicionar(comprador3);
        System.out.println(cadastro.consultar("Henrique"));
    }
}