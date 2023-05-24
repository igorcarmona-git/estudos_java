package Jogo_da_Velha;

import java.util.Scanner;

public class JogarGame {
    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro();
        Jogador jogador1 = new Jogador("Joao", '1');
        Jogador jogador2 = new Jogador("Maria", '2');
        
        Scanner input = new Scanner(System.in);

        boolean jogoTerminado = false;
        tabuleiro.setJogador(jogador1);
       
        while (!jogoTerminado) {
            
            tabuleiro.imprimirTabuleiro();
            
            System.out.println("Jogador " + tabuleiro.getJogador().getNome() + ", faça sua jogada.");
            System.out.print("Informe a linha (0-2): ");
            int linha = input.nextInt();
            System.out.print("Informe a coluna (0-2): ");
            int coluna = input.nextInt();

            boolean movimentoValido = tabuleiro.realizarMovimento(linha, coluna, tabuleiro.getJogador());

            if (movimentoValido) {
                if (tabuleiro.verificarVitoria()) {
                    System.out.println("Parabéns, " + tabuleiro.getJogador().getNome() + "! Você venceu o jogo.");
                    jogoTerminado = true;
                } else if (tabuleiro.tabuleiroCompleto()) {
                    System.out.println("O jogo empatou!");
                    jogoTerminado = true;
                } else {
                    // Trocar para o próximo jogador
                    if (tabuleiro.getJogador() == jogador1) {
                        tabuleiro.setJogador(jogador2);
                    } else {
                        tabuleiro.setJogador(jogador1);
                    }
                }
            } else {
                System.out.println("Jogada inválida. Tente novamente.");
            }
        }
    
    }
}
