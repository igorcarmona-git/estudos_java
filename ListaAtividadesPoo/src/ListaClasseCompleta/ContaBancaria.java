package ListaClasseCompleta;

public class ContaBancaria {
    private String titular;
    private double saldo;
    private int numero;

    //getters
    public String getTitular() {
        return titular;
    }
    public double getSaldo() {
        return saldo;
    }
    public int getNumero() {
        return numero;
    }

    //setters
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    //constructors
    public ContaBancaria(String titular, double saldo, int numero) {
        this.titular = titular;
        this.saldo = saldo;
        this.numero = numero;
    }
    
    
}
