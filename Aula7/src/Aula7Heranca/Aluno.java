package Aula7Heranca;

public class Aluno extends Pessoa{
    private int matricula;
    
    //getters
    public int getMatricula() {
        return matricula;
    }
    
    //setters
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    //Constructors
    
    // Essa classe é a filha, obrigatoriamente  eu devo colocar o metodo construtor gerado na classe pai (Pessoa)
    //  super (puxa metodo da classe Pai)
    
    public Aluno(String nome, int idade) {
        super(nome, idade);
    }
}

    //Explicação (código do construtor acima)
    
//    Esse comando define um construtor para a classe "Aluno" em Java que recebe dois parâmetros: uma string "nome" e um inteiro "idade". 
//    O construtor chama o construtor da classe pai (superclasse) de "Aluno" com esses dois parâmetros.
//
//    O comando "super(nome, idade)" é usado para chamar o construtor da classe pai de "Aluno", que inicializa as propriedades da classe pai. 
//    Esse comando é usado aqui porque a classe "Aluno" herda as propriedades e comportamentos da classe pai.
