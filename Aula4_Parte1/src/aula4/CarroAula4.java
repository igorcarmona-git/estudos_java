
package aula4;

public class CarroAula4 {
    private String nome;
    private String marca;
    private boolean usado;
    private int ano;
    private int velocidade; 
    private String modelo;
    
    //método de ação
    public int acelerar(int velocidadeCarro){
        this.velocidade = velocidadeCarro;
        
        int acelerar = 0;
        
        acelerar = velocidade;
        
        if(acelerar < 0){
            System.out.println("O carro está indo para tras! ");
        }else{
            System.out.println("O carro está indo para frente!");
            acelerar += 1;
        }
        
        return acelerar;
    }
    
    //Encapsulamento:
    
    //método get, para retornar valor de variavel
    public String getNome(){
        return nome;
    }
    public String getMarca(){
        return marca;
    }
    public boolean getUsado(){
        return usado;
    } 
    public int getAno(){
        return ano;
    }
    public int getVelocidade(){
        return velocidade;
    }
    public String getModelo(){
        return modelo;
    }
    
    //Método set, para colocar valor a variavel
    public void setNome(String nomeParametro){
        this.nome = nomeParametro;
    }
    public void setMarca(String marcaParametro){
        this.marca = marcaParametro;
    }
    public void setUsado(boolean usadoParametro){
        this.usado = usadoParametro;
    }
    public void setAno(int anoParametro){
        this.ano = anoParametro;
    }
    public void setVelocidade(int velocidadeParametro){
        this.velocidade = velocidadeParametro;
    }
    public void setModelo(String modeloParametro){
        this.modelo = modeloParametro;
    }
}