package Aula10_polimorfismo;

public class Retangulo implements Desenhar{
    private double largura = 0;
    private double altura = 0;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public void desenhar() {
        System.out.println(String.format("A area do retangulo: %.2f ", this.largura * this.altura));
        System.out.println(String.format("O perimetro do retangulo: %.2f", 2 * (this.largura + this.altura)));
    }

}
