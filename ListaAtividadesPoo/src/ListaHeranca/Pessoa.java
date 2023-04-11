//1. Crie uma classe Pessoa que tenha as seguintes propriedades: nome, idade, altura
//e peso. Adicione métodos para definir e obter essas propriedades.

package ListaHeranca;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private int peso;

    //getters
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public double getAltura() {
        return altura;
    }
    public int getPeso() {
        return peso;
    }
    
    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    //constructors
    public Pessoa(String nome, int idade, double altura, int peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }
    
}
