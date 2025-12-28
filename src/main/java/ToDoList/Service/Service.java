package ToDoList.Service;


import ToDoList.Model.Priority;
import ToDoList.Model.Task;
import ToDoList.Repository.TaskRepository;

import java.util.List;

public class Service implements TaskService{
    TaskRepository taskRepository = new TaskRepository();

    @Override
    public void filterTasks() {

    }

    @Override
    public void addTask(String title, String description, Priority priority) {
        taskRepository.addTask(title, description, priority);
    }

    @Override
    public void removeTask(int id) {
        List<Task> tasks = taskRepository.getTasks();
        for (Task task : tasks) {
            if (task.getId() == id) {
                taskRepository.removeTask(task);
            }
        }

    }

    @Override
    public List<Task> getTasks() {
        return List.of();
    }

    @Override
    public Task findTaskById(int id) {
        List<Task> tasks = taskRepository.getTasks();
        for (Task task : tasks) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null;
    }
}
