//Aplicando os conceitos de Sobrecarga de métodos

// Ao escolher uma função, a própria linguagem se encarregará de escolher o melhor parâmetro.
package Aula8_SobrecargaMetodos;

public class Calculadora {
    // ---------------------------> Operações de soma <--------------------------------
    public int soma(int a, int b) {
        return a + b;
    }

    public double soma(double a, double b) {
        return a + b;
    }
    
    public double soma(int a, double b){
        return a + b;
    }
    
    public double soma(double a, int b){
        return a + b;
    }

    //Somatório
    public int soma(int[] numeros) {
        int total = 0;
        for (int i = 0; i < numeros.length; i++) {
            total += numeros[i];
        }
        return total;
    }
    
    public double soma(double[] numeros) {
        int total = 0;
        for (int i = 0; i < numeros.length; i++) {
            total += numeros[i];
        }
        return total;
    }
    
// ---------------------------> Operações de subtração<--------------------------------
    public int diminuir(int a, int b){
        return a - b;
    }
    
    public double diminuir(double a, double b){
        return a - b;
    }
    
    public double diminuir(int a, double b){
        return a - b;
    }
    
    public double diminuir(double a, int b){
        return a - b;
    }
    
    public int diminuir(int[] numeros){
        int total = 0;
        for(int i = numeros.length; i < 0; i--){
            total -= numeros[i];
        }
        return total;
    }
    
    public double diminuir(double[] numeros){
        int total = 0;
        for(int i = numeros.length; i < 0; i--){
            total -= numeros[i];
        }
        return total;
    }
// ---------------------------> Operações de multiplicação<--------------------------------
    public int multiplica(int a, int b){
        return a * b;
    }
    
    public double multiplica(double a, double b){
        return a * b;
    }
    
    //multiplicatório
    public int multiplica(int[] numeros){
        int total = 0;
        for(int i = 0; i < numeros.length; i++){
            total *= numeros[i];
        }
        return total;
    }

// ---------------------------> Operações de divisão<--------------------------------
    //Utilizando o tratamento de erros do Java. Algo parecido com try/excepts do python
    
    public int dividir(int a, int b){
        try {
            //código que pode gerar uma exceção
            int valor = 0;
            valor = a / b;
            return valor;
        } catch (ArithmeticException e) {
            // tratamento da exceção ArithmeticException
            int valor = b / a;
            return valor;
        }
//        finally{
//            //código que sempre será executado
//            System.out.println("Programa encerrado!");
//        }
    }
    
    public double dividir(double a, double b){
        try {
            double valor = 0;
            valor = a / b;
            return valor;
        } catch (ArithmeticException e) {
            double valor = b / a;
            return valor;
        }
    }
    
    public double dividir(int a, double b){
        try {
            double valor = 0;
            valor = a / b;
            return valor;
        } catch (ArithmeticException e) {
            double valor = b / a;
            return valor;
        }
    }
    
    public double dividir(double a, int b){
        try {
            double valor = 0;
            valor = a / b;
            return valor;
        } catch (ArithmeticException e) {
            double valor = b / a;
            return valor;
        }
    }
}
