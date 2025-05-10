package ejercicio3;

import Actividad3.ExceptionEmpty;
import Actividad3.PriorityQueue;

public class Test3 {
    public static void main(String[] args) {
        // Crear colas de prioridad para diferentes tipos de datos
        PriorityQueue<Integer, Integer> priorityQueueInt = new PriorityQueueLinked<>(5);
        PriorityQueue<String, Integer> priorityQueueString = new PriorityQueueLinked<>(3);

        System.out.println("¿Está vacía la cola de enteros? " + priorityQueueInt.isEmpty());
        System.out.println("¿Está vacía la cola de cadenas? " + priorityQueueString.isEmpty());

        try {
            // Probar con la cola de enteros
            priorityQueueInt.enqueue(10, 0);  // Prioridad 0
            priorityQueueInt.enqueue(20, 1);  // Prioridad 1
            priorityQueueInt.enqueue(30, 2);  // Prioridad 2
            priorityQueueInt.enqueue(40, 0);  // Prioridad 0
            priorityQueueInt.enqueue(50, 1);  // Prioridad 1

            System.out.println("Cola de enteros después de agregar: " + priorityQueueInt.toString());
            System.out.println("Frente de la cola de enteros: " + priorityQueueInt.front());  // Ver el frente
            System.out.println("Último de la cola de enteros: " + priorityQueueInt.back());  // Ver el último

            // Probar dequeue en la cola de enteros
            System.out.println("Elemento eliminado (dequeue): " + priorityQueueInt.dequeue());  // Eliminar el frente
            System.out.println("Después de eliminar: " + priorityQueueInt.toString());
            System.out.println("Frente después de eliminar: " + priorityQueueInt.front());  // Ver el nuevo frente

            // Probar con la cola de cadenas
            priorityQueueString.enqueue("Algoritmos", 0);  // Prioridad 0
            priorityQueueString.enqueue("Estructuras", 1);  // Prioridad 1
            priorityQueueString.enqueue("Datos", 2);  // Prioridad 2

            System.out.println("Cola de cadenas después de agregar: " + priorityQueueString.toString());
            System.out.println("Frente de la cola de cadenas: " + priorityQueueString.front());  // Ver el frente
            System.out.println("Último de la cola de cadenas: " + priorityQueueString.back());  // Ver el último

            // Probar dequeue en la cola de cadenas
            System.out.println("Elemento eliminado (dequeue): " + priorityQueueString.dequeue());  // Eliminar el frente
            System.out.println("Después de eliminar: " + priorityQueueString.toString());
            System.out.println("Frente después de eliminar: " + priorityQueueString.front());  // Ver el nuevo frente

        } catch (ExceptionEmpty e) {
            System.out.println("Error detectado: " + e.getMessage());
        }
    }
}

