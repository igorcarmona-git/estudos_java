//6. Crie uma classe Gato que herde da classe Animal e adicione uma propriedade
//para armazenar a cor do pelo do gato. Adicione métodos para definir e obter
//essa propriedade.

package ListaHeranca;

public class Gato extends Animal{
    private String corPelo;

    // Toda vez que eu criar um metodo construtor na classe de onde se estende (Pai/super), eu devo puxar o seu metodo para dentro de minhas classes que vão fazer parte de Animal.
    
    //constructors
    public Gato(String nome, String tipo, int idade) {
        super(nome, tipo, idade);
    }

    //getters
    public String getCorPelo() {
        return corPelo;
    }
    //setters
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
}
