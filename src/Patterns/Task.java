import java.util.List;

/**
 * Command Pattern implementation for a simple task management system
 */
public interface CommandPattern {
    void execute();
    void undo();
}

public class Task {
    private String name;
    private boolean completed;

    public Task(String name) {
        this.name = name;
        this.completed = false;
    }

    public void complete() {
        completed = true;
        System.out.println("Task '" + name + "' completed");
    }

    public void reopen() {
        completed = false;
        System.out.println("Task '" + name + "' reopened");
    }
}
