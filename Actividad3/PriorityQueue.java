package Actividad3;

public interface PriorityQueue<E, N> {
    void enqueue(E x, N pr);
    E dequeue() throws ExceptionEmpty;
    E front() throws ExceptionEmpty;
    E back() throws ExceptionEmpty;
    boolean isEmpty();
} 