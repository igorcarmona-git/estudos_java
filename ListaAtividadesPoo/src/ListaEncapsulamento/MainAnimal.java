//5. Crie uma classe chamada Animal com os atributos nome e especie. Crie métodos
//para definir e obter os valores desses atributos, bem como para emitir um som
//característico do animal. Crie duas subclasses de Animal, uma chamada Cachorro
//e outra chamada Gato, e sobrescreva o método de emitir som para cada uma
//dessas subclasses. Crie objetos do tipo Cachorro e Gato e exiba seus sons
//característicos.

// Foi usado herança de classes nesse exercicio.
package ListaEncapsulamento;

public class MainAnimal {
    public static void main(String[] args) {
        AnimalCachorro cachorro = new AnimalCachorro();
        AnimalGato gato =  new AnimalGato();
        
        System.out.println("\n"+ cachorro.emitirLatido() +"\n"); // \n = pular linha
        cachorro.setNome_animal("Fiuky");
        cachorro.setEspecie("Cachorro");
        
        // Herança da classe Animal
        System.out.println("O nome do cachorro: " + cachorro.getNome_animal());
        System.out.println("A especie: " + cachorro.getEspecie());
                
        System.out.println("\n" + cachorro.emitirSono());
        
        System.out.println("\n"+ gato.emitirMiar());
        gato.setNome_animal("Chuchu");
        gato.setEspecie("Gato Ciamez");
        
        // herança da classe animal
        System.out.println("O nome do gato: " + gato.getNome_animal());
        System.out.println("A especie: " + gato.getEspecie());
    }
    
}
