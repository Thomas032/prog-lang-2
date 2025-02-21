public class Task implements Priority, Complexity {
    private String name;
    private int priority;
    private int complexity;

    public Task(String name, int priority, int complexity) {
        this.name = name;
        setPriority(priority);
        setComplexity(complexity);
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
    public void setComplexity(int complexity) {
        if (complexity < 1) {
            this.complexity = 1;
        } else if (complexity > 10) {
            this.complexity = 10;
        } else {
            this.complexity = complexity;
        }
    }

    @Override
    public int getComplexity() {
        return complexity;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Task: " + name + " | Priority: " + priority + " | Complexity: " + complexity;
    }
}
