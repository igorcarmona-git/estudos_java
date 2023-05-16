package Aula14_CRUD;

public class MainBiblioteca {
    public static void main(String[] args) {
        Autor autor = new Autor("Igor Carmona", "118225145-78", "Brasileiro", 23);
        Editora editora = new Editora("Warner Bross", "255569788-0000");
        
        Livro livro1 = new Livro("Pequeno DJ", autor, editora);
        Livro livro2 = new Livro("Prison Break", autor, editora);
        
        Biblioteca lib = new Biblioteca();
        
        lib.inserirLivro(livro1);
        lib.inserirLivro(livro2);
        
        System.out.println(lib.buscar("Prison Break").getTitulo());
        System.out.println(lib.buscar("Prison Break").getAutor().getNome()); //Usando Associação
    }
}
