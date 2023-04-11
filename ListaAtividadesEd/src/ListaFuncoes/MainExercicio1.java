//1 - Escreva uma função que receba um número inteiro como entrada e retorne o
//dobro desse número.

package ListaFuncoes;

public class MainExercicio1 {
    public static void main(String[] args) {
        int valor = valorDobrado(5);
        
        System.out.println("O dobro: " + valor);
    }
    
    public static int valorDobrado(int num){
        int result = num * num;
        return result;
    }
    
}
