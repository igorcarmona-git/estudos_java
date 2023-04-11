//4. Crie uma classe ContaBancaria que possua uma associação com a classe Cliente.
//A classe Cliente deve possuir os atributos nome e cpf. Crie também um método
//na classe ContaBancaria chamado sacar que recebe um parâmetro do tipo
//double e exibe a mensagem "Sacando valor..."

package ListaAssociacao;

public class MainContaBancaria {
    public static void main(String[] args) {
        ContaBancaria banco = new ContaBancaria();
        Cliente usuario = new Cliente("Igor Carmona",11582065);
        
        banco.setCliente(usuario);
        
        System.out.println("Nome do Cliente: " + banco.getCliente().getNome() +" CPF: "+ banco.getCliente().getCpf()); //associacao
        System.out.println(banco.sacar(500));
    }
    
}
