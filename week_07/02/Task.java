public class Task implements Priority {
    private int priority;
    private String name;

    public Task(String name, int priority) {
        this.priority = priority;
        this.name = name;
    }

    @Override
    public void setPriority(int priority) {
        if (priority < 1) {
            this.priority = 1;
        } else if (priority > 10) {
            this.priority = 10;
        } else {
            this.priority = priority;
        }
    }

    @Override
    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Task: " + name + " | Priority: " + priority;
    }

}
