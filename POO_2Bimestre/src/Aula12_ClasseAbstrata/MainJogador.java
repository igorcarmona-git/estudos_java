package Aula12_ClasseAbstrata;

//Voce não consegue instanciar a classe "Entidade" porque ela é abstrata, deve instanciar as classes filhas como "Jogador".

public class MainJogador {
    public static void main(String[] args) {
        Jogador player = new Jogador(20, 10, 50);
        
        player.mover();
        player.renderizar();
    }
    
}
