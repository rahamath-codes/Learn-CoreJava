package Variable_Scope;
//Definition: A static variable is shared among all instances of a class. It's declared with the static keyword.
//Access: It can be accessed without creating an object of the class.

public class StaticVariables {
	// Static variable
    static int carCount = 0;

    public StaticVariables() {
        carCount++; // Increment car count when an object is created
    }

    public static void displayCarCount() {
        System.out.println("Total Cars: " + carCount); // Access static variable
    }

    public static void main(String[] args) {
    	StaticVariables car1 = new StaticVariables();
    	StaticVariables car2 = new StaticVariables();
    	StaticVariables.displayCarCount(); // Output: Total Cars: 2
    }
}
