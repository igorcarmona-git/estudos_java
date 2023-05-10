//Classe abstrata em Java é uma classe que não pode ser instanciada, ou seja, não é possível criar objetos diretamente a partir dela. 
//Ela serve como uma classe base para outras classes, fornecendo uma estrutura comum e comportamentos gerais que podem ser herdados pelas subclasses.

package Aula12_ClasseAbstrata;

public abstract class Entidade {
    int x, y, velocidade;
    
    public Entidade(int x, int y, int velocidade){
        this.x = x;
        this.y = y;
        this.velocidade = velocidade;
    }
    
    //Obrigatroriamente, vai estar em todas as classes filhas de Entidade.
    public abstract void mover();
    
    public void renderizar(){
        System.out.println("Renderizando...");
    }
}
