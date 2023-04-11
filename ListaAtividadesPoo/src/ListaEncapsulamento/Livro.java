package ListaEncapsulamento;

public class Livro {
    private String titulo;
    private String autor;
    private int ano;
    
    //getters
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getAno() {
        return ano;
    }
    
    //setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    //constructors
    public Livro(String titulo, String autor, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }
    
    //metodos
    public void detalhesLivro(){
        String livroTitulo = this.titulo;
        String livroAutor = this.autor;
        int livroAno = this.ano;
        
        System.out.println("Nome do livro: " + livroTitulo);
        System.out.println("Autor do livro: " + livroAutor);
        System.out.println("Ano do livro: " + livroAno);
        System.out.println();
    }
}
