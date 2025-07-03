package Class_Methods_Objects;
//An object is an instance of a class. It is created using the new keyword and represents an actual entity in memory.
//You can think of an object as a real-world thing that is made based on the blueprint (class).

public class Main {
	 public static void main(String[] args) {
	        // Creating an object of the Car class
	        Car myCar = new Car("Toyota", "Red", 2020);

	        // Accessing object's methods and fields
	        myCar.startEngine();  // Calling the method of myCar object
	        System.out.println("Car Model: " + myCar.model);
	        System.out.println("Car Color: " + myCar.color);
	        System.out.println("Car Year: " + myCar.year);
	    }
}
