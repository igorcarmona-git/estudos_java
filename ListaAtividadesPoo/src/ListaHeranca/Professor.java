//3. Crie uma classe Professor que herde da classe Pessoa e adicione uma
//propriedade para armazenar a área de especialização do professor. Adicione
//métodos para definir e obter essa propriedade.

package ListaHeranca;

public class Professor extends Pessoa{
    private String especialization;

    //constructor
    public Professor(String nome, int idade, double altura, int peso) {
        super(nome, idade, altura, peso);
    }
    
    //getters
    public String getEspecialization() {
        return especialization;
    }
    //setters
    public void setEspecialization(String especialization) {
        this.especialization = especialization;
    }
    
}
