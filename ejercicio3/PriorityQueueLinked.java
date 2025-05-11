package ejercicio3;

import Actividad2.QueueLink;
import Actividad3.ExceptionEmpty;
import Actividad3.PriorityQueue;

public class PriorityQueueLinked<E, N extends Number> implements PriorityQueue<E, N> {
    private QueueLink<E>[] queues;
    private int priorities;

    @SuppressWarnings("unchecked")
    public PriorityQueueLinked(int priorities) {
        this.priorities = priorities;
        this.queues = new QueueLink[priorities];
        for (int i = 0; i < priorities; i++) {
            queues[i] = new QueueLink<>();
        }
    }

    @Override
    public void enqueue(E x, N pr) {
        int priority = pr.intValue();
        if (priority < 0 || priority >= priorities) {
            throw new IllegalArgumentException("Prioridad invalida");
        }
        queues[priority].enqueue(x);
    }
    
    @Override
    public E dequeue() throws ExceptionEmpty {
        for (int i = 0; i < priorities; i++) {
            if (!queues[i].isEmpty()) {
                try {
                    return queues[i].dequeue();
                } catch (Actividad2.ExceptionEmpty e) {
                    throw new ExceptionEmpty("Error al desencolar: " + e.getMessage());
                }
            }
        }
        throw new ExceptionEmpty("La cola de prioridad esta vacia");
    }

    @Override
    public E front() throws ExceptionEmpty {  
        for (int i = 0; i < priorities; i++) {
            if (!queues[i].isEmpty()) {
                try {
                    return queues[i].front();
                } catch (Actividad2.ExceptionEmpty e) {
                    throw new ExceptionEmpty("Error al desencolar: " + e.getMessage());
                }
            }
        }
        throw new ExceptionEmpty("La cola de prioridad esta vacia");
    }

    @Override 
    public E back() throws ExceptionEmpty {
        for (int i = priorities - 1; i >= 0; i--) {
            if (!queues[i].isEmpty()) {
                try {
                    return queues[i].back();
                } catch (Actividad2.ExceptionEmpty e) {
                    throw new ExceptionEmpty("Error al desencolar: " + e.getMessage());
                }
            }
        }
        throw new ExceptionEmpty("La cola de prioridad está vacía");
    }
        @Override
    public boolean isEmpty() {
        for (QueueLink<E> queue : queues) {
            if (!queue.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < priorities; i++) {
            sb.append("Prioridad ").append(i).append(": ");
            sb.append(queues[i].toString()).append("\n");
        }
        return sb.toString();
    }
}








                