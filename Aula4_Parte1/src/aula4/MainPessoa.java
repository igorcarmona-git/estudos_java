package aula4;

public class MainPessoa {
    public static void main(String[] args) {
        Pessoa igor = new Pessoa();
        
        igor.setPrimeiroNome("Igor");
        igor.setUltimoNome("Ortega Carmona.");
        System.out.println("Nome completo: " + igor.getPrimeiroNome() +" " +  igor.getUltimoNome());
        
        igor.setIdade(22);
        System.out.println("Igor tem "+ igor.getIdade() + " anos.");
    }  
}
