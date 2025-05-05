package Actividad2;

public class Test {
   public static void main(String[] args) {
        QueueLink<Integer> queueInt = new QueueLink<>();

        System.out.println("¿Está vacía? " + queueInt.isEmpty());

        try {
            queueInt.enqueue(10);
            queueInt.enqueue(20);
            queueInt.enqueue(30);
            System.out.println("Cola después de encolar 10, 20, 30: " + queueInt.toString()); 

            System.out.println("Front: " + queueInt.front());

            System.out.println("Back: " + queueInt.back()); 

            System.out.println("Elemento eliminado (dequeue): " + queueInt.dequeue());
            System.out.println("Cola después de dequeue: " + queueInt.toString()); 

            System.out.println("Nuevo Front: " + queueInt.front()); 
            System.out.println("Nuevo Back: " + queueInt.back());

            System.out.println("Elemento eliminado (dequeue): " + queueInt.dequeue());
            System.out.println("Elemento eliminado (dequeue): " + queueInt.dequeue());

            System.out.println("¿Está vacía? " + queueInt.isEmpty());

        } catch (ExceptionEmpty e) {
            System.out.println("Error detectado: " + e.getMessage());
        }
    }
}

