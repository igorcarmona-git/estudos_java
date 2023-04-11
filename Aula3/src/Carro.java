public class Carro{
    
    // São modificadores de acesso. Voce definir como publico, consegue alterar na main, fora da classe.
    // tipos primitivos: int, String, char, float, double, boolean, byte, short, long
    
    private String cor;
    private String marca;
    private int ano;
    private boolean usado;

    // get é usado para capturar o valor do atributo.
    public String getCor(){
        return cor;
    }
    public String getMarca(){
        return marca;   
    }
    public int getAno(){
        return ano;
    }
    public boolean getUsado(){
        return usado;
    }

    // Set é usado para atribuir um valor ao atributo.
    public void setCor(String cor){
        this.cor = cor;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public void setUsado(boolean usado){
        this.usado = usado;
    }
    
    // Construção de classe com parâmetros
    public Carro(String cor, String marca, int ano, boolean usado){
        this.cor = cor;
        this.marca = marca;
        this.ano = ano;
        this.usado = usado;
    }
    
    // Construção de classe sem parametro 
    
   // public Carro(){
    //    this.cor = cor;
    //    this.marca = marca;
    //    this.ano = ano;
    //    this.usado = usado;
   // }
}