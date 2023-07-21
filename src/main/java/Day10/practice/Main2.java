package Day10.practice;

import java.util.ArrayList;

class UserAlreadyExistsException extends Exception {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public UserAlreadyExistsException(String message) {
     super(message);
 }
}

class User {
 int id;
 String name;
 String emailId;

 public User(int id, String name, String emailId) {
     this.id = id;
     this.name = name;
     this.emailId = emailId;
 }
}

class UserDatabase {
 private ArrayList<User> users = new ArrayList<>();

 public void register(User user) throws UserAlreadyExistsException {
     for (User existingUser : users) {
         if (existingUser.emailId.equals(user.emailId)) {
             throw new UserAlreadyExistsException("User with emailId " + user.emailId + " already exists.");
         }
     }
     users.add(user);
     System.out.println("User registered successfully: " + user.name);
 }
}

public class Main2 {
 public static void main(String[] args) {
     UserDatabase userDb = new UserDatabase();

     try {
         User user1 = new User(1, "John Doe", "john@example.com");
         userDb.register(user1);

         User user2 = new User(2, "Jane Smith", "jane@example.com");
         userDb.register(user2);

         // Trying to register a user with the same email as user1
         User user3 = new User(3, "Bob Johnson", "john@example.com");
         userDb.register(user3);
     } catch (UserAlreadyExistsException e) {
         System.out.println("Error: " + e.getMessage());
     }
 }
}

