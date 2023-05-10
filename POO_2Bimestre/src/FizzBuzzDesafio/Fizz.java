package FizzBuzzDesafio;

public class Fizz extends GenericaFizzBuzz{
    int num;
    //variavel gambiarra
    int gambiarra = 0;
    
    //método construtor puxando do pai
    public Fizz(int number) {
        super(number);
        this.num = number;
    }
    
    //método
    public void Fizz(){
        int n = this.num;
        
        if (n % 3 == 0 && n % 5 ==0)
            gambiarra += gambiarra; //inutil
        else if (n % 3 == 0)
            System.out.println("Fizz");   
    }
    
}
