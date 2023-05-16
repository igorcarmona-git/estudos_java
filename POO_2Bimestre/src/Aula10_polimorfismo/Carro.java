package Aula10_polimorfismo;

public class Carro extends Veiculo {
    @Override
    public void acelerar(){
        acelerar += 20;
        System.out.println(String.format("Voce esta a %d km/h de carro!", acelerar));
    }
}
