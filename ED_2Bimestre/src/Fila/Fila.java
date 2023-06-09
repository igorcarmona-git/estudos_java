
package Fila;

import java.util.LinkedList;

// "QualquerTipo" --> Significa qualquer tipo de objeto a classe aceita para construção da Fila.

public class Fila<QualquerTipo> {
    private LinkedList<QualquerTipo> elementos = new LinkedList<>();
    
    public void enfileira(QualquerTipo elemento) {
        elementos.add(elemento);
    }
    
    public QualquerTipo desenfileira() {
        return elementos.removeFirst();
    }
    
    public boolean vazia() {
        return (elementos.size() == 0);
    }
    
    public int tamanho() {
        return elementos.size();
    }
    
    public QualquerTipo primeiro() {
        return elementos.getFirst();
    }
    
    public QualquerTipo ultimo() {
        return elementos.getLast();
    }
    
}
