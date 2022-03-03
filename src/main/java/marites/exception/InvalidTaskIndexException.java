package marites.exception;

public class InvalidTaskIndexException extends MaritesException {

    private final String taskIndex;
    private static final String ERROR_MESSAGE =
            "Invalid task index: %s\n";

    public InvalidTaskIndexException(String taskIndex) {
        super();
        this.taskIndex = taskIndex;
    }

    public String getErrorMessage() {
        return String.format(ERROR_MESSAGE, taskIndex);
    }
}
