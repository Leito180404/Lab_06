package Actividad2;

public class Test {
   public static void main(String[] args) {
        QueueLink<Integer> cola = new QueueLink<>();

        System.out.println("¿Esta vacia? " + cola.isEmpty());

        try {
            cola.enqueue(10);
            cola.enqueue(20);
            cola.enqueue(30);
            System.out.println("Cola despues de agregar " + cola.toString()); 

            System.out.println("Frente: " + cola.front());

            System.out.println("atras: " + cola.back()); 

            System.out.println("Elemento eliminado (dequeue): " + cola.dequeue());
            System.out.println("Cola despues de dequeue: " + cola.toString()); 

            System.out.println("Nuevo Frente: " + cola.front()); 
            System.out.println("Nuevo atras: " + cola.back());

            System.out.println("Elemento eliminado (dequeue): " + cola.dequeue());
            System.out.println("Elemento eliminado (dequeue): " + cola.dequeue());

            System.out.println("¿Esta vacia? " + cola.isEmpty());

        } catch (ExceptionEmpty e) {
            System.out.println("Error detectado: " + e.getMessage());
        }
    }
}

