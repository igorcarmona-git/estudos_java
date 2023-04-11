// Foi usado associação de classes nesse exercicio.
package Aula7Associacao2;

public class MainAnimal {
    public static void main(String[] args) {
        Animal dog = new Animal();
        AnimalCachorro cachorro = new AnimalCachorro();
        AnimalGato gato = new AnimalGato();
        
        //  Seto o objeto todo "AnimalCachorro"' para a Main, se eu não setar ele retorna null.
        //  Deve-se setar para identificar o objeto com seus valores.
        dog.setCachorro(cachorro);
        dog.setGato(gato);
        
        dog.setNome_animal("Kitty");
        dog.setEspecie("Cachorro");
        String msg = "O nome do " +dog.getEspecie() + ": " + dog.getNome_animal();
        System.out.println(msg);
        
        System.out.println("Meu cachorro esta se sentindo: ");
        System.out.println(dog.getCachorro().latirCachorro());
        System.out.println(dog.getCachorro().raivaCachorro());
        
        System.out.println("Meu gato esta se sentindo: ");
        System.out.println(dog.getGato().miarGato());
        System.out.println(dog.getGato().sonoGato());
    }
    
}
