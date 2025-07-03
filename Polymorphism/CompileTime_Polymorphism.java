package Polymorphism;

/*

Polymorphism means "many forms."
In Java, it allows one interface or method to behave differently based on the object that’s using it.

There are two main types of polymorphism:

1. Compile-Time Polymorphism (Method Overloading) - allows multiple methods with the same name but different parameter lists in the same class.
	-Same method name, different parameters.
	-Decided during compilation.
<This explains about Compile time polymorphism for Run time polymorphism please go to the RuntimePolymorphism class*/

//Class demonstrating method overloading
class Calculator {

 // Method 1: Adds two integers
 void add(int a, int b) {
     System.out.println("Sum (int): " + (a + b));
 }

 // Method 2: Adds two double values
 void add(double a, double b) {
     System.out.println("Sum (double): " + (a + b));
 }

 // Method 3: Adds three integers
 void add(int a, int b, int c) {
     System.out.println("Sum of three integers: " + (a + b + c));
 }
}

public class CompileTime_Polymorphism {
	 public static void main(String[] args) {
	        // Create Calculator object
	        Calculator calc = new Calculator();

	        // Call different overloaded versions of add()
	        calc.add(10, 20);          // Calls Method 1
	        calc.add(5.5, 4.5);        // Calls Method 2
	        calc.add(1, 2, 3);         // Calls Method 3
	    }
}

/*
-All add() methods have the same name, but different parameter types or counts.
-The correct method is chosen at compile time based on the arguments provided.
*/
