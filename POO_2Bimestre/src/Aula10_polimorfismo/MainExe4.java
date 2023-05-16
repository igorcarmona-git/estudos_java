package Aula10_polimorfismo;

public class MainExe4 {
    public static void main(String[] args) {
        Veiculo[] veiculos = new Veiculo[2];
        veiculos[0] = new Carro();
        veiculos[1] = new Moto();

        for (Veiculo veiculo : veiculos) {
            veiculo.acelerar();
        }
    }
    
}
