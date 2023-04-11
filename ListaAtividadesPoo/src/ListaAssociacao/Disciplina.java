package ListaAssociacao;

public class Disciplina {
    private String nome;
    private int cargaHoraria;

    //getters
    public String getNome() {
        return nome;
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    
    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    //constructors
    public Disciplina(String nome, int cargaHoraria){
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }
}
