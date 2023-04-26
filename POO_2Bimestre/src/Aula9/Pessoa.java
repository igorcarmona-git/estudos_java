//Atividade sobre redefinição de métodos

package Aula9;

public class Pessoa {
    String nome;
    int idade;
    
    //construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    //metodos
    public void fazerAniversario(){
        this.idade++;
       
        System.out.println(String.format("Parabéns, %s! Voce agora tem %d anos", this.nome, this.idade));
    }
    
}
