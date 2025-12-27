package ToDoList.Repository;

import ToDoList.Model.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskRepository {

    List<Task> tasks = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addTask(Task task) {
        System.out.println("input title");
        String title = scanner.nextLine();
        task.setTitle(title);
        System.out.println("input description");
        String description = scanner.nextLine();
        task.setDescription(description);

        if (task!=null){
            tasks.add(task);
        }
    }

    public void removeTask(int id) {
        tasks.remove(id);
    }

    public void findAll(){
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public void findById(int id){
        for (Task task : tasks) {
            if (task.getId() == id) {
                System.out.println("Task found");
                System.out.println(task);
            }
        }
    }
}
