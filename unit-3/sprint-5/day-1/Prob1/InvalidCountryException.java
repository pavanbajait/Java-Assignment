package Prob1;

public class InvalidCountryException extends Exception{
    public InvalidCountryException() {
    }

    public InvalidCountryException(String message) {
        super(message);
    }

    public InvalidCountryException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidCountryException(Throwable cause) {
        super(cause);
    }

}
