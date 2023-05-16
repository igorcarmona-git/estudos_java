package Aula14_CRUD;

public class Autor{
    private String nome;
    private String cpf;
    private String nacionalidade;
    private int idade;

    //getters
    public String getNome() {
        return nome;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    
    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    //constructors
    public Autor(String nome, String cpf, String nacionalidade, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
    }

}
