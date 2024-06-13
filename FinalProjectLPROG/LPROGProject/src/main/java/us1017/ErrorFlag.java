package us1017;

/**
 * A class used to track whether any errors have occurred.
 */
public class ErrorFlag {
    /**
     * Indicates whether errors have been detected.
     */
    public boolean hasErrors;

    /**
     * Constructs an ErrorFlag with the specified initial error state.
     *
     * @param initialFlag the initial error state.
     */
    public ErrorFlag(boolean initialFlag) {
        this.hasErrors = initialFlag;
    }
}