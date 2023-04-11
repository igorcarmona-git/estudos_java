//5. Escreva uma função que receba uma lista de números inteiros como entrada e
//retorne a média desses números.

package ListaFuncoes;

import java.util.Arrays;
import java.util.List;

public class MainExercicio5 {
    public static void main(String[] args) {
        // Cria uma lista do tipo inteiro que vai receber um array  de numeros como lista
        List<Integer> numbers = Arrays.asList(60,30,10,50);
        
        System.out.println("A media dos valores: "+ calcularMedia(numbers));
    }
    
    // Passo por parâmetro a lista de inteiros
    public static double calcularMedia(List<Integer> numbers){
        int total = 0;
        
        // Percorro do inicio da lista até o final
        for (int number : numbers){
            total += number;
        }
        
        // converto o resultado para float 
        //                                tamanho da lista.
        return (double) total/ numbers.size();
    }
}
