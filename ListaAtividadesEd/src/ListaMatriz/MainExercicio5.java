//5. Crie uma matriz de inteiros 5x5 e preencha-a com valores aleatórios entre -10 e 10. Em seguida, conte quantos valores negativos há na matriz e imprima o
//resultado na tela.

package ListaMatriz;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class MainExercicio5 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        List<Integer> listaNumeros = new ArrayList<>();
        List<Integer> listaMenores = new ArrayList<>();
        List<Integer> listaMaiores = new ArrayList<>();
        
        System.out.println("Preencha a tabela com valores entre -10 e 10: ");
        Scanner input = new Scanner(System.in);
        
        //guarda valores
        for(int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++) {
                int digitado;
                
                // Executa enquanto for verdade para não armazenar valores fora do range, se o usuário continuar a digitar valores errados.
                do {
                    digitado = input.nextInt();
                    
                    // verifica se os valores aleatórios estão dentro do range
                    if((digitado >= -10) && (digitado <= 10)){
                        matriz[i][j] = digitado;
                        listaNumeros.add(matriz[i][j]);
                    
                        break;
                    }else{
                        System.out.println("Voce digitou valores fora do range! Digite novamente!");
                    } 
                } while (true);
            }          
        }
        
        int contMenor = 0;
        int contMaior = 0;
        
        //  percorro cada elemento da lista separando os valores maiores e menores.
        for (int item : listaNumeros) {
            if (item < 0){
                listaMenores.add(item);
                contMenor += 1;
            }else{
                listaMaiores.add(item);
                contMaior += 1;
            }
        }
        
        System.out.println("Os numeros menores:  " + listaMenores);
        System.out.println("Contador: " + contMenor + "\n");
        
        System.out.println("Os numeros maiores: " + listaMaiores);
        System.out.println("Contador: " + contMaior);
    }
}
