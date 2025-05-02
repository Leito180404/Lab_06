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
        if (tope == -1) {
            throw new ExceptionEmpty("No se puede acceder al tope ya que la pila esta vacia.");
        }
            return array[tope];
        }
    
    public boolean isEmpty() {
        return this.tope == -1;
    }
        
    public boolean isFull() {
        return tope == array.length - 1;
        }
        
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = tope; i >= 0; i--) {
            sb.append(array[i]).append(" ");
        }
        return sb.toString().trim();
    }
}  
