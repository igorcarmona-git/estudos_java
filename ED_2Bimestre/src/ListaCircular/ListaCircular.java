package ListaCircular;

public class ListaCircular {
    private NoCircular primeiro;
    
    public void adicionar(int valor) {
        NoCircular novoNo = new NoCircular(valor);
        
        if (primeiro == null) {
            primeiro = novoNo;
            novoNo.setProximo(primeiro);
        } else {
            NoCircular ultimo = obterUltimoNo();
            
            novoNo.setProximo(primeiro);
            ultimo.setProximo(novoNo);
        }       
    }
    
    public NoCircular obterUltimoNo() {
        NoCircular atual = primeiro;
        
        while (atual.getProximo() != primeiro) {
            atual = atual.getProximo();
        }
        
        return atual;
    }
    
    public void imprimir() {
        NoCircular atual = primeiro;
        
        do {
            System.out.print(atual.getValor() + " ");
            atual = atual.getProximo();
        } while (atual != primeiro);

        System.out.println();
    }
    
}
