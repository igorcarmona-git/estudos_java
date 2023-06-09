package Lista_DuplaEncadeada;

public class MainDuplamenteEncadeada {
    public static void main(String[] args) {
        DuplamenteEncadeada lista = new DuplamenteEncadeada();
        
        lista.adicionar(10);
        lista.adicionar(20);
        lista.adicionar(30);
        
        System.out.println("Elementos da lista:");
        lista.imprimir();

        System.out.println("Tamanho da lista: " + lista.getTamanho());
        
        lista.remover(20);

        System.out.println("Elementos da lista após a remoção:");
        lista.imprimir();
        
        System.out.println("Tamanho da lista após a remoção: " + lista.getTamanho());
    }
    
}
