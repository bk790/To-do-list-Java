import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> tasks;

    public TodoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added: " + task);
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Your todo list is empty.");
        } else {
            System.out.println("\nYour Todo List:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public void removeTask(int taskNumber) {
        if (taskNumber >= 1 && taskNumber <= tasks.size()) {
            System.out.println("Task removed: " + tasks.get(taskNumber - 1));
            tasks.remove(taskNumber - 1);
        } else {
            System.out.println("Invalid task number.");
        }
    }
}
