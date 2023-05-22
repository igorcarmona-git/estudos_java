package Arvore_Binaria;

public class Recursao {
    public int fatorial(int n) {
    // Caso base: fatorial de 0 ou 1 é 1
            if (n == 0 || n == 1) {
                return 1;
            }
    
    // Chamada recursiva: fatorial de n é n * fatorial(n - 1)
            return n * fatorial(n - 1);
    }

}
