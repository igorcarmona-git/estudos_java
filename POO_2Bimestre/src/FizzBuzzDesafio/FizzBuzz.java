package FizzBuzzDesafio;

public class FizzBuzz extends GenericaFizzBuzz{
    int num;
    
    //método construtor puxando do pai
    public FizzBuzz(int number) {
        super(number);
        this.num = number;
    }
    
    //método
    public void FizzBuzz(){
        int n = this.num;
        
            if (n % 3 == 0 && n % 5 == 0)
                System.out.println("FizzBuzz");
            else 
                System.out.println(n);
    }
         
}
   

