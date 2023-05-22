package Aula10_polimorfismo;

public class CirculoForma extends FormaGeometrica{
    protected double circunferencia;
    protected double raio;
    protected double pi = 3.14159;
        
    public CirculoForma(double circunferencia) {
        this.circunferencia = circunferencia;
    }
        
    @Override
    public double calcularArea(){
        raio = this.circunferencia / (2 * this.pi);
        
        System.out.println("O raio do circulo: ");
        return raio;
    }
    
}
