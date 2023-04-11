//3. Crie uma matriz de inteiros 4x4 e preencha-a com valores aleatórios entre 0 e 9. Em seguida, encontre o maior valor na matriz e imprima-o na tela.

package ListaMatriz;

import java.util.Scanner;

public class MainExercicio3 {
    public static void main(String[] args) {
        int [][] matriz =  new int[4][4];
        
        System.out.println("Preencha a tabela com valores entre 0 e 9: ");
        Scanner input = new Scanner(System.in);
        
        //guarda valores
        for(int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++) {
                int digitado;
                
                do {
                    digitado = input.nextInt();
                    // verifica se os valores aleatórios estão dentro do range
                    if((digitado >= 0) && (digitado <= 9)){
                        matriz[i][j] = digitado;
                        break;
                    }else{
                        System.out.println("Voce digitou valores fora do range! Digite novamente!");
                    } 
                } while (true);
            }
        }
        
        int maior = 0;
        
        //percorrer matriz e verifica qual o maior valor da matriz.
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.println(String.format("Position: [%d][%d] ---> %d ", i,j, matriz[i][j]));
                
                if(matriz[i][j] > maior)
                    maior = matriz[i][j];
            }
        }
        System.out.println("O maior valor da matriz: " + maior);
    }
}
