package ListaAssociacao;

public class Aluno {
    private Disciplina disciplina;

    //getters
    public Disciplina getDisciplina() {
        return disciplina;
    }
    
    //setters
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    
    //metodos
    public String matricular(){
        return "Matriculando o aluno na disciplina --> " + disciplina.getNome() + " com carga horaria de -->" + disciplina.getCargaHoraria() + " horas.";
    }
}
