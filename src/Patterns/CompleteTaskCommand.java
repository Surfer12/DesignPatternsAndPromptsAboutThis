package Patterns;

public class CompleteTaskCommand implements Command {
    private Task task;

    public CompleteTaskCommand(Task task) {
        this.task = task;
    }

    @Override
    public void execute() {
        task.complete();
    }

    @Override
    public void undo() {
        task.reopen();
    }
}