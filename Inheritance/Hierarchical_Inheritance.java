package Inheritance;

//Parent class
class Shape {
 // Method of Shape class
 void display() {
     System.out.println("This is a shape");
 }
}

//First child class inherits Shape
class Circle extends Shape {
 // Method specific to Circle
 void area() {
     System.out.println("Area of circle = πr²");
 }
}

//Second child class inherits Shape
class Rectangle extends Shape {
 // Method specific to Rectangle
 void area() {
     System.out.println("Area of rectangle = length × width");
 }
}

//Main class to run the program
public class Hierarchical_Inheritance {
	public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.display();    // Inherited from Shape
        c.area();       // Circle’s own method

        r.display();    // Inherited from Shape
        r.area();       // Rectangle’s own method
    }
}

/*
Shape is the parent class with method display().
Both Circle and Rectangle inherit from Shape.
Each child has its own area() method.
This is hierarchical inheritance — multiple classes share one parent.
*/

