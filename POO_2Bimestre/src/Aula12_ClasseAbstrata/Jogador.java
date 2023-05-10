package Aula12_ClasseAbstrata;

public class Jogador extends Entidade {

    //Quando se extende deve pegar o construtor da classe pai, obrigatoriamente.
    public Jogador(int x, int y, int velocidade) {
        super(x, y, velocidade);
    }

    //Esse método deve obrigatoriamente ser colocado, porque faz parte da classe abstrata.
    @Override
    public void mover() {
        System.out.println("O player esta andando...");
    }
    
}
