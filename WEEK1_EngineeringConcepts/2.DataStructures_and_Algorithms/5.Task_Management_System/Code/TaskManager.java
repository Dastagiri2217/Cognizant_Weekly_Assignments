public class TaskManager {
    private Node head;

    // Add task at the end
    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Added Task: " + task.getTaskName());
    }

    // Traverse all tasks
    public void displayTasks() {
        if (head == null) {
            System.out.println("No tasks to display.");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }

    // Search by taskId
    public Task searchTask(int id) {
        Node current = head;
        while (current != null) {
            if (current.task.getTaskId() == id) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }

    // Delete by taskId
    public void deleteTask(int id) {
        if (head == null) {
            System.out.println("No task to delete.");
            return;
        }
        if (head.task.getTaskId() == id) {
            head = head.next;
            System.out.println("Deleted task ID: " + id);
            return;
        }
        Node current = head;
        while (current.next != null && current.next.task.getTaskId() != id) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
            System.out.println("Deleted task ID: " + id);
        } else {
            System.out.println("Task ID " + id + " not found.");
        }
    }
}