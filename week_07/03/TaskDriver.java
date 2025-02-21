public class TaskDriver {
    public static void main(String[] args) {
        Task task1 = new Task("Complete Java project", 5, 7);
        Task task2 = new Task("Go to the gym", 8, 4);
        Task task3 = new Task("Read a book", 12, 3);
        Task task4 = new Task("Buy groceries", -1, 9);

        System.out.println(task1);
        System.out.println(task2);
        System.out.println(task3);
        System.out.println(task4);

        // Updating complexity dynamically
        task1.setComplexity(2);
        System.out.println("Updated: " + task1);
    }
}
