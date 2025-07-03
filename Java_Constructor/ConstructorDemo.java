package Java_Constructor;
/*
A constructor is a special method in Java that is called automatically when an object is created.
Its main job is to initialize the object (i.e., assign values to variables or run setup code).
*/

class Car {
    String brand;
    int year;

    // Default constructor
    Car() {
        brand = "Unknown";
        year = 0;
    }

    // Parameterized constructor
    Car(String b, int y) {
        brand = b;
        year = y;
    }

    void display() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

public class ConstructorDemo {
	 public static void main(String[] args) {
	        Car c1 = new Car();             // calls default constructor
	        Car c2 = new Car("Toyota", 2023); // calls parameterized constructor

	        c1.display();
	        c2.display();
	    }
}
/*
| Rule                      | Explanation                                                      |
| ------------------------- | ---------------------------------------------------------------- |
| Same name as the class    | Constructors **must have the same name**                         |
| No return type            | Constructors **do not return** anything (not even `void`)        |
| Called with `new` keyword | Automatically invoked during object creation                     |
| Can be overloaded         | You can have **multiple constructors** with different parameters |
*/