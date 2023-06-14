package Aula10_polimorfismo;

public class MainExe5 {
    public static void main(String[] args) {
        Funcionario[] funcionario = new Funcionario[2];
        
        funcionario[0] = new Gerente();
        funcionario[1] = new Operador();
        
        for (Funcionario funcionarioi : funcionario) {
            System.out.println(funcionarioi.getClass().getSimpleName()); //obtém o nome da classe do objeto e retorna o nome da classe sem o pacote com "getSimpleName()"
            System.out.println(String.format("R$%.2f", funcionarioi.calcularSalario()));
        }
    }
    
}
