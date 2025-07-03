package Encapsulations;


//Class demonstrating encapsulation
public class Person {
	
	 // Step 1: Private variables (hidden from outside)
	 private String name;
	 private int age;

	 // Step 2: Public getter for 'name'
	 	public String getName() {
	        return name;
	    }

	 // Step 3: Public setter for 'name'
	    public void setName(String newName) {
	        name = newName;
	    }

	 // Step 2: Public getter for 'age'
	    public int getAge() {
	        return age;
	    }

	 // Step 3: Public setter for 'age' with validation
	    public void setAge(int newAge) {
	        if (newAge > 0) {
	            age = newAge;
	        } else {
	            System.err.println("Age must be positive.");
	        }
	    }
	 
}
