package Actividad1;

public interface Stack<E> {
    void push(E x);
    E pop() throws ExceptionEmpty;
    E top() throws ExceptionEmpty;
    boolean isEmpty();
}
