package aula4;

public class Aluno {
    private String primeiroNome;
    private String ultimoNome;
    private String nomeEscola;
    private int idade;
    private boolean matriculado;
    
    //método de ação
    public void imprimirAluno(){
        System.out.println("O primeiro nome: " + primeiroNome);
        System.out.println(" O ultimo nome: "+ ultimoNome);
        System.out.println(" O nome de sua escola: " + nomeEscola);
        System.out.println("Sua idade: " + idade);
        System.out.println(" O meu aluno está matriculado? " + matriculado);
    }
    
    //Encapsulamento:
    
    //método get, para retornar valor de variavel
    public String getPrimeiroNome(){
        return primeiroNome;
    }
    public String getUltimoNome(){
        return ultimoNome;
    }
    public String getNomeEscola(){
        return nomeEscola;
    }
    public int getIdade(){
        return idade;
    }
    public boolean getMatriculado(){
        return matriculado;
    }
    
      //Método set, para colocar valor a variavel
    public void setPrimeiroNome(String primeiroNomeParametro){
        this.primeiroNome = primeiroNomeParametro;
    }
    public void setUltimoNome(String ultimoNomeParametro){
        this.ultimoNome = ultimoNomeParametro;
    }
    public void setNomeEscola(String nomeEscolaParametro){
        this.nomeEscola = nomeEscolaParametro;
    }
    public void setIdade(int idadeParametro){
        this.idade = idadeParametro;
    }
    public void setMatriculado(boolean matriculadoParametro){
        this.matriculado = matriculadoParametro;
    }
}
