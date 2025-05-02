import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner0 = new Scanner(System.in);

        Task myTasks = new Task();

        boolean stop = false;
        while (!stop){


            System.out.print("Type 1 to add new task, 2 to show tasks, 3 to show concluded tasks \n4 to show pendent tasks, 5 to remove a task \n6 to mark task as concluded and 0 to stop the program: ");
            int userInput = scanner0.nextInt();

            switch (userInput) {
                case 1 -> myTasks.addTasks();
                case 2 -> myTasks.showTasks();
                case 3 -> myTasks.showConcludedTasks();
                case 4 -> myTasks.showPendentTasks();
                case 5 -> myTasks.removeTask();
                case 6 -> myTasks.concludedTask();
                default -> stop = true;
            }
        }

    }
}

class Task {

    private String title;
    private String description;
    private boolean concluded;

    ArrayList<Task> tasks = new ArrayList<>();

    public Task(){}

    public Task(String title, String description, boolean concluded){
        this.title = title;
        this.description = description;
        this.concluded = false;
    }

    public void addTasks(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Title of the new task: ");
        String title = scanner.nextLine();

        System.out.print("Description of the new task: ");
        String description = scanner.nextLine();

        Task task = new Task(title, description, false);
        tasks.add(task);

    }

    public void showTasks(){
        int count = 1;
        for (Task element: tasks){
            System.out.println(count + "º task: " + element.title);
            System.out.println("Description: " + element.description);
            count ++;
        }
    }

    public void concludedTask(){

        Scanner scanner5 = new Scanner(System.in);

        System.out.print("Type the concluded task: ");
        String title = scanner5.nextLine();

        boolean taskFound = false;
        for (Task task : tasks) {
            if (task.title.equals(title)) {
                task.concluded = true;
                taskFound = true;
            }

        }
        if (!taskFound){
            System.out.println("Task not found in the system.");
        }
    }

    public void removeTask(){

        Scanner scanner1 = new Scanner(System.in);

        System.out.print("Task to be removed: ");
        String title = scanner1.nextLine();

        boolean taskFound = false;
        for (int i = 0; i < tasks.size(); i++){
            if (tasks.get(i).title.equals(title)){
                tasks.remove(i);
                taskFound = true;
            }

        }
        if (!taskFound){
            System.out.println("Task not found in the system.");
        }
    }

    public void showConcludedTasks(){

        boolean concluded = false;
        for (Task task : tasks) {
            if (task.concluded) {
                System.out.println("Task " + task.title + " was concluded");
                concluded = true;
            }
        }

        if (!concluded){
            System.out.println("No concluded tasks!");
        }
    }

    public void showPendentTasks(){

        boolean pendent = false;
        for (Task task : tasks) {
            if (!task.concluded) {
                System.out.println("Task " + task.title + " is pendent");
                pendent = true;
            }
        }

        if (!pendent){
            System.out.println("No pendent tasks!");
        }
    }
}
