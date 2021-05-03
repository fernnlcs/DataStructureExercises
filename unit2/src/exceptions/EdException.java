package exceptions;

public class EdException extends RuntimeException {
    
    private String message;

    /**
     * @param message
     * @param message2
     */
    public EdException(String message) {
        super(message);
        this.message = message;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    } 

}
