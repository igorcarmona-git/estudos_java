package Aula7Heranca;

public class Pessoa {
    private String nome;
    private int idade;
    private float altura;
    private float peso;

    //getters
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public float getAltura() {
        return altura;
    }
    public float getPeso() {
        return peso;
    }
    
    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }

    //constructors
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
