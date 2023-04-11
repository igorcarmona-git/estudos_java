//4. Crie uma matriz de inteiros 3x3 e preencha-a com valores aleatórios entre 1 e 100. Em seguida, calcule a média dos valores da matriz e imprima-a na tela.

// label --> permite controlar o fluxo do programa, voce ir em determinada parte do código, usa-se exemplo --> verification:

package ListaMatriz;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class MainExercicio4 {
    public static void main(String[] args) {
        int [][] matriz = new int[3][3];
        
        List<Integer> listaNumeros = new ArrayList<>();
        
        System.out.println("Preencha a tabela com valores entre 1 e 100: ");
        Scanner input = new Scanner(System.in);
        
        //guarda valores
        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++) {
                int digitado;
                
                // Executa enquanto for verdade para não armazenar valores fora do range, se o usuário continuar a digitar valores errados.
                do {
                    digitado = input.nextInt();
                    
                    // verifica se os valores aleatórios estão dentro do range
                    if((digitado >= 1) && (digitado <= 100)){
                        matriz[i][j] = digitado;
                        listaNumeros.add(matriz[i][j]);
                    
                        break;
                    }else{
                        System.out.println("Voce digitou valores fora do range! Digite novamente!");
                    } 
                } while (true);
            }          
        }
        int total = 0;
        
        //  percorro cada elemento da lista somando eles a variavel total.
        for(int number : listaNumeros){
            total += number;
        }
        
        System.out.println("A media dos valores: " + total / listaNumeros.size());
    }
}
