package Aula7Heranca;

public class MainHeranca {
    public static void main(String[] args) {
        //Quando eu tiver metodos construtores, eu posso usa-los como vazios e alterar seus valores depois.
        
        // OBS: Se eu não tiver nenhum método construtor na classe pai e filho, não precisa setar valores vazios nos parâmetros.
        // Explicação completa na classe Aluno.
        Aluno igor = new Aluno("",0);
        
        igor.setMatricula(55020);
        igor.setIdade(22);
        igor.setNome("Igor");
        
        System.out.println("A matricula: " + igor.getMatricula());
        System.out.println("A idade: "+ igor.getIdade());
        System.out.println( "O nome do aluno: " + igor.getNome());
        
        
    }
    
}
