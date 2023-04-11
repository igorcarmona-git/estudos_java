package ListaAssociacao;

public class ContaBancaria {
    private Cliente cliente;
    
    //getters
    public Cliente getCliente() {
        return cliente;
    }
    
    //setters
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    //metodos
    public String sacar(double saque){
        return "Sacando valor: " + saque;
    }
}
