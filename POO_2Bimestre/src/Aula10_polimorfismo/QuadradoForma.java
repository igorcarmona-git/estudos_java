package Aula10_polimorfismo;

public class QuadradoForma extends FormaGeometrica{
    protected double area;
    protected double lado;

    public QuadradoForma(double lado) {
        this.lado = lado;
    }
    
    @Override
    public double calcularArea() {
        area = lado * lado;
        
        System.out.println("A area do Quadrado em metros");
        return area;
    }
    
}
