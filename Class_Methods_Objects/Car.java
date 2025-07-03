package Class_Methods_Objects;
//A class is like a blueprint for creating objects. It defines the properties (fields) and 
//behaviors (methods) that the objects created from the class will have.
//Think of a class like a template or a recipe, and the objects are actual items created from that recipe.

//A method is a function that defines behavior for the class. Methods are used to perform operations 
//using the class's fields or to do something specific (like printing something or updating values).

public class Car {  //blueprint for creating objects.
	 // Fields (Attributes/Properties of the class)
    String model;
    String color;
    int year;

    // Constructor (Optional but helps in initializing the object)
    public Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    // Method (Behavior of the class)
    public void startEngine() {
        System.out.println("The engine has started.");
    }
}
