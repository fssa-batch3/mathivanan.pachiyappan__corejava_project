package Day05.practice;

public class School {
	public static void main(String[] args) {
		Department department = new Department("Computer Science", 123);
		Student student = new Student("John Doe", 456, department);

		System.out.println(student.toString());
	}
}
