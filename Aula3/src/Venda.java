

public class Venda {
    private String nomeComprador;
    private String cidadeComprador;
    private String estadoComprador;
    private boolean vendido;
    private int quantidade;
    
    public int quantidadeVenda(int numVenda){
        int qtdVenda = 0;
        
        if(qtdVenda == 0){
            System.out.println("Voce nao vendeu nenhum produto!");
            qtdVenda = 0;
        }else{
            System.out.println("Voce vendeu um produto!");
            qtdVenda += 1;
        }
        
        return qtdVenda;
    }
    
    //Encapsulamento:
    
    //método get, para retornar valor de variavel
    public String getNomeComprador(){
        return nomeComprador;
    }
    public String getCidadeComprador(){
        return cidadeComprador;
    }
    public String getEstadoComprador(){
        return estadoComprador;
    }
    public boolean getVendido(){
        return vendido;
    }
    public int getQuantidade(){
        return quantidade;
    }
    
       //Método set, para colocar valor a variavel
                                                            //Como parametro posso colocar qualquer nome que irá ser armazenado na variável "primeiroNome"'
    public void setNomeComprador(String NomeCompradorParametro){
        this.nomeComprador = NomeCompradorParametro;
    }
    public void setCidadeComprador(String cidadeCompradorParametro){
        this.cidadeComprador = cidadeCompradorParametro;
    }
    public void setEstadoComprador(String estadoCompradorParametro){
        this.estadoComprador = estadoCompradorParametro;
    }
    public void setVendido(boolean vendidoParametro){
        this.vendido = vendidoParametro;
    }
    public void setQuantidade(int quantidadeParametro){
        this.quantidade = quantidadeParametro;
    }
}
