package Aula9_redefinicaoMetodos;

public class MainRedefinicao {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Joao", 25, 3000.0);
        
        funcionario1.fazerAniversario();
        
        funcionario1.aumentarSalario(10);
        funcionario1.fazerAniversario();
        funcionario1.fazerAniversario();
        funcionario1.fazerAniversario();
        funcionario1.fazerAniversario();
        
        funcionario1.aumentarSalario(5);
    }
    
}
