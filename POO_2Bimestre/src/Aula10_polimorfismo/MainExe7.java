package Aula10_polimorfismo;

public class MainExe7 {
    public static void main(String[] args) {
        Animal[] animal = new Animal[2];
        
        animal[0] = new Peixe();
        animal[1] = new Ave();
        
        for (Animal animalMover : animal) {
            animalMover.locomover();
        }
    }
    
}
