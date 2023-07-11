package Day02.solved;

public class Main {
	public static void main(String[] args) {
		ShapeCalculator calculator = new ShapeCalculator();
		double circleArea = calculator.calculateArea(3.5); // Output: 38.48451000647496
		double rectangleArea = calculator.calculateArea(4.2, 6.8); // Output: 28.559999999999995
		
		Calculator calc = new Calculator();
		System.out.println(calc.add(2, 3));           // Output: 5
		System.out.println(calc.add(2.5, 3.7));       // Output: 6.2
		System.out.println(calc.add("Hello", "World"));  // Output: HelloWorld
	}
}
