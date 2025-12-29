package ToDoList.UI;

import ToDoList.Model.Priority;
import ToDoList.Model.Task;
import ToDoList.Service.Service;

import java.util.List;
import java.util.Scanner;

public class Menu {
    Service service = new Service();

    public void showMenu() {
        while (true) {
            System.out.println("1. Add task");
            System.out.println("2. Remove task by id");
            System.out.println("3. Show all tasks");
            System.out.println("4. Show task by id");
            System.out.println("5. Show all tasks by priority");
            System.out.println("6. Exit");
            choiceMenuItem();
        }
    }

    public void choiceMenuItem() {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                addTask();
                break;
            case 2:
                removeTask();
                break;
            case 3: {
                List<Task> tasks = getTasks();
                if (tasks.isEmpty()) {
                    System.out.println("There are no tasks in this list");
                }
                else{
                    for (Task task : tasks) {
                        System.out.println(task);
                    }
                }
                break;

            }
            case 4: {
                Task taskById = findTaskById();
                System.out.println(taskById);
                break;
            }
            case 5: {
                printTasks();
                break;
            }
            case 6:
                System.out.println("GoodBye");
                break;


        }
    }


    public void addTask() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter task title: ");
        String title = sc.nextLine();
        System.out.println("Enter task description: ");
        String description = sc.nextLine();
        System.out.println("Enter task priority(Low, Medium, High): ");
        Priority priority = Priority.valueOf(sc.nextLine().toUpperCase());
        service.addTask(title, description, priority);
    }

    public void removeTask() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter task id for remove: ");
        int taskId = sc.nextInt();
        service.removeTask(taskId);
    }

    public List<Task> getTasks() {
        return service.getTasks();
    }

    public Task findTaskById() {
        Scanner sc = new Scanner(System.in);
        int taskId = sc.nextInt();
        Task task = service.findTaskById(taskId);
        return task;
    }

    public void printTasks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter task priority(Low, Medium, High): ");
        Priority priority = Priority.valueOf(sc.nextLine().toUpperCase());
        List<Task> tasksByPriority = service.getTasksByPriority(priority);
        for (Task task : tasksByPriority) {
            System.out.println(task);
        }
    }
}
