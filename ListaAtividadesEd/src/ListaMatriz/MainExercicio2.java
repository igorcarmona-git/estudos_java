//2. Crie uma matriz de strings 2x2 e preencha-a com nomes de frutas. Em seguida,
//imprima a matriz na tela.

package ListaMatriz;

import java.util.Scanner;

public class MainExercicio2 {
    public static void main(String[] args) {
        String [][] matriz = new String[2][2];
        
        System.out.println("Preencha a tabela com nomes de frutas: ");
        Scanner input = new Scanner(System.in);
        
        //percorrer a matriz adicionando as frutas
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                matriz [i][j] = input.nextLine();
            }  
        }
        
        //imprimir a matriz de frutas
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.println(String.format("Position: [%d][%d] ---> Fruta: %s ", i,j, matriz[i][j]));
            }
        }
    }
    
}
