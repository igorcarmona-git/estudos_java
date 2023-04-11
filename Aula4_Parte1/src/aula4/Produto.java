package aula4;

public class Produto {
    private String nomeProduto;
    private String modeloProduto;
    private String lojaProduto;
    private int pesoProduto;
    private boolean available;
    
    public void imprimirProduto(){
        System.out.println("O nome do produto: " + nomeProduto);
        System.out.println(" O modelo do produto: "+ modeloProduto);
        System.out.println(" O nome da loja: " + lojaProduto);
        System.out.println("Peso do produto: " + pesoProduto);
        System.out.println(" O produto tem a pronta entrega? " + available);
    }
    
    public boolean temEstoque(){
        boolean estoque = this.available;
        
        if(estoque == false){
            System.out.println("Voce nao tem produtos em estoque!");
        }else{
            System.out.println("Voce tem produtos em estoque!");
        }
        
        return estoque;
    }
    
     //Encapsulamento:
    
    //método get, para retornar valor de variavel
    public String getNomeProduto(){
        return nomeProduto;
    }
    public String getModelo(){
        return modeloProduto;
    }
    public String getLojaProduto(){
        return lojaProduto;
    }
    public int getPesoProduto(){
        return pesoProduto;
    }
    public boolean getAvailable(){
        return available;
    }
    
       //Método set, para colocar valor a variavel
                                                            //Como parametro posso colocar qualquer nome que irá ser armazenado na variável "primeiroNome"'
    public void setNomeProduto(String nomeProdutoParametro){
        this.nomeProduto = nomeProdutoParametro;
    }
    public void setModelo(String modeloProdutoParametro){
        this.modeloProduto = modeloProdutoParametro;
    }
    public void setLojaProduto(String lojaProdutoParametro){
        this.lojaProduto = lojaProdutoParametro;
    }
    public void setPesoProduto(int pesoProdutoParametro){
        this.pesoProduto = pesoProdutoParametro;
    }
    public void setAvailable(boolean availableParametro){
        this.available = availableParametro;
    }
}
