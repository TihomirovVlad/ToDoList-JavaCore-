package ToDoList.Repository;

import ToDoList.Model.Priority;
import ToDoList.Model.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskRepository {

    List<Task> tasks = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addTask(String title, String description, Priority priority) {
        tasks.add(new Task(title,description,priority));
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    public List<Task> getTasks(){
        return this.tasks;
    }

    public void findById(int id){

    }
}
