package ListaAssociacao;

public class Cliente {
    private String nome;
    private int cpf;

    //getters
    public String getNome() {
        return nome;
    }
    public int getCpf() {
        return cpf;
    }
 
    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    //constructors
    public Cliente(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    
}
