package Lista_DuplaEncadeada;

public class DuplamenteEncadeada {
    Node cabeca;
    int tamanho;
    
    public DuplamenteEncadeada() {
        this.cabeca = null;
        this.tamanho = 0;
    }
    
    public void adicionar(int data) {
    Node novoNode = new Node(data);
    
    if (cabeca == null) {
        cabeca = novoNode;
    } else {
        Node corrente = cabeca;
        
        while (corrente.next != null) {
            corrente = corrente.next;
        }
        
        corrente.next = novoNode;
        novoNode.prev = corrente;
    }
    tamanho++;
    }
    
    public void remover(int data) {
        if (cabeca == null) {
            return;
        }
        
        if (cabeca.data == data) {
            cabeca = cabeca.next;
            cabeca.prev = null;
            tamanho--;
        }
        
        Node corrente = cabeca;
        
        while (corrente != null && corrente.data != data) {
            corrente = corrente.next;
        }
        if (corrente == null) {
            return;
        }
        if (corrente.next != null) {
            corrente.next.prev = corrente.prev;
        }
        
        corrente.prev.next = corrente.next;
            tamanho--;
        }
    
    public int getTamanho() {
        return tamanho;
    }
    
    public void imprimir() {
        Node corrente = cabeca;
        
        while (corrente != null) {
            System.out.print(corrente.data + " ");
            corrente = corrente.next;
        }
        System.out.println();
    }
    
}