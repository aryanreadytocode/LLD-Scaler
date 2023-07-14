package exceptions;

public class InvalidGameConstructionParameterException extends Exception {
    public InvalidGameConstructionParameterException() {
    }

    public InvalidGameConstructionParameterException(String message) {
        super(message);
    }

    public InvalidGameConstructionParameterException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidGameConstructionParameterException(Throwable cause) {
        super(cause);
    }

    public InvalidGameConstructionParameterException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
