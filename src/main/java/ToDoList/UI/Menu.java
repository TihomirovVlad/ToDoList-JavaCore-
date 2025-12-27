package ToDoList.UI;

import ToDoList.Repository.TaskRepository;

import java.util.Scanner;

public class Menu {
    TaskRepository taskRepository = new TaskRepository();
    public void showMenu(){
        while(true){
            System.out.println("1. Add task");
            System.out.println("2. Remove task by id");
            System.out.println("3. Show all tasks");
            System.out.println("4. Show task by id");
            System.out.println("5. Exit");
            choiceMenuItem();
        }
    }

    public void choiceMenuItem(){
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch(choice){
            case 1:
        }

    }
}
