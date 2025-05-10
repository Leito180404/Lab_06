package ejercicio3;

import Actividad3.ExceptionEmpty;
import Actividad3.PriorityQueue;

public class Test3 {
    public static void main(String[] args) {
        PriorityQueue<Integer, Integer> priorityQueueInt = new PriorityQueueLinked<>(5);
        PriorityQueue<String, Integer> priorityQueueString = new PriorityQueueLinked<>(3);

        System.out.println("¿Esta vacia la cola de enteros? " + priorityQueueInt.isEmpty());
        System.out.println("¿Esta vacia la cola de cadenas? " + priorityQueueString.isEmpty());

        try {
            // Probar con la cola de enteros
            priorityQueueInt.enqueue(10, 0); 
            priorityQueueInt.enqueue(20, 1);  
            priorityQueueInt.enqueue(30, 2);  
            priorityQueueInt.enqueue(40, 0);  
            priorityQueueInt.enqueue(50, 1);

            System.out.println("Cola de enteros despues de agregar: " + priorityQueueInt.toString());
            System.out.println("Frente de la cola de enteros: " + priorityQueueInt.front()); 
            System.out.println("ultimo de la cola de enteros: " + priorityQueueInt.back());


            System.out.println("Elemento eliminado (dequeue): " + priorityQueueInt.dequeue());
            System.out.println("Despues de eliminar: " + priorityQueueInt.toString());
            System.out.println("Frente despues de eliminar: " + priorityQueueInt.front());

            // Probar con la cola de cadenas
            priorityQueueString.enqueue("Algoritmos", 0);  
            priorityQueueString.enqueue("Estructuras", 1);  
            priorityQueueString.enqueue("Datos", 2); 

            System.out.println("Cola de cadenas despues de agregar: " + priorityQueueString.toString());
            System.out.println("Frente de la cola de cadenas: " + priorityQueueString.front()); 
            System.out.println("ultimo de la cola de cadenas: " + priorityQueueString.back()); 

            System.out.println("Elemento eliminado (dequeue): " + priorityQueueString.dequeue());  
            System.out.println("Despues de eliminar: " + priorityQueueString.toString());
            System.out.println("Frente despues de eliminar: " + priorityQueueString.front());  
        } catch (ExceptionEmpty e) {
            System.out.println("Error detectado: " + e.getMessage());
        }
    }
}

