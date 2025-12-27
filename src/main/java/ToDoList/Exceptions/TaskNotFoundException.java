package ToDoList.Exceptions;

public class TaskNotFoundException extends RuntimeException {

    private String msg;

    public TaskNotFoundException(String msg) {
        this.msg = msg;
    }
}
