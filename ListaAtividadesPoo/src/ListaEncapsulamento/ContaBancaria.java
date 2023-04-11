package ListaEncapsulamento;

public class ContaBancaria {
//      Crie uma classe chamada ContaBancaria com os atributos numero, saldo e
//      titular. Crie métodos para definir e obter os valores desses atributos, bem como
//      para depositar e sacar dinheiro da conta. Crie um objeto do tipo ContaBancaria
//      e realize algumas operações de depósito e saque.
    
    private float numero;
    private float saldo;
    private String titular;
    
    //Métodos get
    public float getNumero(){
        return numero;
    }
    public float getSaldo(){
        return saldo;
    }
    public String getTitular(){
        return titular;
    }
    
    //Métodos set
    public void setNumero(float numeroParametro){
        this.numero = numeroParametro;
    }
    public void setSaldo(float saldoParametro){
        this.saldo = saldoParametro;
    }
    public void setTitular(String titularParametro){
        this.titular = titularParametro;
    }
    
    public float Depositar(float num){
        float carteira = num;
        carteira += this.saldo;
        
        return carteira;
    }
    
    public float SacarDinheiro(float num, float saldo){
        float dinheiro = num;
        saldo = this.saldo;
        
        saldo -= dinheiro;
        System.out.println("Voce sacou: R$" + num + " da carteira.");
        
        return saldo;
    }
}
