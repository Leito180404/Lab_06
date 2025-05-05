public class Test {
   public static void main(String[] args) {
        StackArray<Integer> stackInt = new StackArray<>(4);
        System.out.println("Esta vacia? " + stackInt.isEmpty());
    try{
        stackInt.push(10);
        stackInt.push(20);
        stackInt.push(12);
        stackInt.push(14);
        System.out.println("Top: " + stackInt.top());
        System.out.println("Esta llena? " + stackInt.isFull());
        System.out.println("Contenido de la pila: " + stackInt.toString());
        System.out.println("Elemento eliminado (pop): " + stackInt.pop());
        System.out.println("Contenido de la pila despues de pop: " + stackInt.toString());

        System.out.println("Esta llena? " + stackInt.isFull());
        
        // Hacemos otro pop
        System.out.println("Elemento eliminado (pop): " + stackInt.pop()); 
        System.out.println("Contenido de la pila despues de otro pop: " + stackInt.toString());

        // Hacemos un tercer pop
        System.out.println("Elemento eliminado (pop): " + stackInt.pop());
        
        System.out.println("Esta vacia? " + stackInt.isEmpty());

    } catch (ExceptionEmpty e){
        System.out.println("error detectado: " + e.getMessage());
    } 
    }   
}
