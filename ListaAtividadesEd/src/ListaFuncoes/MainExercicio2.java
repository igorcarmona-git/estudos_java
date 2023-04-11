// 2 - Escreva uma função que receba um número inteiro como entrada e verifique se
//esse número é par ou ímpar. A função deve retornar verdadeiro se for par e
//falso se for ímpar.

package ListaFuncoes;

public class MainExercicio2 {
    public static void main(String[] args) {
        System.out.println(verificarNum(6));
    }
    
    public static boolean verificarNum(int num){
        int result = num;
        
        if(result % 2 == 0){
            System.out.println("Esse numero ele eh par: ");
            return true;
        }else{
            System.out.println("Esse numero eh impar: ");
            return false;
        }
    }
}
