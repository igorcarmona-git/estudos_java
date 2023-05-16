package Aula10_polimorfismo;

//O modificador protected é útil quando queremos restringir o acesso a uma variável apenas às subclasses, 
//permitindo que elas acessem e modifiquem seus valores conforme necessário, ao mesmo tempo em que mantém a visibilidade restrita fora do pacote.

public class Veiculo {
    protected int acelerar = 0;
    
    public void acelerar(){
        acelerar += 10;           
        System.out.println(String.format("Voce esta a %d km/h!", acelerar));
    }
}
