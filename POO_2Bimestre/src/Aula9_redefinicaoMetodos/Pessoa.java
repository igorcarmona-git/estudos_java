//Atividade sobre redefinição de métodos

// O modificador %.0f especifica que o número decimal deve ser formatado sem casas decimais, e o %% é usado para imprimir o símbolo de porcentagem literal na saída. 
// Note que, se você quiser que o número seja formatado com uma quantidade específica de casas decimais, basta ajustar o valor numérico dentro do modificador %.nf (por exemplo, %.2f para 2 casas decimais).

package Aula9_redefinicaoMetodos;

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
       
        System.out.println(String.format("Parabens, %s! Voce agora tem %d anos", this.nome, this.idade));
    }
   
}
