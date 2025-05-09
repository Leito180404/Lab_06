package Actividad3;

class PriorityQueueLinkSort<E, N extends Comparable<N>> implements PriorityQueue<E, N> {
    class EntryNode {
        E data;
        N priority;

        EntryNode(E data, N priority) {
            this.data = data;
            this.priority = priority;
        }
    }

    private Node<EntryNode> first;
    private Node<EntryNode> last;

    public PriorityQueueLinkSort() {
        this.first = null;
        this.last = null;
    }

    @Override
    public void enqueue(E x, N pr) {
        EntryNode newNode = new EntryNode(x, pr);
        Node<EntryNode> newNodeWrapper = new Node<>(newNode);

        if (isEmpty() || first.getDato().priority.compareTo(pr) < 0) {
            // Si la cola está vacia o el nuevo nodo tiene mayor prioridad, agregarlo al frente
            newNodeWrapper.setNext(first);
            first = newNodeWrapper;
            if (last == null) {
                last = newNodeWrapper; // Si la cola estaba vacia, last tambien apunta a este nodo
            }
        } else {
            // Recorrer la cola para encontrar la posicion donde insertar el nuevo nodo
            Node<EntryNode> current = first;
            while (current.getNext() != null && current.getNext().getDato().priority.compareTo(pr) >= 0) {
                current = current.getNext();
            }
            newNodeWrapper.setNext(current.getNext());
            current.setNext(newNodeWrapper);
            if (current == last) {
                last = newNodeWrapper; // Si lo insertamos al final, actualizamos last
            }
        }
    }

    @Override
    public E dequeue() throws ExceptionEmpty {
        if (isEmpty()) {
            throw new ExceptionEmpty("no se puede remover porque esta vacia");
        }
        E aux = this.first.getDato().data;
        this.first = this.first.getNext();
        if (this.first == null) {
            this.last = null;
        }
        return aux;
    }

    @Override
    public E front() throws ExceptionEmpty {
        if (isEmpty()) {
            throw new ExceptionEmpty("cola vacia");
        }
        return this.first.getDato().data;
    }

    @Override
    public E back() throws ExceptionEmpty {
        if (isEmpty()) {
            throw new ExceptionEmpty("esta vacia");
        }
        return this.last.getDato().data;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<EntryNode> current = first;
        while (current != null) {
            sb.append(current.getDato().data.toString()).append(" (Prioridad: ").append(current.getDato().priority).append(") -> ");
            current = current.getNext();
        }
        return sb.length() == 0 ? "cola vacia" : sb.toString();
    }
}
