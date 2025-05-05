package Actividad3;

public class Node<T> {
    private T dato;
    private Node<T> next;

    public Node(T dato) {
        this.dato = dato;
        this.next = null;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + dato +
                ", next=" + next +
                '}';
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; 
        }
        Node<?> otherNode = (Node<?>) obj;
        return dato.equals(otherNode.dato);
    }
}

