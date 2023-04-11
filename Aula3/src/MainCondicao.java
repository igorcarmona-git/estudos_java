
import java.util.Scanner;

// Deve rodar somente no próprio arquivo, (botão direito do mouse >> "run file"')
// Não é permitido executar várias Mains em um só local.

public class MainCondicao {
    public static void main(String[] args) {
        System.out.println("Digite sua idade abaixo! ");
       Scanner input = new Scanner(System.in);
        int idade = input.nextInt();
        
        if(idade >= 18){
            System.out.println("Voce e maior de idade! ");
        }else{
            System.out.println("Voce e menor de idade! ");
        }
        
        // Usando switch case.
        int ano = 2000;
        
        switch(ano){
                case 1000:
                    System.out.println("Voce nasceu no ano mil.");
                    break;
                case 2000:
                    System.out.println("Voce nasceu nos anos dois mil.");
                    break;
               
                default:
                    System.out.println("Fimm!!");
        }      
    }  
}
