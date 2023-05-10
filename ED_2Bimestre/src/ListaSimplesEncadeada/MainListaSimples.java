package ListaSimplesEncadeada;

public class MainListaSimples {
    public static void main(String[] args) {
        ListaSimplesmenteEncadeada lista = new ListaSimplesmenteEncadeada();
        
        System.out.println(lista.estaVazia());
        System.out.println(lista.tamanho());
        
        lista.adicionar(20);
        lista.adicionar(15);
        lista.adicionar(35);
        
        lista.imprimir();
    }
    
}
