package Aula14_CRUD;

public class Editora{
    private String nomeEditora;
    private String cnpj;

    //getters
    public String getNomeEditora() {
        return nomeEditora;
    }
    public String getCnpj() {
        return cnpj;
    }

    //setters
    public void setNomeEditora(String nomeEditora) {
        this.nomeEditora = nomeEditora;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    //constructors
    public Editora(String nomeEditora, String cnpj) {
        this.nomeEditora = nomeEditora;
        this.cnpj = cnpj;
    }
        
}
