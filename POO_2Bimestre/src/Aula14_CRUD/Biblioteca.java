package Aula14_CRUD;

import java.util.ArrayList;

// CRUD
public class Biblioteca {
    ArrayList<Livro> livroLista = new ArrayList<>();
    
    public void inserirLivro(Livro x){
        this.livroLista.add(x);
    }//adicionar

    public void removerLivro(Livro x){
        this.livroLista.remove(x);
    }//remover
    
    public Livro buscar(String nome){
        for (Livro livro : this.livroLista) {
            if(livro.getTitulo().equals(nome))
                return livro;
        }
        return null;
    } //search
    
    public void atualizar(String nomeLivro, String NovoTitulo, Autor novoAutor, Editora novaEditora){
        for (Livro livro : this.livroLista) {
            if (livro.getTitulo().equals(nomeLivro)) {
                livro.setAutor(novoAutor);
                livro.setEditora(novaEditora);
                livro.setTitulo(NovoTitulo);
            }
        }
    }//update
}
