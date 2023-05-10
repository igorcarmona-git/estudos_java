package Aula9_redefinicaoMetodos;

public class Funcionario extends Pessoa {
    private double salario;

    //construtor
    public Funcionario(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }
    
// Método
public void aumentarSalario(double porcento) {
    double aumento = porcento / 100;

    this.salario += this.salario * aumento;

    System.out.printf("O salario de %s foi aumentado em %.0f%%. Novo salario: R$%.2f", this.nome, porcento, this.salario);
}

public void aumentarSalario(int porcento) {
    double aumento = (double) porcento / 100; 

    this.salario += this.salario * aumento;

    System.out.printf("O salario de %s foi aumentado em %d%%. Novo salario: R$%.2f%n", this.nome, porcento, this.salario);
}

    
    //Redefinindo um método
    @Override
    public void fazerAniversario(){
        super.fazerAniversario();
        double bonus = this.salario * 0.2;
        
        if(this.idade % 5 == 0){
            this.salario += bonus;
            System.out.println(String.format("Parabens, %s! Voce agora tem %d anos e ganhou um bonus de R$%.2f", this.nome,this.idade, bonus));
        }
    }
    
}


