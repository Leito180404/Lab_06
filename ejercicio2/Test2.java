package ejercicio2;

import Actividad2.Queue;
import Actividad2.ExceptionEmpty;
public class Test2 {
    public static void main(String[] args) {
        Queue<Integer> queueInt = new QueueArray<>(5);
        Queue<String> queueString = new QueueArray<>(5);
        System.out.println("¿Esta vacia la cola de enteros? " + queueInt.isEmpty());
        System.out.println("¿Esta vacia la cola de strings? " + queueString.isEmpty());
        try {
            queueInt.enqueue(10);
            queueInt.enqueue(20);
            queueInt.enqueue(30);
            queueInt.enqueue(40);
            queueInt.enqueue(50);
            try {
                queueInt.enqueue(60);  // Esto lanzaria una excepcion porque la cola esta llena
            } catch (IllegalStateException e) {
                System.out.println("Error al intentar agregar más elementos: " + e.getMessage());
            }
            System.out.println("Cola de enteros despues de agregar: " + queueInt.toString());
            System.out.println("Frente de la cola de enteros: " + queueInt.front());  // Ver el frente
            System.out.println("ultimo de la cola de enteros: " + queueInt.back());  // Ver el ultimo
            System.out.println("Elemento eliminado (dequeue): " + queueInt.dequeue());  // Eliminar el frente
            System.out.println("Después de eliminar: " + queueInt.toString());
            System.out.println("Frente despues de eliminar: " + queueInt.front());  // Ver el nuevo frente

            queueString.enqueue("Algoritmos");
            queueString.enqueue("Estructuras");
            queueString.enqueue("Datos");
            queueString.enqueue("Pilas");
            queueString.enqueue("Colas");

            System.out.println("Cola de cadenas despues de agregar: " + queueString.toString());
            System.out.println("Frente de la cola de cadenas: " + queueString.front());  // Ver el frente
            System.out.println("ultimo de la cola de cadenas: " + queueString.back());  // Ver el ultimo
            System.out.println("Elemento eliminado (dequeue): " + queueString.dequeue());  // Eliminar el frente
            System.out.println("Despues de eliminar: " + queueString.toString());
            System.out.println("Frente despues de eliminar: " + queueString.front());  // Ver el nuevo frente

        } catch (ExceptionEmpty e) {
            System.out.println("Error detectado: " + e.getMessage());
        }
    }
}


