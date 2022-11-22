package TodoSystem;

public class Task {
    public String taskName;
    public boolean done;

    public Task(String name, boolean ticked) {
        taskName = name;
        done = ticked;
    }

    public Task(String name) {
        this(name, false);
    }

    @Override
    public boolean equals(Object obj) {
        return this.taskName.equals(((Task) obj).taskName);
    }
}
