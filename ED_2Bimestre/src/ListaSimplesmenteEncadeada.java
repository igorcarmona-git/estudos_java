public class ListaSimplesmenteEncadeada {
    private Node inicio;
    private int tamanho;
    
    private class Node {
        int valor;
        Node proximo;
        
        Node(int valor) {
            this.valor = valor;
            this.proximo = null;
        }
    }
}
