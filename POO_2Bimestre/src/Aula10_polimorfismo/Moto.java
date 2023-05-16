package Aula10_polimorfismo;

public class Moto extends Veiculo {
    @Override
    public void acelerar(){
        acelerar += 15;   
        System.out.println(String.format("Voce esta a %d km/h de moto!", acelerar));
    }
}  

