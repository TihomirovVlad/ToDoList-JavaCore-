package ToDoList.Model;

import java.util.Random;

public class Task {

    private static int id = new Random().nextInt(100);
    private String title;
    private String description;
    Priority priority;
    boolean isDone;

    public Task(String title, String description, Priority priority, boolean isDone) {
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.isDone = isDone;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Priority getPriority() {
        return priority;
    }
    public void setPriority(Priority priority) {
        this.priority = priority;
    }
    public boolean isDone() {
        return isDone;
    }
    public void setDone(boolean done) {
        isDone = done;
    }
    @Override
    public String toString() {
        return "Task [id=" + id + ", title=" + title + ", description=" + description + ", priority=" + priority;
    }

}
