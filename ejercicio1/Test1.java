package ejercicio1;

import Actividad1.Stack;
import Actividad1.ExceptionEmpty;
public class Test1 {
    public static void main(String[] args) {
        Stack<Integer> stackInt = new StackLink<>();
        Stack<String> stackString = new StackLink<>();

        System.out.println("¿Esta vacia la pila de enteros? " + stackInt.isEmpty());
        System.out.println("¿Esta vacia la pila de strings " + stackString.isEmpty());
    
        try {
            //pila de enteros
            stackInt.push(10);
            stackInt.push(20);
            stackInt.push(30);
            System.out.println("Pila de enteros despues de agregar: " + stackInt.toString());
            System.out.println("Top: " + stackInt.top());  // Ver el tope
            System.out.println("Pop: " + stackInt.pop());  // Eliminar el tope
            System.out.println("despues de eliminar : " + stackInt.toString());
            System.out.println("Top despues del pop: " + stackInt.top());

            //pila de cadenas
            stackString.push("Algoritmos");
            stackString.push("estructuras");
            System.out.println("Pila de cadenas despues de agregar: " + stackString.toString());
            System.out.println("Top: " + stackString.top());  // Ver el tope
            System.out.println("Pop: " + stackString.pop());  // Eliminar el tope
            System.out.println("despues de eliminar : " + stackString.toString());
            System.out.println("Top despues del pop: " + stackString.top());

        } catch (ExceptionEmpty e) {
            System.out.println("Error detectado: " + e.getMessage());
        }
    }
}

