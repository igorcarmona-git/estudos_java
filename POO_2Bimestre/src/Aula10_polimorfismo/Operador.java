package Aula10_polimorfismo;

public class Operador extends Funcionario{
    @Override
    public double calcularSalario(){
        double result = salarioBase * 1.5 + 100;
        return result;
    }
}
