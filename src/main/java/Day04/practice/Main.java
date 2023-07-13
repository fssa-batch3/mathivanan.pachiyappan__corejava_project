package Day04.practice;

public class Main {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(5.0, 3.0);
		System.out.println("Rectangle Circumference: " + rectangle.Circumference());

		RightAngledTriangle triangle = new RightAngledTriangle(4.0, 3.0);
		System.out.println("Right-Angled Triangle Circumference: " + triangle.Circumference());

		Square square = new Square(5.0);
		System.out.println("Square Circumference: " + square.Circumference());
	}
}
