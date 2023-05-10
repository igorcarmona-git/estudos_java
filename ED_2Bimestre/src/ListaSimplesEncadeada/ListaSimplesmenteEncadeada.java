package ListaSimplesEncadeada;

public class ListaSimplesmenteEncadeada {
    private Node inicio;
    private int tamanho; //para que tenha o tamanho da lista de forma imediata, sem precisar usar laço de repetição
    
    private class Node {
        int valor; //O construtor recebe um valor como parâmetro e é usado para criar um novo nó.
        Node proximo; // Essa variável é uma referência para o próximo nó na lista.
        
        // Construtor do nó
        // Atualiza o valor do nó e adiciona o próximo nó como vazio
        Node(int valor) {
            this.valor = valor;
            this.proximo = null;
        }
    }
    
    public ListaSimplesmenteEncadeada() {
        this.inicio = null;
        this.tamanho = 0;
    }
    
    //verifica se a lista esta vazia.
    public boolean estaVazia() {
        return inicio == null;
    }
        
    //verifica o tamanho da lista
    public int tamanho() {
        return tamanho;
    }
   
//Método para adicionar
public void adicionar(int valor) {
    //Cria um novo nó com o valor fornecido
    Node novoNo = new Node(valor);
    
    //Verifica se a lista está vazia e se estiver vazia, o novo nó se torna o primeiro nó da lista
    if (inicio == null) {
        inicio = novoNo;
    } else {
        Node atual = inicio;
        
        //Se a lista não estiver vazia, percorre a lista até encontrar o último nó e avança para o próximo nó
        while (atual.proximo != null) {
            atual = atual.proximo;
        }
        
        //Se for nulo, o novo nó é adicionado como o próximo do último nó
        atual.proximo = novoNo;
    }
    tamanho++;
}

    //Método para imprimir os elementos da lista
    public void imprimir() {
         //Cria uma variável 'atual' para percorrer os nós da lista, que aponta para o primeiro nó da lista.
        Node atual = inicio;
        
        if (estaVazia()) {
            System.out.println("Lista vazia");
            return;
        }

        //Loop que percorre os nós da lista até chegar ao final e imprime o valor do nó atual e avança para o próximo nó
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }
}

