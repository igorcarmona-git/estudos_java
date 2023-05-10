//Tratamento de erros utilizada de forma procedural

package Aula11_TryCatch;

import java.util.Scanner;

public class MainProcedural {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);       
        Scanner saida = new Scanner(System.in);
        
        int a, b, result;
        String resposta;
        
        do {         
            System.out.println("Digite o valor de a: ");
            a = input.nextInt();
            System.out.println("Digite o valor de b: ");
            b = input.nextInt();
            
            try {
                result = a/b;
                System.out.println(String.format("Resultado de %d/%d = %d", a, b, result));
            } catch (ArithmeticException e) {
                // voce pode tratar o "e" como um objeto conforme exemplos abaixo
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                System.out.println("ERRO!");
            }
            
            System.out.println("Voce quer sair? Digite Y or n");
            resposta = saida.nextLine();
        }
        while(!"Y".equals(resposta));
    }
    
}
