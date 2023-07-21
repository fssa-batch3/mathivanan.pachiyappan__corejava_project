package Day10.practice;

class InvalidEmailException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidEmailException(String message) {
		super(message);
	}
}

class EmailValidator {
	public static boolean isValidEmail(String emailId) throws InvalidEmailException {
		// Regular expression to validate email format
		String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

		if (emailId.matches(emailRegex)) {
			return true;
		} else {
			throw new InvalidEmailException("Invalid email format");
		}
	}
}
