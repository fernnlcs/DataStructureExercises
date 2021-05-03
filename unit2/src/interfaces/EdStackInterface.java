package interfaces;

import exceptions.EdException;

public interface EdStackInterface <T> {
    
    // Empilha
    void push(T value) throws EdException;

    // Desempilha
    T pop() throws EdException;

    // Retorna topo
    T peek() throws EdException;

    // Exibe pilha completa
    void show();

    // Pilha vazia?
    boolean isEmpty();

    // Pilha cheia?
    boolean isFull();

}
