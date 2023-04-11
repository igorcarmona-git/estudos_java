package ListaAssociacao;

public class Pessoa {
    private Telefone telefone;
    private String nome;
    
    //getters
    public Telefone getTelefone() {
        return telefone;
    }
    public String getNome() {
        return nome;
    }
    
    //setters
    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    //metodos
    public String ligar(Telefone telefone){
        return "Ligando para o numero:  " + telefone.getDdd() + " "+ telefone.getNumero();
    }
}
