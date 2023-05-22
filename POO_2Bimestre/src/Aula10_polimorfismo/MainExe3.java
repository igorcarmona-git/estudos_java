package Aula10_polimorfismo;

public class MainExe3 {
    public static void main(String[] args) {
        Desenhar circulo = new Circulo(5);
        Desenhar retangulo = new Retangulo(20, 20);
        Desenhar triangulo = new Triangulo(10, 20);
                
        circulo.desenhar();
        retangulo.desenhar();
        triangulo.desenhar();
    }
    
}
