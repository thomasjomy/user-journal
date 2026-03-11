package in.jt.journal.db;

public class DataServiceException extends RuntimeException {
    public DataServiceException() {
    }

    public DataServiceException(String message) {
        super(message);
    }

    public DataServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public DataServiceException(Throwable cause) {
        super(cause);
    }
}
