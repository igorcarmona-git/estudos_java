package Aula10_polimorfismo;

public class Veiculo {
    public void acelerar(){
        int acelerar = 0;
        int quantidade = 50;
        
        do {            
            System.out.println(String.format("Voce esta a %d km/h de carro!", acelerar));
            acelerar++;
        } while (acelerar != quantidade);
        
    }
}
