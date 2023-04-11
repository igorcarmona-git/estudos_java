//Crie uma classe chamada Animal com os atributos nome e especie. Crie métodos
//para definir e obter os valores desses atributos, bem como para emitir um som
//característico do animal. Crie duas subclasses de Animal, uma chamada Cachorro
//e outra chamada Gato, e sobrescreva o método de emitir som para cada uma
//dessas subclasses. Crie objetos do tipo Cachorro e Gato e exiba seus sons característicos.

package aula4;

public class Animal {
    private String nome_animal; 
    private String especie;

    public String getNome_animal() {
        return nome_animal;
    }
    public String getEspecie() {
        return especie;
    }

    public void setNome_animal(String nome_animal) {
        this.nome_animal = nome_animal;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
 
}
