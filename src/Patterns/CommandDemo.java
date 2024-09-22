package Patterns;

// Usage
public class CommandDemo {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Task task1 = new Task("Implement feature X");
        Task task2 = new Task("Write documentation");

        taskManager.executeCommand(new CompleteTaskCommand(task1));
        taskManager.executeCommand(new CompleteTaskCommand(task2));
        taskManager.undoLastCommand();
    }
}