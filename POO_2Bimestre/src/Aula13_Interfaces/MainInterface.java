package Aula13_Interfaces;

public class MainInterface {
    public static void main(String[] args) {
        Forma retangulo = new Retangulo(5, 3);

        System.out.println(String.format("Area do %s: %.2f %s", retangulo.getNome(), retangulo.calcularArea(), Forma.UNIDADE_MEDIDA));
        System.out.println(String.format("Area do perimetro do %s: %.2f %s", retangulo.getNome(), retangulo.calcularPerimetro(), Forma.UNIDADE_MEDIDA));
    }        
}

