package Day02.solved;

public class Person1 {

	private String name2; // Private data member

	public String getName() { // Public getter method
		return name2;
	}

	public void setName(String name) { // Public setter method
		// name = name; Wrong way to use refer the attribute of class
		this.name2 = name; // this Keyword used for referring current instance
	}

}
