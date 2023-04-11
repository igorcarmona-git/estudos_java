// Crie uma matriz de inteiros 3x3 e preencha-a com valores aleatórios entre 1 e 10. Em seguida, imprima a matriz na tela.

package Aula4;

import java.util.Scanner;

public class MainMatriz {
    public static void main(String[] args) {
        int [][] matriz = new int[3][3];
        
        System.out.println("Digite os valores para sua matriz!");
        Scanner input = new Scanner(System.in);
       
        //guarda valores
        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = input.nextInt();
            }
        }
        
        //mostra na tela
        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++) {
                String msg = String.format("O valor da matriz [%d][%d] ---> %d", i , j, matriz[i][j]);
                System.out.println(msg);
            }
        }
    } 
}
