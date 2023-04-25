package ListaClasseCompleta;

import java.util.ArrayList;
import java.util.List;

public class CadastroClientes {
    private List<Cliente> listaClientes;

    //getters
    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    //setters
    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
    
    //constructors
    public CadastroClientes() {
        this.listaClientes = new ArrayList<>();
    }
    
    //metodos
    public void adicionar(Cliente novoCliente){
        this.listaClientes.add(novoCliente);
    }
    
    public void remover(Cliente removerCliente){
        this.listaClientes.remove(removerCliente);
    }
    
    public String consultar(String consultaCliente){
        for(Cliente pessoa : this.listaClientes){
            if(pessoa.getNome().equals(consultaCliente)){
                imprimirCliente(pessoa);
                return "Temos esse cliente cadastrado! ";
            }
        }
        return "Vazio";
    }
    
    public void imprimirCliente(Cliente cliente){
        System.out.println("O nome do cliente --> " + cliente.getNome());
        System.out.println("O endereco do cliente --> " + cliente.getEndereco());
        System.out.println("O telefone do cliente --> " + cliente.getTelefone());
        System.out.println();
    }
    
}
