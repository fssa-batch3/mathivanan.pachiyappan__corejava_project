package Day06.practice;

import java.util.ArrayList;

public class FindTaskMain {

	public static void main(String[] args) {
		ArrayList<FindTask> tasks = new ArrayList<>();
		tasks.add(new FindTask("Task 1"));
		tasks.add(new FindTask("Task 2"));
		tasks.add(new FindTask("Task 3"));

		String nameToFind = "Task 2";
		boolean found = findTaskByName(nameToFind, tasks);
		System.out.println("Task found: " + found);
	}

	static boolean findTaskByName(String name, ArrayList<FindTask> tasks) {
		for (FindTask task : tasks) {
			if (task.getName().equals(name)) {
				return true; // Task found
			}
		}
		return false; // Task not found
	}
}
