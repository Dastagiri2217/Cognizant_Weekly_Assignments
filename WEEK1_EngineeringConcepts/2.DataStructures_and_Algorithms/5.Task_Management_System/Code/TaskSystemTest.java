
public class TaskSystemTest {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        Task t1 = new Task(1, "Design Module", "Pending");
        Task t2 = new Task(2, "Code Backend", "In Progress");
        Task t3 = new Task(3, "Write Tests", "Pending");

        manager.addTask(t1);
        manager.addTask(t2);
        manager.addTask(t3);

        System.out.println("\nAll Tasks:");
        manager.displayTasks();

        System.out.println("\nSearching Task ID 2:");
        Task found = manager.searchTask(2);
        System.out.println(found != null ? found : "Task not found");

        System.out.println("\nDeleting Task ID 2:");
        manager.deleteTask(2);

        System.out.println("\nTasks after deletion:");
        manager.displayTasks();
    }
}

