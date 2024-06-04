import java.util.ArrayList;
import java.util.Scanner;

// Define a class for the manager application
public class ManagerApplication {
    private ArrayList<Task> tasks;
    private Scanner scanner;

    // Constructor
    public ManagerApplication() {
        tasks = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    // Method to add a task
    public void addTask(Task task) {
        tasks.add(task);
    }

    // Method to display all tasks
    public void displayTasks() {
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    // Method to start the application
    public void start() {
        int choice;
        do {
            System.out.println("Manager Application Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. Display Tasks");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    Task task = new Task(description);
                    addTask(task);
                    break;
                case 2:
                    System.out.println("Tasks:");
                    displayTasks();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);
    }

    // Main method to run the application
    public static void main(String[] args) {
        ManagerApplication managerApp = new ManagerApplication();
        managerApp.start();
    }
}

// Define a class for tasks
class Task {
    private String description;

    // Constructor
    public Task(String description) {
        this.description = description;
    }

    // Getter for description
    public String getDescription() {
        return description;
    }

    // Override toString method for displaying tasks
    @Override
    public String toString() {
        return "Task: " + description;
    }
}