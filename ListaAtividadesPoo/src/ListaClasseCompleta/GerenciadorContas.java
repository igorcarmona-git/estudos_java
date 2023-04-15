package ListaClasseCompleta;

import java.util.List;
import java.util.ArrayList;

public class GerenciadorContas {
    List<ContaBancaria> listaConta;

    //getters
    public List<ContaBancaria> getConta() {
        return listaConta;
    }

    //constructors
    public GerenciadorContas(){
        // Ao chamar o construtor, ele cria uma lista vazia de ContaBancaria
        this.listaConta = new ArrayList<>();
    }
    
    //metodos
    public void adicionarConta(ContaBancaria contaBanco) {
        listaConta.add(contaBanco);
    }
    
    public void removerConta(ContaBancaria contaBanco){
        listaConta.remove(contaBanco);
    }
    public String consultarContas(ContaBancaria contaBanco){
        for(ContaBancaria item : listaConta){
            if(item.getTitular().equals(contaBanco.getTitular())){
                imprimirConta(contaBanco);
                return "A conta existe no cadastro.";
            }
        }
        return "Vazio";
    }
    
    public void imprimirConta(ContaBancaria contaBanco){
        System.out.println("Conta do Banco --> " + contaBanco.getTitular());
        System.out.println("O endereco do cliente --> " + contaBanco.getSaldo());
        System.out.println("O telefone do cliente --> " + contaBanco.getNumero());
        System.out.println();
    }
}
