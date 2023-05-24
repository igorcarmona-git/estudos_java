package Aula14_CRUD;

public class Cliente {
    private int id;
    private String nome;
    private String tell;
    private String endereco;
    private String cpf;

    //getters
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getTell() {
        return tell;
    }
    public String getEndereco() {
        return endereco;
    }
    public String getCpf() {
        return cpf;
    }
    
    //setters
    public void setId(int id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTell(String tell) {
        this.tell = tell;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nome=" + nome + ", tell=" + tell + ", endereco=" + endereco + ", cpf=" + cpf + '}';
    }
    
}
