//Aplicando os conceitos de Sobrecarga de métodos

package Aula8;

import java.util.Scanner;

public class MainCalculadora{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        double valor1, valor2, resultado;
        int operacao;

        do {            
            System.out.print("Digite o primeiro valor: ");
            valor1 = input.nextDouble();

            System.out.print("Digite o segundo valor: ");
            valor2 = input.nextDouble();

            System.out.println("Qual operacao deseja realizar?");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtracao");
            System.out.println("3 - Multiplicacao");
            System.out.println("4 - Divisao");
            System.out.println("0 - SAIR!");

            operacao = input.nextInt();

            switch (operacao) {
                case 0:
                    System.out.println("Voce saiu do Programa! Obrigado!");
                    break;
                case 1:
                    resultado = calc.soma(valor1, valor2);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 2:
                    resultado = calc.diminuir(valor1, valor2);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 3:
                    resultado = calc.multiplica(valor1, valor2);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 4:
                    resultado = calc.dividir(valor1, valor2);
                    System.out.println("Resultado: " + resultado);
                    break;
                default:
                    System.out.println("Operacao invalida!");
            }
        } while (operacao != 0);
        
        // input.close()
        //Fecha a fonte de entrada de dados associada ao objeto Scanner.
        //quando você fecha um objeto Scanner, você não poderá mais ler entradas de dados a partir dele.
        input.close();
    }
}
