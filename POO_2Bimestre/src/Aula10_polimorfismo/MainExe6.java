package Aula10_polimorfismo;

public class MainExe6 {
    public static void main(String[] args) {
        FormaGeometrica [] formas = new FormaGeometrica[2];
        
        formas[0] = new CirculoForma(20);
        formas[1] = new QuadradoForma(20);
        
        for (FormaGeometrica forma : formas) {
            System.out.println();
            System.out.println(forma.calcularArea());
        }
    }
    
}
