//    Crie uma classe Círculo que tenha a propriedade raio.
//    Adicione métodos para calcular a área e o perímetro do
//    círculo.

package AtividadeAula5;

import java.util.Scanner;

public class MainCirculo {
    public static void main(String[] args) {
        float raio;
        float valor;
      
        System.out.println("PROGRAMA DE CALCULO DE AREA E CIRCUNFERENCIA DO CIRCULO!");
        
        Circulo circulo = new Circulo();
        
        System.out.println("Digite o RAIO do circulo: ");
        Scanner input = new Scanner(System.in);
        raio = input.nextFloat();
        
        valor = circulo.calculoAreaCirculo(raio);
        System.out.println("A area do circulo: " + valor + "cm quadrados.");
        
        valor = circulo.calculoPerimetroCirculo(raio);
        System.out.println("A circunferencia do circulo: " + valor +"cm.");
    }
    
}
