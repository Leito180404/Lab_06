package ejercicio1;
import Actividad1.Stack;
import Actividad1.ExceptionEmpty;
import Actividad2.Node;
import Actividad1.*;
import Actividad2.*;

public class StackLink<E> implements Stack<E> {
    private Node<E> top;

    public StackLink() {
        this.top = null;
    }

    @Override
    public void push(E x) {
        Node<E> newNode = new Node<>(x); 
        newNode.setNext(top);
        top = newNode;
    }

    @Override
    public E pop() throws ExceptionEmpty {
        if (isEmpty()) {
            throw new ExceptionEmpty("La pila está vacía");
        }
        E result = top.getDato();  
        top = top.getNext();
        return result;
    }

    @Override
    public E top() throws ExceptionEmpty {
        if (isEmpty()) {
            throw new ExceptionEmpty("La pila está vacía");
        }
        return top.getDato();  
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }
    
    @Override
    public String toString() {
        if (isEmpty()) {
            return "Pila vacia";
        }
        StringBuilder sb = new StringBuilder();
        Node<E> current = top;
        while (current != null) {
            sb.append(current.getDato()).append(" -> ");
            current = current.getNext();
        }
        return sb.substring(0, sb.length() - 4); 
    }
}