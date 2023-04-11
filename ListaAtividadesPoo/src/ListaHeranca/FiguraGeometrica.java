//7. Crie uma classe FiguraGeometrica que tenha as propriedades: altura e largura.
//                  a. Crie uma classe Retângulo que tenha as seguintes propriedades. Adicione
//                  métodos para calcular a área e o perímetro do retângulo.

//                  b. Crie uma classe Triangulo. Adicione métodos para calcular a área e o
//                  perímetro do triangulo.

package ListaHeranca;

public class FiguraGeometrica {
    private double altura;
    private double largura;

    //getters
    public double getAltura() {
        return altura;
    }
    public double getLargura() {
        return largura;
    }

    //setters
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setLargura(double largura) {
        this.largura = largura;
    }
    
}
