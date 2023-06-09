package Pilha;

//  A pilha segue a política de "último a entrar, primeiro a sair" (LIFO - Last In, First Out)

//  O termo "push" refere-se à operação de adicionar um novo elemento no topo da pilha. Essa operação é chamada de "push" porque o novo elemento é empurrado para cima, ocupando a posição mais alta da pilha.
//  O termo "pop" refere-se à operação de remover o elemento do topo da pilha. Essa operação é chamada de "pop" porque o elemento é retirado de cima da pilha, ou seja, é "desempilhado".

public class PilhaExecucao {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);
        
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        
        System.out.println(pilha.pop()); // saída: 30
        
        pilha.push(40);
        pilha.push(50);
        
        System.out.println(pilha.pop()); // saída: 50
    }
    
}
