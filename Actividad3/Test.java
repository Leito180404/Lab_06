package Actividad3;

public class Test {
    public static void main(String[] args) {
        PriorityQueueLinkSort<Integer, Integer> colaPrioridad = new PriorityQueueLinkSort<>();

        System.out.println("¿Está vacía? " + colaPrioridad.isEmpty());

        try {
            colaPrioridad.enqueue(10, 2);  // Elemento 10 con prioridad 2
            colaPrioridad.enqueue(20, 1);  // Elemento 20 con prioridad 1 (menor prioridad)
            colaPrioridad.enqueue(30, 3);  // Elemento 30 con prioridad 3 (mayor prioridad)
            
            System.out.println("Cola después de agregar: " + colaPrioridad.toString()); 

            // Mostrar el primer y ultimo elemento
            System.out.println("Frente (maxima prioridad): " + colaPrioridad.front());
            System.out.println("Atras (minima prioridad): " + colaPrioridad.back()); 

            System.out.println("Elemento eliminado: " + colaPrioridad.dequeue());
            System.out.println("Cola ahora: " + colaPrioridad.toString()); 

            System.out.println("Nuevo Frente: " + colaPrioridad.front()); 
            System.out.println("Nuevo Atras: " + colaPrioridad.back());

            // Eliminando mas elementos
            System.out.println("Elemento eliminado: " + colaPrioridad.dequeue());
            System.out.println("Elemento eliminado: " + colaPrioridad.dequeue());

            System.out.println("verificacion si estaa vacia" + colaPrioridad.isEmpty());

        } catch (ExceptionEmpty e) {
            System.out.println("Error detectado: " + e.getMessage());
        }
    }
}

