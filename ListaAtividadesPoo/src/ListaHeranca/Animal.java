//4. Crie uma classe Animal que tenha as seguintes propriedades: nome, tipo e idade.
//Adicione métodos para definir e obter essas propriedades.

package ListaHeranca;

public class Animal {
    private String nome;
    private String tipo;
    private int idade;

    //getters
    public String getNome() {
        return nome;
    }
    public String getTipo() {
        return tipo;
    }
    public int getIdade() {
        return idade;
    }
    
    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    //constructors
    public Animal(String nome, String tipo, int idade) {
        this.nome = nome;
        this.tipo = tipo;
        this.idade = idade;
    }
    
}
