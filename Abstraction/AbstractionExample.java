package Abstraction;

/*
Abstraction is the concept of hiding the complex implementation details and showing only the essential features of an object.
In Java, abstraction is achieved using:
  -Abstract classes (can have both abstract and concrete methods)
  -Interfaces (only abstract methods until Java 8; default and static methods introduced later)
*/


//Abstract class with an abstract method and a concrete method
abstract class Shape {
 // Abstract method (no body)
 abstract void draw();

 // Concrete method
 void display() {
     System.out.println("This is a shape.");
 }
}

//Subclass providing implementation of abstract method
class Circle extends Shape {
 void draw() {
     System.out.println("Drawing a Circle.");
 }
}

public class AbstractionExample {
 public static void main(String[] args) {
     Circle c = new Circle();
     c.display();  // Calls concrete method from abstract class
     c.draw();     // Calls implemented abstract method
 }
}
/*
-Abstract class can have both abstract and concrete methods.
-Interface contains abstract methods (and default/static from Java 8).
-Both hide implementation details and expose only method signatures.
*/
