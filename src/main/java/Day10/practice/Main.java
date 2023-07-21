package Day10.practice;

public class Main {
	public static void main(String[] args) {
		String email = "test@example.com";

		try {
			if (EmailValidator.isValidEmail(email)) {
				System.out.println("Valid email: " + email);
			}
		} catch (InvalidEmailException e) {
			System.out.println("Invalid email: " + e.getMessage());
		}
	}
}