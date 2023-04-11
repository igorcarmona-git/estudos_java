//  Crie uma classe Carro que possua uma associação com a classe Motor. A classe Motor deve possuir os atributos potencia e cilindrada. Crie também um método na classe
//  Carro chamado acelerar que exibe a mensagem "Acelerando..." e um método chamado desligar que exibe a mensagem "Desligando...".

package ListaAssociacao;

public class Carro {
    private int velocidade;
    private String marca;
    private Motor motor;
    
    //getters
    public int getVelocidade() {
        return velocidade;
    }
    public String getMarca() {
        return marca;
    }
    public Motor getMotor() {
        return motor;
    }
    
    //setters
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    
    //métodos
    public String acelerar(){
        return "Acelerando o carro...";
    }
    public String desligar(){
        return "Desligando o carro...";
    }
}
