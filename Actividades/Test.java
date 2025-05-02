public class Test {
   public static void main(String[] args) {
        StackArray<Integer> stackInt = new StackArray<>(4);
        System.out.println("Esta vacia? " + stackInt.isEmpty());
    try{
        stackInt.push(10);
        stackInt.push(20);
        stackInt.push(12);
        System.out.println("Top: " + stackInt.top());
    } catch (ExceptionEmpty e){
        System.out.println("error detectado: " + e.getMessage());
    } 
    }
}
