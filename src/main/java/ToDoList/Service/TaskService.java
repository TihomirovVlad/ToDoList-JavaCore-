package ToDoList.Service;

import ToDoList.Model.Priority;
import ToDoList.Model.Task;

import java.util.List;

public interface TaskService {

    public void filterTasks();
    public void addTask(String title, String description, Priority priority);
    public void removeTask(int id);
    public List<Task> getTasks();
    public Task findTaskById(int id);
    public List<Task> getTasksByPriority(Priority priority);
}
