package exc;

/**
 * Created by Weeks on 5/27/16.
 */

public class DaoException extends Exception {

    private final Exception originalException;

    public DaoException(Exception originalException, String msg) {
        super(msg);
        this.originalException = originalException;
    }
}
