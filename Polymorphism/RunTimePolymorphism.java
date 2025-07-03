package Polymorphism;
/*
Runtime Polymorphism allows a child class to override a method of its parent class.
The method that gets called is decided at runtime, based on the object.
*/


//Parent class
class Vehicle {
 void run() {
     System.out.println("Vehicle is running...");
 }
}

//Child class overrides run() method
class Bike extends Vehicle {
 void run() {
     System.out.println("Bike is running at 60 km/h.");
 }
}

//Another child class
class Car extends Vehicle {
 void run() {
     System.out.println("Car is running at 100 km/h.");
 }
}

//Main class
public class RunTimePolymorphism {
	public static void main(String[] args) {

        // Parent class reference, child class object
        Vehicle v;

        // Object of Bike
        v = new Bike();   // Upcasting
        v.run();          // Calls Bike's run()

        // Object of Car
        v = new Car();    // Upcasting
        v.run();          // Calls Car's run()
    }
}
