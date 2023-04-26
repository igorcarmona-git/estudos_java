package Aula3;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        
        System.out.println("Digite 10 numeros inteiros: ");
        Scanner input = new Scanner(System.in);
        
        for (int cont = 0; cont < vetor.length; cont++) {
            System.out.println("POSICAO: " + cont);
            vetor[cont] = input.nextInt();
        }
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("O valor na posicao: " + i + " --> " + vetor[i]);
        }
        
        System.out.println("A ORDEM INVERSA!");
        for (int inv = vetor.length; inv >= 0; inv--) {
            System.out.println("POSICAO: " + inv);
            System.out.println("O valor na posicao: " + inv + " --> " + vetor[inv]);
        }
    }
}
