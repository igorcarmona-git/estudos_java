package BubbleSort;

import java.util.Arrays;

public class MainBubbleSort {
    public static void bubbleSort(int[] array) {
        int tam = array.length;
        
        for (int i = 0; i < tam; i++) {
            for (int j = i + 1; j < tam; j++) {
                if (array[i] > array[j]) {
                    int aux = array[j];
                    array[j] = array[i];
                    array[i] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[5000];
        int tam = array.length;
        
        for (int i = 0; i < tam; i++) {
                array[i] = (int) (Math.random() * tam);
        }
        
        System.out.println("Array antes da ordenacao: " + Arrays.toString(array));
        
        long inicio = System.currentTimeMillis(); //Captura o tempo atual em milissegundos antes de iniciar a ordenação.
        bubbleSort(array);
        long fim =System.currentTimeMillis(); //Captura o tempo atual em milissegundos após a conclusão da ordenação.

        System.out.println("Array apos a ordenacao: " + Arrays.toString(array));
        
        System.out.println("Tempo: " + (fim-inicio) + " m/s");
    }
}
