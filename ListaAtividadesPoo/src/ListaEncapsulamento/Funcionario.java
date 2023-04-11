package ListaEncapsulamento;

public class Funcionario {
    private String nome;
    private double salario;
    private String departamento;

    //getters
    public String getNome() {
        return nome;
    }
    public double getSalario() {
        return salario;
    }
    public String getDepartamento() {
        return departamento;
    }
    
    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    //constructos
    public Funcionario(String nome, double salario, String departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }
    
    //metodos
    public double calcularImposto(double salarioFuncionario){
        double result;
        double salario;
        salario = salarioFuncionario;
        
        result = salario * 0.100;
        return result;
    }
    
}
