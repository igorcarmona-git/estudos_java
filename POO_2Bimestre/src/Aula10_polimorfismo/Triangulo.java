package Aula10_polimorfismo;

public class Triangulo implements Desenhar{
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public void desenhar(){
        System.out.println(String.format("A area do triangulo: %.2f metros", (this.base * this.altura) / 2));
    }
}
