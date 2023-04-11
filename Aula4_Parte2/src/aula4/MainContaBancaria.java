package aula4;

import java.util.Scanner;

public class MainContaBancaria {
    public static void main(String[] args) {
    //      Crie uma classe chamada ContaBancaria com os atributos numero, saldo e
    //      titular. Crie métodos para definir e obter os valores desses atributos, bem como
    //      para depositar e sacar dinheiro da conta. Crie um objeto do tipo ContaBancaria
    //      e realize algumas operações de depósito e saque.

        ContaBancaria nubank = new ContaBancaria();

        float valor = 0;
        float saldo = 0;
        float banco;
        float saque = 0;
        float deposito = 0;
        String nome = "";

        System.out.println("Digite o numero da sua conta: ");
        Scanner input = new Scanner(System.in);
        valor = input.nextInt();

        nubank.setNumero(valor);
        System.out.println("CONTA: " + nubank.getNumero());

        System.out.println("Digite o seu deposito da conta: ");
        Scanner input2 = new Scanner(System.in); 
        saldo = input2.nextFloat();

        System.out.println("Digite o titular da conta: ");
        Scanner input3 = new Scanner(System.in);
        nome = input3.nextLine();

        nubank.setTitular(nome);
        System.out.println("TITULAR DA CONTA: " + nubank.getTitular());
        
        banco = nubank.Depositar(saldo);
        
        System.out.println("Eu tenho saldo de: R$" + banco);
    }
}
