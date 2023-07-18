package Day06.practice;

import java.util.ArrayList;

public class TaskMain {

	public static void main(String[] args) {
		ArrayList<Task> taskList = new ArrayList<>();

		// Creating Task objects and adding them to the ArrayList
		Task task1 = new Task("Task 1", 3);
		taskList.add(task1);

		Task task2 = new Task("Task 2", 1);
		taskList.add(task2);

		Task task3 = new Task("Task 3", 2);
		taskList.add(task3);

		// Accessing the task details from the ArrayList
		for (Task task : taskList) {
			System.out.println("Task Name: " + task.taskName);
			System.out.println("Priority: " + task.priority);
			System.out.println();
		}
	}

}
