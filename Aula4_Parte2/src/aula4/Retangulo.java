package aula4;

public class Retangulo {
//    Crie uma classe Retângulo que tenha as seguintes
//    propriedades: altura e largura. Adicione métodos para
//    calcular a área e o perímetro do retângulo.
    
    private float altura;
    private float largura;

    public float getAltura() {
        return altura;
    }
    public float getLargura() {
        return largura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public void setLargura(float largura) {
        this.largura = largura;
    }
    
    public float calculoAreaRetangulo(float base, float altura){
        float area; 
        area =  base * altura;
    
        return area;
    }
    
    public float calculoPerimetroRetangulo(float base, float altura){
        float perimetro;
        perimetro = 2 * (base + altura);
        
        return perimetro;
    }
}
