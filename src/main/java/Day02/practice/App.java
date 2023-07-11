package Day02.practice;

public class App {
	
	public static void main(String[] args) {
		
		User user = new User();

		user.setName("Mathi");
		user.setEmail("math001@gmail.com");
		user.setPassword("Njcat#10van");
		user.setId(101);
		
		System.out.println(user.getName());
		System.out.println(user.getEmail());
		System.out.println(user.getId());
	}
 	
}
