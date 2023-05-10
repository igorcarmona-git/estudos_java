//Tratamento de erros realizado de forma orientada a objetos

package Aula11_TryCatch;

import java.util.Scanner;

public class MainPOO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner saida = new Scanner(System.in);
        
        int a, b;
        String resposta;
        
        do{            
            System.out.println("Digite o valor de a: ");
            a = input.nextInt();
            System.out.println("Digite o valor de b: ");
            b = input.nextInt();
            
            Divisao div = new Divisao(a, b);
            div.dividir();
            System.out.println(div.printResultado());
            
            System.out.println("Voce quer sair? Digite Y or n");
            resposta = saida.nextLine();
            
        }while(!"Y".equals(resposta));
    }
    
}
