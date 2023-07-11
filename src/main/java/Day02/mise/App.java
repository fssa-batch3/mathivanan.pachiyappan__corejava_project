package Day02.mise;

import Day02.solved.ShapeCalculator;

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
		
		ShapeCalculator calculator = new ShapeCalculator();
		double circleArea = calculator.calculateArea(3.5); // Output: 38.48451000647496
		double rectangleArea = calculator.calculateArea(4.2, 6.8); // Output: 28.559999999999995
		

		student_02.setEmail("sesslyn002@gmail.com");
		student_02.setName("Sesslyn");
		student_02.setId(002);
		System.out.println(Student.count);
	}

}
