//  1. Crie uma classe Carro que possua uma associação com a classe Motor. A classe Motor deve possuir os atributos potencia e cilindrada. Crie também um método na classe
//  Carro chamado acelerar que exibe a mensagem "Acelerando..." e um método chamado desligar que exibe a mensagem "Desligando...".

package ListaAssociacao;

public class MainCarro {
    public static void main(String[] args) {
        Motor mercedes = new Motor();
        Carro mustang = new Carro();
        
        // Setando valores ao objeto Motor.
        mercedes.setCilindrada(500);
        mercedes.setPotencia(200);
        
        mustang.setMarca("Ford");
        mustang.setVelocidade(120);
        
        // Setando um motor ao objeto Carro. (Associação)
        mustang.setMotor(mercedes);
        
        // Método da classe Carro.
        String acelerar = mustang.acelerar();
        System.out.println(acelerar);
        
         //Usando associação de classes
                                                                                                        // Retorno o atributo cilindrada dentro da classe Motor.
        System.out.println("A cilindrada do motor do Mustang: "+mustang.getMotor().getCilindrada());
        System.out.println("A potencia do motor do Mustang: "+mustang.getMotor().getPotencia());
        
        // Método da classe Carro.
        String desligar = mustang.desligar();
        System.out.println(desligar);
        
        //Usando associação de classes
        String motorProblema =mustang.getMotor().motorComProblema();
        System.out.println(motorProblema);
        
        mustang.getMotor().setMotor("Chevrolet");
        System.out.println(mustang.getMotor().getMotor());
    }
    
}
