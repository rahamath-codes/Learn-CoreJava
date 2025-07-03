package Inheritance;

/*
Hybrid Inheritance is a combination of two or more types of inheritance in a single program 
— such as single, multiple, multilevel, or hierarchical.
Java does not support hybrid inheritance with classes due to ambiguity (like the Diamond Problem),
but it can be implemented using interfaces.
*/
//Interface A with one method
interface A {
 void show();  // Part of base functionality
}

//Interface B extends interface A (Inheritance between interfaces)
interface B extends A {
 void print();  // Additional functionality in B
}

//Separate interface C (another line of functionality)
interface C {
 void display();  // Independent method
}

//Class implementing both B (which extends A) and C — Hybrid Inheritance
class HybridClass implements B, C {
 
 // Implementing show() from interface A (via B)
 public void show() {
     System.out.println("Show from Interface A");
 }

 // Implementing print() from interface B
 public void print() {
     System.out.println("Print from Interface B");
 }

 // Implementing display() from interface C
 public void display() {
     System.out.println("Display from Interface C");
 }
}

//Main class to test the hybrid inheritance
public class Hybrid_Inheritance {
	 public static void main(String[] args) {
	        // Create an object of HybridClass
	        HybridClass obj = new HybridClass();

	        // Call all inherited methods
	        obj.show();      // From A (inherited through B)
	        obj.print();     // From B
	        obj.display();   // From C
	    }
}
/*
B extends A → Interface inheritance (multilevel between interfaces)
HybridClass implements both B and C → Multiple inheritance via interfaces
Combination of multilevel + multiple = Hybrid Inheritance
*/