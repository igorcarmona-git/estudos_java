//1. Crie uma classe chamada Pessoa com os atributos nome e idade. Crie métodos
//para definir e obter os valores desses atributos. Crie um objeto do tipo Pessoa e
//exiba seus valores.

package ListaEncapsulamento;

public class MainPessoa {
    public static void main(String[] args) {
//           Crie uma classe chamada Pessoa com os atributos nome e idade. Crie métodos;
//          para definir e obter os valores desses atributos. Crie um objeto do tipo Pessoa e
//          exiba seus valores.

        Pessoa igor = new Pessoa();
        
        igor.setPrimeiroNome("Igor");
        igor.setUltimoNome("Ortega Carmona.");
        System.out.println("Nome completo: " + igor.getPrimeiroNome() +" " +  igor.getUltimoNome());
        
        igor.setIdade(22);
        System.out.println("Igor tem "+ igor.getIdade() + " anos.");
    }  
}
