package structures;

import exceptions.EdException;
import interfaces.EdSimpleListInterface;

public class EdSimpleList<T> implements EdSimpleListInterface<T> {

    class Node {

        int id;
        T data;
        Node next;

        /**
         * @param data
         */
        public Node(T data) {
            // Atribui o valor do dado
            this.data = data;

            // Atribui o id e incrementa o próximo
            this.id = nextId++;

            // Define o próximo nó como nulo, para indicar que este é o último até agora
            this.next = null;
        }

    }

    private Node head;
    private Node tail;
    private int nextId;
    public int size;

    public EdSimpleList() {
        // Define o tamanho inicial para zero
        this.size = 0;

        // Define o id 1 como o primeiro id a ser preenchido
        this.nextId = 1;

        // Define o início e o fim da lista como nulos
        this.head = null;
        this.tail = null;
    }

    @Override
    public void addFirst(T value) {

        Node newNode = new Node(value);

        if (this.isEmpty()) {

            // Se a lista estiver vazia, o elemento adicionado será o primeiro e último
            this.head = newNode;
            this.tail = newNode;
        } else {

            // O antigo elemento inicial da lista será o próximo do novo elemento inicial
            newNode.next = this.head;

            // O elemento inicial da lista agora é o novo
            this.head = newNode;
        }

        // Incrementa o tamanho
        this.size++;

    }

    @Override
    public void addLast(T value) {

        Node newNode = new Node(value);

        if (this.isEmpty()) {

            // Se a lista estiver vazia, o elemento adicionado será o primeiro e último
            this.head = newNode;
            this.tail = newNode;
        } else {

            // O antigo elemento final recebe o novo como seu sucessor
            this.tail.next = newNode;

            // O elemento final da lista agora é o novo
            this.tail = newNode;
        }

        // Incrementa o tamanho
        this.size++;

    }

    @Override
    public void addAfter(T newValue, int prevValueId) {

        Node previous = this.searchNode(prevValueId);

        if (previous == null) {

            // Se o id não for encontrado, lança uma exceção
            throw new EdException("O id informado não corresponde a nenhum valor.");
        } else {

            // Gera o novo nó
            Node newNode = new Node(newValue);

            // Se 'previous' for o último, ajusta o elemento final
            if (this.isLast(previous)) {
                this.tail = newNode;
            }

            // O sucessor de 'previous' passa a ser o sucessor do novo elemento
            newNode.next = previous.next;

            // O novo elemento passa a ser o sucessor de 'previous'
            previous.next = newNode;

            // Incrementa o tamanho
            this.size++;

        }

    }

    @Override
    public void show() {

        System.out.println("Dados da lista:\n");

        if (this.isEmpty()) {
            System.out.println("Lista vazia!");
            return;
        }

        // Primeiro nó a exibir
        Node current = this.head;

        // Percorre a lista (enquato o nó atual não for o último)
        while (current != null) {
            System.out.println("[id] " + current.id);
            System.out.println(current.data + "\n");

            current = current.next;
        }

        System.out.println("Tamanho: " + this.size);

    }

    @Override
    public T peekFirst() {

        if (this.isEmpty()) {
            throw new EdException("A lista está vazia!");
        }

        return this.head.data;
    }

    @Override
    public T peekLast() {

        if (isEmpty()) {
            throw new EdException("A lista está vazia!");
        }

        return this.tail.data;
    }

    private Node searchNode(int valueId) {

        // Primeiro nó a verificar
        Node current = this.head;

        // Percorre a lista (enquanto o nó atual não for o último)
        while (current != null) {

            // Compara o id do nó da vez com o id solicitado
            if (current.id == valueId) {

                // Retorna o nó, se o id for compatível
                return current;
            }

            // Atualiza para o próximo
            current = current.next;
        }

        // Se nada for encontrado, retorna nulo
        return null;

    }

    @Override
    public T search(int valueId) {

        // Traz o nó correspondente
        Node current = searchNode(valueId);

        // Se o id for incompatível, retorna nulo
        if (current == null) {
            return null;
        } else {
            return current.data;
        }
    }

    @Override
    public T removeFirst() {

        if (this.isEmpty()) {
            throw new EdException("A lista está vazia!");
        }

        Node element = this.head;

        if (this.isLast(element)) {

            // Se existe só um elemento na lista, anula o início e o fim dela
            this.head = null;
            this.tail = null;
        } else {

            // O segundo elemento passa a ser o primeiro
            this.head = this.head.next;
        }

        // Isola o elemento removido
        element.next = null;

        // Decrementa o tamanho
        this.size--;

        return element.data;
    }

    @Override
    public T removeLast() {

        if (this.isEmpty()) {
            throw new EdException("A lista está vazia!");
        }

        Node element = this.tail;

        if (this.isFirst(element)) {

            // Se existe só um elemento na lista, anula o início e o fim dela
            this.head = null;
            this.tail = null;
        } else {

            // Busca o penúltimo elemento
            Node penultimate = this.head;
            while (penultimate.next != this.tail) {
                penultimate = penultimate.next;
            }

            // O penúltimo elemento passa a ser o último
            this.tail = penultimate;
            this.tail.next = null;
        }

        // Decrementa o tamanho
        this.size--;

        return element.data;
    }

    @Override
    public T remove(int valueId) {

        // Lista vazia
        if (this.isEmpty()) {
            throw new EdException("A lista está vazia!");
        }

        // Busca o elemento pelo id
        Node node = this.searchNode(valueId);

        // Se o elemento não existe, lança exceção
        if (node == null) {
            throw new EdException("Este id não corresponde a nenhum elemento!");
        }

        if (isFirst(node) && isLast(node)) {

            // Se o elemento é o único, zera a lista
            this.head = null;
            this.tail = null;
        } else if (isFirst(node)) {

            // Se o elemento é o primeiro, remove o primeiro
            this.removeFirst();
        } else if (isLast(node)) {

            // Se o elemento é o último, remove o último
            this.removeLast();
        } else {

            Node previous = null;

            // Busca elemento anterior
            for (Node prev = this.head; prev != null && prev != node; prev = prev.next) {
                previous = prev;
            }

            if (previous == null) {
                throw new EdException("Erro. Esse elemento não tem anterior. Lista corrompida.");
            }

            // Ajusta a lista
            previous.next = node.next;

            // Isola
            node.next = null;

        }

        // Decrementa o tamanho
        this.size--;

        return null;
    }

    @Override
    public boolean isEmpty() {
        return (this.head == null);
    }

    public boolean isFirst(Node node) {
        return (this.head == node);
    }

    public boolean isLast(Node node) {
        return (this.tail == node);
    }

}
