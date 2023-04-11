package aula5;

public class AlunoUnipar {
    private String nome;
    private String sobrenome;
    private String curso;
    private int nota;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    
    //Construtor
    public AlunoUnipar(String nome, String sobrenome, String curso, int nota) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.curso = curso;
        this.nota = nota;
    }
    
    //Construtor
    public void PrintAluno(String nomeAluno, String sobrenomeAluno, String cursoAluno, int notaAluno){
        this.nome = nomeAluno;
        this.sobrenome = sobrenomeAluno;
        this.curso = cursoAluno;
        this.nota = notaAluno;
        
        System.out.println("O nome do aluno: " + nome + " " + sobrenome);
        System.out.println("Cursando: " + curso);
        System.out.println("Nota atual: " + nota);
    }
    //construtor
    public void fazerProva(){
        String atividade = "Prova de POO";
        if (curso == "ADS" && nota < 10){
            System.out.println("Aluno precisa fazer prova substituta: " + atividade);
        }
    }
    
    //construtor
    public void PassarSerie(){
        if(nota >= 10){
            System.out.println("O aluno conseguiu passar de serie!");
        }else{
            System.out.println("O aluno foi reprovado!");
        }
    }
}
