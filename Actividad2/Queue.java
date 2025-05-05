package Actividad2;

public interface Queue<E> {
    void enqueue(E x);
    E dequeue() throws ExceptionEmpty;
    E front() throws ExceptionEmpty;
    E back() throws ExceptionEmpty;
    boolean isEmpty();
} 