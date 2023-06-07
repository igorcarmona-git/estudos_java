package Aula15_2205_CRUD;

public class Cliente {
    private int id;
    private String nome;
    private String endereco;
    private int idade;
    private String empresa;

    //getters
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public int getIdade() {
        return idade;
    }
    public String getEmpresa() {
        return empresa;
    }
    
    //setters
    public void setId(int id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
     
    //construtor
    public Cliente(int id, String nome, String endereco, int idade, String empresa) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
        this.empresa = empresa;
    }
    
    //ToString
    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nome=" + nome + ", endereco=" + endereco + ", idade=" + idade + ", empresa=" + empresa + '}';
    }
    
}
