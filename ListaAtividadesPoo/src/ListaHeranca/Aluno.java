//2. Crie uma classe Aluno que herde da classe Pessoa e adicione uma propriedade
//para armazenar o número de matrícula do aluno. Adicione métodos para definir
//e obter essa propriedade.

package ListaHeranca;

public class Aluno extends Pessoa {
    private int ra;

    //constructors
    public Aluno(String nome, int idade, double altura, int peso) {
        super(nome, idade, altura, peso);
    }

    //getters
    public int getRa() {
        return ra;
    }
    
    //setters
    public void setRa(int ra) {
        this.ra = ra;
    }
    
}
