public class App {
    public static void main(String[] args) {
        // Create Task instances
        Task task1 = new Task("Task A", 5, 3);
        Task task2 = new Task("Task B", 8, 4);
        Task task3 = new Task("Task C", 2, 7);

        // Compare tasks using compareTo method
        System.out.println("Comparing task1 and task2: " + task1.compareTo(task2));
        System.out.println("Comparing task2 and task3: " + task2.compareTo(task3));
        System.out.println("Comparing task3 and task1: " + task3.compareTo(task1));
    }
}
