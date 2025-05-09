package Actividad3;

class PriorityQueueLinkSort<E,N> implements PriorityQueue<E,N> {
    class EntryNode{
        E data;
        N priority;
        EntryNode(E data, N priority){
            this.data = data;
            this.priority = priority;
        }
    }
    private Node<EntryNode> first;
    private Node<EntryNode> last;
    public PriorityQueueLinkSort (){
        this.first = null;
        this.last = null;
    }
    public void enqueue(E x, N pr){
    // The list must be ordered by the priority of the elements.
    // The higher the priority, the element is further to the front.
    }
    public E dequeue() throws ExceptionEmpty {
        if (isEmpty())
        throw new ExceptionEmpty("Cannot remove from an empty queue");
        E aux = this.first.getData().data;
        this.first = this.first.getNext();
        if (this.first == null){
            this.last = null;}
        return aux;
    }
    public E back() throws ExceptionEmpty {
        if (isEmpty()) {
            throw new ExceptionEmpty("vacio bro");
        }
        return last.getDato();
    }

    public E front() throws ExceptionEmpty {
        if (isEmpty()) {
            throw new ExceptionEmpty("esta vacio bro");
        }
        return first.getDato();
    }

        public boolean isEmpty() {
            return first == null;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node<E> current = first;
            while (current != null) {
                sb.append(current.getDato()).append(" ");
                current = current.getNext();
            }
            return sb.toString().trim();
        }
} 
