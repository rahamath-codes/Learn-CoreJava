package Inheritance;

/*
Multiple inheritance allows a class to inherit features from more than one parent.
Java does not support multiple inheritance with classes (to avoid ambiguity).
But it does support multiple inheritance using interfaces.
*/
//First interface
interface Driver {
 void drive();  // Abstract method to be implemented
}

//Second interface
interface Coder {
 void code();   // Abstract method to be implemented
}

//A class implementing both interfaces (Multiple Inheritance)
class Techie implements Driver, Coder {
 
 // Implementing method from Driver
 public void drive() {
     System.out.println("Techie drives to the office.");
 }

 // Implementing method from Coder
 public void code() {
     System.out.println("Techie writes Java code.");
 }
}

//Main class to run the program
public class Multiple_Inheritance {
	 public static void main(String[] args) {
	     // Create an object of Techie class
	     Techie person = new Techie();

	     // Call both methods from different interfaces
	     person.drive();  // Output from Driver
	     person.code();   // Output from Coder
	 }

}
