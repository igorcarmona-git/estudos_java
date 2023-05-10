package FizzBuzzDesafio;

public class Buzz extends GenericaFizzBuzz{
    int num;
    //variavel gambiarra
    int gambiarra = 0;
    
    //método construtor puxando do pai
    public Buzz(int number) {
        super(number);
        this.num = number;
    }
    
    //método
    public void Buzz(){
        int n = this.num;
        
        if (n % 3 == 0 && n % 5 ==0)
           gambiarra += gambiarra; //inutil
        else if (n % 5 == 0)
            System.out.println("Buzz");
    }
    
}

