package interfaces;

public interface EdSimpleListInterface <T> {
    
    // Exibe lista completa
    void show();

    // Adiciona valor ao início da lista
    void addFirst(T value);

    // Adiciona valor ao final da lista
    void addLast(T value);

    // Adiciona valor após outro específico
    void addAfter(T newValue, int prevValueId);

    // Retorna o primeiro elemento da lista
    T peekFirst();
    
    // Retorna o último elemento da lista
    T peekLast();

    // Retorna o valor de acordo com o id solicitado
    T search(int valueId);
    
    // Remove o primeiro item da lista
    T removeFirst();

    // Remove o último item da lista
    T removeLast();

    // Remove o n-ésimo item da lista
    T remove(int valueId); 

    // Lista vazia?
    boolean isEmpty();

}
