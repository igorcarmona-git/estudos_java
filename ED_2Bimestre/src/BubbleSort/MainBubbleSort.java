package BubbleSort;

import java.util.Arrays;

public class MainBubbleSort {
    public static void bubbleSort(int[] array) {
        int tam = array.length;
        
        for (int i = 0; i < tam - 1; i++) {
            for (int j = 0; j < tam - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // array[j] = 3 > array[j +1] = 5
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // j = (6 - 0 -1) 5
        // j = (6 - 1 -1) 4
        
        int[] array = { 3, 5, 1, 8, 1, 4 };
        System.out.println("Array antes da ordenacao: " + Arrays.toString(array));

        bubbleSort(array);

        System.out.println("Array apos a ordenacao: " + Arrays.toString(array));
    }
}
