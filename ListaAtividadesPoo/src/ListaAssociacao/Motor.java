//  Crie uma classe Carro que possua uma associação com a classe Motor. A classe Motor deve possuir os atributos potencia e cilindrada. Crie também um método na classe
//  Carro chamado acelerar que exibe a mensagem "Acelerando..." e um método chamado desligar que exibe a mensagem "Desligando...".

package ListaAssociacao;

public class Motor {
    private String motor;
    private int potencia;
    private int cilindrada;

    //getters
    public int getPotencia() {
        return potencia;
    }
    public int getCilindrada() {
        return cilindrada;
    }
    public String getMotor() {
        return motor;
    }
    
    //setters
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    public void setMotor(String motor) {
        this.motor = motor;
    }
    
    //Metodos
    public String motorComProblema(){
        return "Motor esta com defeito, repare!";
    }
    
}
