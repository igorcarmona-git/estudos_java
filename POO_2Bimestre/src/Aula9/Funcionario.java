package Aula9;

public class Funcionario extends Pessoa {
    private double salario;

    //construtor
    public Funcionario(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }
    
    //método
    public double aumentarSalario(double porcento){
        
// O modificador %.0f especifica que o número decimal deve ser formatado sem casas decimais, e o %% é usado para imprimir o símbolo de porcentagem literal na saída. 
// Note que, se você quiser que o número seja formatado com uma quantidade específica de casas decimais, basta ajustar o valor numérico dentro do modificador %.nf (por exemplo, %.2f para 2 casas decimais).

        double aumento = porcento * 0.01;
        this.salario *=  aumento;
        
        return salario;
    }
    
    //Redefinindo um método
    @Override
    public void fazerAniversario(){
        super.fazerAniversario();
        double bonus = this.salario * 0.2;
        
        if(this.idade % 5 == 0){
            this.salario += bonus;
            System.out.println(String.format("Parabéns, %s! Voce agora tem %d anos e ganhou um bonus de R$%f", this.nome,this.idade, bonus));
        }
    }
}


