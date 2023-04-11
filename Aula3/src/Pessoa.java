

public class Pessoa {
    private String primeiroNome;
    private String ultimoNome;
    private int idade;
    private int peso;
    private boolean obesidade;
    
    public int andar(int velocidade){
        int velocidadePessoa = 0;
        
        velocidadePessoa = velocidade;
        
        if(velocidadePessoa > 0){
            velocidadePessoa += 1;
        }else{
            velocidadePessoa = 0;
        }
        
        return velocidadePessoa;
    }
    
    //Encapsulamento:
    
    //método get, para retornar valor de variavel
    public String getPrimeiroNome(){
        return primeiroNome;
    }
    public String getUltimoNome(){
        return ultimoNome;
    }
    public int getIdade(){
        return idade;
    }
    public int getPeso(){
        return peso;
    }
    public boolean getObesidade(){
        return obesidade;
    }
    
   //Método set, para colocar valor a variavel
                                                            //Como parametro posso colocar qualquer nome que irá ser armazenado na variável "primeiroNome"'
    public void setPrimeiroNome(String primeiroNomeParametro){
        this.primeiroNome = primeiroNomeParametro;
    }
    public void setUltimoNome(String ultimoNomeParametro){
        this.ultimoNome = ultimoNomeParametro;
    }
    public void setIdade(int idadeParametro){
        this.idade = idadeParametro;
    }
    public void setPeso(int pesoParametro){
        this.peso = pesoParametro;
    }
    public void setObesidade(boolean obesidadeParametro){
        this.obesidade = obesidadeParametro;
    }
}