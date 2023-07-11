package Day02.solved;

public class App {
	public static void main(String[] args) {

		// Usage
		Person person = new Person();
		person.setName("John"); // Setting the name using the setter method
		String name = person.getName(); // Accessing the name using the getter method
		System.out.println(name); // Output: John
		
		// Usage
		Person person2 = new Person();
		person2.setName("John");      // Setting the name using the setter method
		String name2 = person2.getName();  // Accessing the name using the getter method
		System.out.println(name2);    // Output: John
		
		ShapeCalculator calculator = new ShapeCalculator();
		double circleArea = calculator.calculateArea(3.5); // Output: 38.48451000647496
		double rectangleArea = calculator.calculateArea(4.2, 6.8); // Output: 28.559999999999995
		System.out.println(circleArea);
		System.out.println(rectangleArea);
		
		Calculator calc = new Calculator();
		System.out.println(calc.add(2, 3));           // Output: 5
		System.out.println(calc.add(2.5, 3.7));       // Output: 6.2
		System.out.println(calc.add("Hello", "World"));  // Output: HelloWorld

	}

}
