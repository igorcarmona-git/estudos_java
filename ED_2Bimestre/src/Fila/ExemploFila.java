package Fila;

public class ExemploFila {
    public static void main(String[] args) {
        Fila<String> fila = new Fila<>();
        
        fila.enfileira("elemento 1");
        fila.enfileira("elemento 2");
        fila.enfileira("elemento 3");
        
        System.out.println("Tamanho da fila: " + fila.tamanho());
        System.out.println("Primeiro elemento: " + fila.primeiro());
        System.out.println("Ultimo elemento: " + fila.ultimo());
        
        System.out.println("Removendo elementos...");
        
        System.out.println("Elemento removido: " + fila.desenfileira());
        System.out.println("Elemento removido: " + fila.desenfileira());
        System.out.println("Elemento removido: " + fila.desenfileira());
        
        System.out.println("Fila vazia? " + fila.vazia());
    }
}
