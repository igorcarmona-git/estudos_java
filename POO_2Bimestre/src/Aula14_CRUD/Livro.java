package Aula14_CRUD;

public class Livro {
    private String titulo;
    private Autor autor;
    private Editora editora;

    //getters
    public String getTitulo() {
        return titulo;
    }
    public Autor getAutor() {
        return autor;
    }
    public Editora getEditora() {
        return editora;
    }
    
    //setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    public void setEditora(Editora editora) {
        this.editora = editora;
    }  
    
    //constructors
    public Livro(String titulo, Autor autor, Editora editora) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
    }

}
