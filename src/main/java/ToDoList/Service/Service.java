package ToDoList.Service;


import ToDoList.Exceptions.TaskNotFoundException;
import ToDoList.Model.Priority;
import ToDoList.Model.Task;
import ToDoList.Repository.TaskRepository;

import java.util.List;
import java.util.stream.Collectors;

public class Service implements TaskService{
    private final TaskRepository taskRepository = new TaskRepository();


    @Override
    public void addTask(String title, String description, Priority priority) {
        Task newTask = new Task(title, description, priority);
        taskRepository.save(newTask);
        System.out.println("Task added with ID: " + newTask.getId());
    }

    @Override
    public void removeTask(int id) {

        Task taskForRemove = taskRepository.findById(id)
                .orElseThrow(() -> new TaskNotFoundException("Task with id " + id + " not found"));
        taskRepository.delete(taskForRemove);

    }

    @Override
    public List<Task> getTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Task findTaskById(int id) {
       return taskRepository.findById(id)
               .orElseThrow(() -> new TaskNotFoundException("Task with id " + id + " not found"));
    }

    @Override
    public List<Task> getTasksByPriority(Priority priority){
        return taskRepository.findAll().stream()
                .filter(p->p.getPriority() == priority)
                .collect(Collectors.toList());
    }
}
