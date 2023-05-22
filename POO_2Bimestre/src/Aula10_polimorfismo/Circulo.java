package Aula10_polimorfismo;

public class Circulo implements Desenhar{
    private double pi = 3.14159, circunferencia, raio;
    
    public Circulo(double circunferencia) {
        this.circunferencia = circunferencia;
    }
    
    @Override
    public void desenhar() {
        raio = this.circunferencia / (2 * this.pi);
        System.out.println(String.format("O raio do circulo: %.2f", raio));
    }
    
}
