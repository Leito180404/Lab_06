class StackArray<E> implements Stack<E> {
    private E[] array;
    private int tope;
    public StackArray(int n){
        this.array = (E[])new Object[n];
        tope = -1;
    }
    @Override
    public void push(E x) {
        if (tope == array.length - 1) {
            throw new IllegalStateException("La pila esta llena.");
        }
        array[++tope] = x;
    }

    @Override
    public E pop() throws ExceptionEmpty {
        if (tope == -1) {
            throw new ExceptionEmpty("No se puede hacer pop, ya que la pila esta vavcia.");
        }
        E element = array[tope];
        array[tope--] = null;
        return element;
    }

        public E top() throws ExceptionEmpty {
        // include here your code
        }
        public boolean isEmpty() {
        return this.tope == -1;
        }
        public boolean isFull (){
        // include here your code
        }
        //The elements must be included in the chain from the one at the top
        //to the one at the bottom of the stack.
        public String toString(){
        // include here your code
    }
}  
