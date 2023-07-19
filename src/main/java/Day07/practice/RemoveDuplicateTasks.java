package Day07.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

class Task {
    private int id;
    private String name;
    private LocalDate deadline;

    public Task(int id, String name, LocalDate deadline) {
        this.id = id;
        this.name = name;
        this.deadline = deadline;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Task task = (Task) obj;
        return id == task.id &&
                name.equals(task.name) &&
                deadline.equals(task.deadline);
    }

    @Override
    public int hashCode() {
        return 31 * (name.hashCode() + deadline.hashCode());
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", deadline=" + deadline +
                '}';
    }
}

public class RemoveDuplicateTasks {
    public static void main(String[] args) {
        // Create an ArrayList of Task with duplicate entries
        ArrayList<Task> tasksList = new ArrayList<>();
        tasksList.add(new Task(1, "Task 1", LocalDate.parse("2023-07-19")));
        tasksList.add(new Task(2, "Task 2", LocalDate.parse("2023-07-20")));
        tasksList.add(new Task(3, "Task 1", LocalDate.parse("2023-07-19")));
        tasksList.add(new Task(4, "Task 3", LocalDate.parse("2023-07-22")));
        tasksList.add(new Task(5, "Task 1", LocalDate.parse("2023-07-19")));

        System.out.println("Original List: " + tasksList);

        // Use a HashSet to remove duplicate Tasks
        HashSet<Task> uniqueTasks = new HashSet<>(tasksList);

        // Display the unique Tasks
        System.out.println("Unique Tasks: " + uniqueTasks);
    }
}
