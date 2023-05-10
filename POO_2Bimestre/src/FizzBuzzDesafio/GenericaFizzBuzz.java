package FizzBuzzDesafio;

public class GenericaFizzBuzz {
    int laco;

    //Constructor para receber contagem
    public GenericaFizzBuzz(int repeticoes) {
        this.laco = repeticoes;
    }
    
    //método de print na tela
    public void printTela(){
        for (int i = 1; i <= this.laco; i++) {
            Fizz fizz = new Fizz(i);
            fizz.Fizz(); //chama método
            
            Buzz buzz = new Buzz(i);
            buzz.Buzz(); //chama método
            
            FizzBuzz fizzbuzz = new FizzBuzz(i);
            fizzbuzz.FizzBuzz(); //chama método
        }
    }
    
}
