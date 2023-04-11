//5. Crie uma classe Cachorro que herde da classe Animal e adicione uma
//propriedade para armazenar a raça do cachorro. Adicione métodos para definir
//e obter essa propriedade.

package ListaHeranca;

public class Cachorro extends Animal{
    private String raca;
    
     // Toda vez que eu criar um metodo construtor na classe de onde se estende (Pai/super), eu devo puxar o seu metodo para dentro de minhas classes que vão fazer parte de Animal.
    
    //constructors
    public Cachorro(String nome, String tipo, int idade) {
        super(nome, tipo, idade);
    }

    //getters
    public String getRaca() {
        return raca;
    }
    //setters
    public void setRaca(String raca) {
        this.raca = raca;
    }
    
}
