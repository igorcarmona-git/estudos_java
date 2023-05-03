//2 - Escreva uma classe Animal com um método fazerSom(). Crie duas subclasses
//dessa classe chamadas Cachorro e Gato que redefinem o método fazerSom()
//para que o cachorro emita o som "au au" e o gato emita o som "miau". Utilize o
//polimorfismo para chamar o método fazerSom() a partir de uma variável do
//tipo Animal.

package Aula10_polimorfismo;

// poliformismo de subtipo

public class MainExe2 {
    public static void main(String[] args) {
        Animal[] animais = new Animal[2];
        
        animais[0] = new Cachorro();
        animais[1] = new Gato();
        
        for (Animal animal : animais) {
            animal.fazerSom();
        }
    }
    
}
