package tp1;

public class DeviseException extends Exception {

    public DeviseException() {
        super();
    }

    public DeviseException(String message) {
        super(message);
    }

    public DeviseException(String message, Throwable cause) {
        super(message, cause);
    }


    public DeviseException(Throwable throwable) {
        super(throwable);
    }
}
