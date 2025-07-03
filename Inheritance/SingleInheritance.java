package Inheritance;

/*
-Single Inheritance is when a class (child) inherits from one superclass (parent).
-The child class gets access to the parent class’s methods and properties.
*/

public class SingleInheritance {
	public static void main(String[] args) {
        Car myCar = new Car();        // Create a Car object

        myCar.startEngine();          // Inherited method from Vehicle
        myCar.drive();                // Method from Car
    }	
}	
//Parent class
class Vehicle {
 void startEngine() {
     System.out.println("Engine started");
 }
}

//Child class inheriting from Vehicle
class Car extends Vehicle {
 void drive() {
     System.out.println("Car is driving");
 }
}
// The child object can use both the inherited and its own methods.
