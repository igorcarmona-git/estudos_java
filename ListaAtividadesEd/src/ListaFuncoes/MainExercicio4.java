//4. Escreva uma função que receba dois números como entrada e retorne o menor
//deles.

package ListaFuncoes;

public class MainExercicio4 {
    public static void main(String[] args) {
        System.out.println("O menor valor: " + menorValor(30, 15));
    }
    
    public static int menorValor(int x, int y){
        int valor1 = x;
        int valor2 = y;
        
        if(valor1 < valor2)
            return valor1;
        else
            return valor2;
    }
}
