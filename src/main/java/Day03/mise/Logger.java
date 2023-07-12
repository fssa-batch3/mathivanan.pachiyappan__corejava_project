package Day03.mise;

import java.time.LocalDateTime;

public class Logger {

	public static void info(String message) {

		System.out.println(message);

	}

	public static void debug(String message) {
		
		LocalDateTime time = LocalDateTime.now();

		System.out.println(time.toString().concat(message));

	}
	
	
	public static void main(String[] args) {
		
		Logger log = new Logger();
		
		log.info("message");
		log.debug("messgae");
		
	}
}
