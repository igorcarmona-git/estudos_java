//Classe com métodos utlizando tratamento de erros

package Aula11_TryCatch;

public class Divisao {
    int a, b, resultado;
    
    public Divisao(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    public void dividir(){
        try {
            this.resultado = this.a / this.b;
        } catch (ArithmeticException e) {
           System.out.println("ERRO: Divisao por zero!");
        }
    }
    
    public double printResultado(){
        return this.resultado;
    }
}
