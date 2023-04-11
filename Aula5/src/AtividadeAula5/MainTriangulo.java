//    Crie uma classe Triangulo que tenha a propriedade base e
//    altura. Adicione métodos para calcular a área e o perímetro
//    do triangulo.

package AtividadeAula5;

import java.util.Scanner;

public class MainTriangulo {
    public static void main(String[] args) {
        float base, altura;
        float valor;
        float ladoA, ladoB, ladoC;
        
        System.out.println("PROGRAMA DE CALCULO DE AREA E PERIMETRO DO TRIANGULO!");
        
        Triangulo triangulo = new Triangulo();
        
        System.out.println("Digite o valor da base do triangulo: ");
        Scanner input = new Scanner(System.in);
        base = input.nextFloat();
        
        System.out.println("Digite o valor da altura do retangulo: ");
        Scanner input2 = new Scanner(System.in);
        altura = input2.nextFloat();
        
        System.out.println("Digite os lados do Triangulo!");
        System.out.println("LADO A: ");
        Scanner inputladoA = new Scanner(System.in);
        ladoA = inputladoA.nextFloat();
        
        System.out.println("LADO B: ");
        Scanner inputladoB = new Scanner(System.in);
        ladoB = inputladoB.nextFloat();
        
        System.out.println("LADO C: ");
        Scanner inputladoC = new Scanner(System.in);
        ladoC = inputladoC.nextFloat();
        
        valor = triangulo.calculoAreaTriangulo(base, altura);
        System.out.println("O valor da area: " + valor + " metros quadrados.");

        valor = triangulo.calculoPerimetroTriangulo(ladoA, ladoB, ladoC);
        System.out.println("O valor do perimetro: " + valor + " metros.");
    }
}
