package Aula15_2205_CRUD;

import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
    private List<Cliente> clientes;

    public ClienteDAO() {
        clientes = new ArrayList<>();
    }
    
    public void adicionarCliente(Cliente cliente){
        clientes.add(cliente);
    }
    
    public void atualizarCliente(Cliente clienteBusca) {
        for (Cliente c : this.clientes) {
            if (c.getId() == clienteBusca.getId()) {
                c.setNome(clienteBusca.getNome());
                c.setId(clienteBusca.getId());
                c.setEndereco(clienteBusca.getEndereco());
                c.setIdade(clienteBusca.getIdade());
                c.setEmpresa(clienteBusca.getEmpresa());
            }
        }
    }
    
    public void removerCliente(Cliente remocaoCliente){
        Cliente AdeusCliente = null;
        for(Cliente c : this.clientes){
            if (c.getId() == remocaoCliente.getId()) {
                AdeusCliente = c;
            }
            if (AdeusCliente != null) {
                clientes.remove(AdeusCliente);
            }
        }
    }
    
    public Cliente buscarCliente(Cliente buscaC){
        for(Cliente c : this.clientes){
            if (c.getId() == buscaC.getId()) {
                return c;
            }
        }
        return null;
    }
    
    public List<Cliente> listarClientes(){
        return this.clientes;
    }
}
