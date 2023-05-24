                                            //Diferenças do print [na linha 29]
//System.out.println() --> com 'ln' no final: Vai printando na tela pulando linha
//System.out.print() --> sem 'ln' no final: Printa na tela sem pular linha

package Jogo_da_Velha;

public class Tabuleiro {
    private Jogador jogador;
    private char [][] caderno;

    //getters
    public Jogador getJogador() {
        return jogador;
    }
    public char[][] getCaderno() {
        return caderno;
    }
    
    //setters
    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }
    public void setCaderno(char[][] caderno) {
        this.caderno = caderno;
    }
    
    //construtor
    public Tabuleiro() {
        this.caderno = new char [3][3];
        this.jogador = null;
        inicializarCaderno();
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

    public boolean realizarMovimento(int linha, int coluna, Jogador jogador) {
        if (linha < 0 || linha >= 3 || coluna < 0 || coluna >= 3 || caderno[linha][coluna] != '-') {
            return false;
        }

        caderno[linha][coluna] = jogador.getSimbolo();
        return true;
    }

    public boolean verificarVitoria() {
        for (int i = 0; i < 3; i++) {
            // Verificar linhas
            if (caderno[i][0] != '-' && caderno[i][0] == caderno[i][1] && caderno[i][0] == caderno[i][2]) {
                return true;
            }
            // Verificar colunas
            if (caderno[0][i] != '-' && caderno[0][i] == caderno[1][i] && caderno[0][i] == caderno[2][i]) {
                return true;
            }
        }
        
        // Verificar diagonais
        if (caderno[0][0] != '-' && caderno[0][0] == caderno[1][1] && caderno[0][0] == caderno[2][2]) {
            return true;
        }
        if (caderno[0][2] != '-' && caderno[0][2] == caderno[1][1] && caderno[0][2] == caderno[2][0]) {
            return true;
        }

        return false;
    }

    public boolean tabuleiroCompleto() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (caderno[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

}
