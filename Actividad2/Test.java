package Actividad2;

public class Test {
   public static void main(String[] args) {
        QueueLink<Integer> queueInt = new QueueLink<>();

        System.out.println("¿Esta vacia? " + queueInt.isEmpty());

        try {
            queueInt.enqueue(10);
            queueInt.enqueue(20);
            queueInt.enqueue(30);
            System.out.println("Cola despues de agregar " + queueInt.toString()); 

            System.out.println("Frente: " + queueInt.front());

            System.out.println("atras: " + queueInt.back()); 

            System.out.println("Elemento eliminado (dequeue): " + queueInt.dequeue());
            System.out.println("Cola despues de dequeue: " + queueInt.toString()); 

            System.out.println("Nuevo Frente: " + queueInt.front()); 
            System.out.println("Nuevo atras: " + queueInt.back());

            System.out.println("Elemento eliminado (dequeue): " + queueInt.dequeue());
            System.out.println("Elemento eliminado (dequeue): " + queueInt.dequeue());

            System.out.println("¿Esta vacia? " + queueInt.isEmpty());

        } catch (ExceptionEmpty e) {
            System.out.println("Error detectado: " + e.getMessage());
        }
    }
}

