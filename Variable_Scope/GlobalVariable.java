package Variable_Scope;
//Definition: An instance variable is declared inside a class but outside any methods. It belongs to an object of the class.
//Access: It is accessible from any method within the class as long as you have an object of that class.
public class GlobalVariable {
	 // Instance variable
    String model;
    
    public void setModel(String m) {
        model = m; // Set the instance variable
    }
    
    public void displayModel() {
        System.out.println(model); // Access the instance variable
    }

    public static void main(String[] args) {
        GlobalVariable myCar = new GlobalVariable();
        myCar.setModel("Toyota");
        myCar.displayModel(); // Output: Toyota
    }
}
