//3. Crie uma classe Pessoa que possua uma associação com a classe Telefone. A
//classe Telefone deve possuir os atributos ddd e numero. Crie também um
//método na classe Pessoa chamado ligar que recebe um parâmetro do tipo
//Telefone e exibe a mensagem "Ligando para o número: ddd numero..."

package ListaAssociacao;

public class MainPessoa {
    public static void main(String[] args) {
        Pessoa igor = new Pessoa();
        Telefone telefone = new Telefone(44,999765469);
        
        igor.setTelefone(telefone);
        
        System.out.println(igor.ligar(telefone));
    }
    
}
