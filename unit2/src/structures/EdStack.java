package structures;

import exceptions.EdException;
import interfaces.EdStackInterface;

public class EdStack<T> implements EdStackInterface<T> {

    private Object[] array;
    private int size;
    private int top;

    /**
     * @param size
     */
    public EdStack(int size) {
        this.size = size;
        this.top = -1;
        this.array = new Object[size];
    }

    @Override
    public void push(T value) throws EdException {
        
        // Verifica se a pilha já encheu
        if (this.isFull()) {
            throw new EdException("Pilha cheia! Não foi possível inserir o item:\n" + value + "\n");
        }

        // Incrementa o topo
        top += 1;

        // Aloca o valor
        array[top] = value;
        
    }

    @Override
	@SuppressWarnings("unchecked")
    public T pop() throws EdException {

        // Verica se a pilha está vazia
        if (this.isEmpty()) {
            throw new EdException("Pilha vazia! Não há itens para remover!\n");
        }
        
        // Prepara o valor para ser retornado
        T result = (T) array[top];

        // Decrementa o topo (descarta o último valor)
        top -= 1;
        
        // Retorna valor removido
        return result;
    }

    @Override
	@SuppressWarnings("unchecked")
    public T peek() throws EdException {
        
        // Verica se a pilha está vazia
        if (this.isEmpty()) {
            throw new EdException("Pilha vazia! Não há itens para remover!\n");
        }

        // Prepara o valor para ser retornado
        T result = (T) array[top];

        // Retorna valor do topo
        return result;
    }

    @Override
    public void show() {
        
        System.out.println("Dados da pilha:\n");

        // Percorre a pilha e exibe cada dado
        for (int i = 0; i <= this.top; i++) {
            System.out.println("[" + i + "]\n" + this.array[i] + "\n");
        }
        
        // Informa os metadados
        System.out.println("Tamanho: " + this.size);
        System.out.println("Topo: " + this.top + "/" + (this.size - 1) + "\n");

    }

    @Override
    public boolean isEmpty() {
        // Verifica condição de pilha vazia, na qual o topo é -1
        return (this.top == -1);
    }

    @Override
    public boolean isFull() {
        // Verifica se o topo é o valor máximo
        return (this.top == this.size - 1);
    }
    
}
