public class ExceptionNew extends Exception {
    public ExceptionNew() {
        super("My Exception: Invalid input");
    }
    public ExceptionNew(String message) {
        super("Special Factorial Exception: " + message);
    }
}