package Day02.mise;

public class App {

	public static void main(String[] args) {

		Academy academy = new Academy();

		academy.setName("Freshworks Academy");
		academy.setId(001);
		academy.setCode("FSSA");

		Student student_01 = new Student();

		student_01.setEmail("mathi001@gmail.com");
		student_01.setName("Mathi");
		student_01.setId(001);
		System.out.println(Student.count);

		Student student_02 = new Student();

		student_02.setEmail("sesslyn002@gmail.com");
		student_02.setName("Sesslyn");
		student_02.setId(002);
		System.out.println(Student.count);
	}

}
