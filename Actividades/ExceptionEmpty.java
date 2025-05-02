public class ExceptionEmpty extends Exception {

    public ExceptionEmpty() {
        super("La pila no tiene nada.");
    }

    public ExceptionEmpty(String message) {
        super(message);
    }
}
