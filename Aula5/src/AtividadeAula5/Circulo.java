package AtividadeAula5;

public class Circulo {
//    Crie uma classe Círculo que tenha a propriedade raio.
//    Adicione métodos para calcular a área e o perímetro do
//    círculo.
    
    private float raio;
    private float area;
    private float perimetro;

    public float getRaio() {
        return raio;
    }
    public float getArea() {
        return area;
    }
    public float getPerimetro() {
        return perimetro;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }
    public void setArea(float area) {
        this.area = area;
    }
    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }
    
    public float calculoAreaCirculo(float raio){
        float area;
        float pi = 3.14f;
        
        area = pi * (raio*raio);
        
        return area;
    }
    
    public float calculoPerimetroCirculo(float raio){
        float circunferencia;
        float pi = 3.14f;
        
        circunferencia = 2 * pi * raio;
        
        return circunferencia;
    }
}
