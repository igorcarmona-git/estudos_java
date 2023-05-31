                                            //Diferenças do print [na linha 29]
//System.out.println() --> com 'ln' no final: Vai printando na tela pulando linha
//System.out.print() --> sem 'ln' no final: Printa na tela sem pular linha

package Jogo_da_Velha;

public class Tabuleiro {
    private Jogador jogador;
    private char [][] caderno;

    //construtor
    public Tabuleiro() {
        this.caderno = new char [3][3];
        this.jogador = null;
    }   
    
    //metodos
    public void inicializarCaderno(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                caderno[i][j] = '-';
            }
        }
    }
    
    public void imprimirTabuleiro(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(caderno[i][j] = '-');
            }
            System.out.println();
        }
    }
    
}
