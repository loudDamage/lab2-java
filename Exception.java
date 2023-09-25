public class Exception extends java.lang.Exception {
    public Exception() {
        super("My Exception: Invalid input");
    }
    public Exception(String message) {
        super("Special Factorial Exception: " + message);
    }
}