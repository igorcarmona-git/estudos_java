package AtividadeAula5;

public class Triangulo {
//    Crie uma classe Triangulo que tenha a propriedade base e
//    altura. Adicione métodos para calcular a área e o perímetro
//    do triangulo.
    
    private float base;
    private float altura;

    public float getBase() {
        return base;
    }
    public float getAltura() {
        return altura;
    }

    public void setBase(float base) {
        this.base = base;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public float calculoAreaTriangulo(float base, float altura){
        float area;
        area = (base * altura) / 2;
        
        return area;
    }
    
    public float calculoPerimetroTriangulo(float ladoA, float ladoB, float ladoC){
        float area;
        area = ladoA + ladoB + ladoC;
        
        return area;
    }
}
