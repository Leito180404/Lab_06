package ejercicio1;

public class ExceptionEmpty extends Exception {

    public ExceptionEmpty() {
        super("la lista no tiene nada");
    }

    public ExceptionEmpty(String message) {
        super(message);
    }
}
