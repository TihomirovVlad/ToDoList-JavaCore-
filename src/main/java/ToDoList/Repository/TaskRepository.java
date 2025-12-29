package ToDoList.Repository;

import ToDoList.Model.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TaskRepository {

    private final List<Task> tasks = new ArrayList<>();

    public void save(Task task) {
        tasks.add(task);
    }

    public void delete(Task task) {
        tasks.remove(task);
    }

    public List<Task> findAll(){
        return new ArrayList<>(tasks);
    }

    public Optional<Task> findById(int id){
        return tasks.stream()
                .filter(task->task.getId()==id)
                .findFirst();
    }
}
