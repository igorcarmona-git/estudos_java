//    Crie uma classe Retângulo que tenha as seguintes
//    propriedades: altura e largura. Adicione métodos para
//    calcular a área e o perímetro do retângulo.

package AtividadeAula5;

import java.util.Scanner;

public class MainRetangulo {
    public static void main(String[] args) {
        float base, altura;
        float valor;
        
        System.out.println("PROGRAMA DE CALCULO DE AREA E PERIMETRO DO RETANGULO!");
        
        Retangulo retangulo = new Retangulo();
        
        System.out.println("Digite o valor da base do retangulo: ");
        Scanner input = new Scanner(System.in);
        base = input.nextFloat();
        
        System.out.println("Digite o valor da altura do retangulo: ");
        Scanner input2 = new Scanner(System.in);
        altura = input2.nextFloat();
        
        valor = retangulo.calculoAreaRetangulo(base, altura);
        System.out.println("O valor da area: " + valor + "m quadrados.");
        
        valor = retangulo.calculoPerimetroRetangulo(base, altura);
        System.out.println("O valor do perimetro: " + valor + "m");
    }
}
