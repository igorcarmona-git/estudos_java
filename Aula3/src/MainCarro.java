import java.util.Scanner;

// Como boas práticas de programação, é interessante voce utilizar encapsulamento (private).

// Para executar você pode apertar a tecla ''F6"'
public class MainCarro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Ele espera por uma entrada do usuário e lê a entrada até que uma nova linha seja encontrada (ou seja, quando o usuário pressiona a tecla "Enter"). 
        String teclado1 = input.nextLine();
        
        //  Lê a próxima entrada do usuário como um inteiro. Ele espera por uma entrada do usuário e tenta ler um inteiro a partir dessa entrada.
        int teclado2 = input.nextInt();
        
        System.out.println("O valor: " + teclado1);
        System.out.println("O valor: " + teclado2);
        
        Carro gol = new Carro("Preto", "Fiat", 2020, true);
        Carro corsa = new Carro("Prata", "Chevrolet", 2015, false);
        
        // Modifica o valor de determinada coisa no objeto.
        System.out.println(gol.getCor());
        gol.setCor("Azul");
        
        // get retorna o valor de determinada coisa de um objeto.
        System.out.println(gol.getCor());
    }  
}
