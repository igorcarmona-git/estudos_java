package Jogo_da_Velha;

public class Jogador {
    private String nome;
    private char simbolo;

    //getters
    public String getNome() {
        return nome;
    }
    public char getSimbolo() {
        return simbolo;
    }
    
    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSimbolo(char simbolo) {
        this.simbolo = simbolo;
    }
    
    //construtor
    public Jogador(String nome, char simbolo) {
        this.nome = nome;
        this.simbolo = simbolo;
    }
    
}
