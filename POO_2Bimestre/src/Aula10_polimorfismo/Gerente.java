package Aula10_polimorfismo;

public class Gerente extends Funcionario{
    @Override
    public double calcularSalario(){
        double result = salarioBase * 3 +  400;
        return result;
    }
}
