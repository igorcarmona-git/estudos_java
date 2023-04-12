package ListaClasseCompleta;

public class Cliente {
    private String nome;
    private String endereco;
    private int telefone;
    
    //getters
    public String getNome() {
        return nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public int getTelefone() {
        return telefone;
    }
    
    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    
    //constructors
    public Cliente(String nome, String endereco, int telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    
}
