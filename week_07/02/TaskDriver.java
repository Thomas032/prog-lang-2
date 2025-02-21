public class TaskDriver {
    public static void main(String[] args) {
        Task task1 = new Task("Complete Java project", 5);
        Task task2 = new Task("Go to the gym", 8);
        Task task3 = new Task("Read a book", 3);
        Task task4 = new Task("Buy groceries", 10);

        System.out.println(task1);
        System.out.println(task2);
        System.out.println(task3);
        System.out.println(task4);

        task1.setPriority(3);
        System.out.println("Updated: " + task1);
    }
}
