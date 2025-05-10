package Actividad2;

public class QueueLink<E> implements Queue<E> {
    private Node<E> first;
    private Node<E> last;
    
    public QueueLink(){
        this.first = null;
        this.last = null;
    }
    
    public void enqueue(E x){
        Node<E> aux = new Node<E>(x);
        if (this.isEmpty()) {
            this.first = aux;
            this.last = aux;}
        else{
            this.last.setNext(aux);
            this.last = aux;}
        }
        public E dequeue() throws ExceptionEmpty {
            if (isEmpty()) {
                throw new ExceptionEmpty("esta vacio bro");
            }
            E data = first.getDato();
            first = first.getNext();
            if (first == null) {
                last = null;
            }
            return data;
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
