package Aula13_Interfaces;

public class Retangulo implements Forma {
    private double largura = 0;
    private double altura = 0;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    @Override
    public String getNome() {
        return "Retangulo";
    }
}
