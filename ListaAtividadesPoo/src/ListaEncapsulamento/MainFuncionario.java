//6. Crie uma classe chamada Funcionario com os atributos nome, salario e
//departamento. Crie métodos para definir e obter os valores desses atributos,
//bem como para calcular o imposto a ser pago pelo funcionário (10% do salário).
//Crie um objeto do tipo Funcionario e exiba seu nome, salário, departamento e
//imposto a ser pago.

package ListaEncapsulamento;

public class MainFuncionario {
    public static void main(String[] args) {
        Funcionario igor = new Funcionario("Igor", 1800, "Tecnologia");
        
        System.out.println("Nome do Funcionario: " + igor.getNome());
        System.out.println("Salario: " + igor.getSalario());
        System.out.println("Departamento: " + igor.getDepartamento() + "\n");
        System.out.println("Paga 10% de imposto: " + igor.calcularImposto(1800));
    }
    
}
