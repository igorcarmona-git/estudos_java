//2. Crie uma classe Aluno que possua uma associação com a classe Disciplina. A
//classe Disciplina deve possuir os atributos nome e cargaHoraria. Crie também
//um método na classe Aluno chamado matricular que exibe a mensagem
//"Matriculando aluno na disciplina...".

package ListaAssociacao;

public class MainAluno {
    public static void main(String[] args) {
        Disciplina d = new Disciplina("Tecnologia", 80);
        Disciplina d2 = new Disciplina("Fisica", 40);
        Aluno a = new Aluno();
        Aluno a2 = new Aluno();
        
        //setando uma disciplina ao aluno (associacao)
        a.setDisciplina(d);
        a2.setDisciplina(d2);
        
        System.out.println(a.matricular());
        System.out.println(a2.matricular());
    }
    
}
