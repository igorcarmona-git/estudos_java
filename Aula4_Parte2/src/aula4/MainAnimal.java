// Foi usado herança de classes nesse exercicio.
package aula4;

public class MainAnimal {
    public static void main(String[] args) {
        AnimalCachorro cachorro = new AnimalCachorro();
        
        System.out.println("\n"+ cachorro.emitirLatido() +"\n"); // \n = pular linha
        cachorro.setNome_animal("Fiuky");
        cachorro.setEspecie("Cachorro");
        
        // Herança da classe Animal
        System.out.println("O nome do cachorro: " + cachorro.getNome_animal());
        System.out.println("A especie: " + cachorro.getEspecie());
                
        System.out.println("\n" + cachorro.emitirSono());
    }
    
}
