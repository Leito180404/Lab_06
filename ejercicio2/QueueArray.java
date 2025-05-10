package ejercicio2;
import Actividad2.Queue;
import Actividad2.ExceptionEmpty;

public class QueueArray<E> implements Queue<E> {
    private E[] data;
    private int first; 
    private int last;  
    private int size; 

    public QueueArray(int capacity) {
        this.data = (E[]) new Object[capacity];
        this.first = 0;
        this.last = -1;
        this.size = 0;
    }

    @Override
    public void enqueue(E x) {
        if (size == data.length) {
            throw new IllegalStateException("La cola esta llena");
        }
        last = (last + 1) % data.length;  // Aritmetica modular para el ultimo indice
        data[last] = x;
        size++;
    }

    @Override
    public E dequeue() throws ExceptionEmpty {
        if (isEmpty()) {
            throw new ExceptionEmpty("esta vacio");
        }
        E dataToReturn = data[first];
        first = (first + 1) % data.length;  // Aritmetica modular para el primer indice
        size--;
        return dataToReturn;
    }

    @Override
    public E front() throws ExceptionEmpty {
        if (isEmpty()) {
            throw new ExceptionEmpty("esta vacio");
        }
        return data[first];
    }

    @Override
    public E back() throws ExceptionEmpty {
        if (isEmpty()) {
            throw new ExceptionEmpty("esta vacio");
        }
        return data[last];
    }
    @Override
    public boolean isEmpty() {
        return size == 0;
    }


    @Override
    public String toString() {
        if (isEmpty()) {
            return "Cola vacia";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(data[(first + i) % data.length]).append(" ");  
        }
        return sb.toString().trim();
    }
}
