package Typecasting;

/*
 Non-Primitive (Reference) Typecasting :	
Converting references between classes in an inheritance hierarchy.
	i.Upcasting:
	 	Automatically converting a child class reference to a parent class reference (safe).
	ii.Downcasting: 
		Manually converting a parent class reference back to a child class reference (needs explicit cast and can be unsafe).
*/

//Parent class
class Animal {
 void sound() {
     System.out.println("Animal makes a sound");
 }
}

//Child class
class Cat extends Animal {
 void sound() {
     System.out.println("Cat meows");
}
 
 void scratch() {
     System.out.println("Cat scratches");
 }
}

public class NonPrimitiveTypeCasting {
	 public static void main(String[] args) {
	        // Upcasting: Child object treated as Parent reference (automatic)
	        Animal a = new Cat();
	        a.sound();   // Calls Cat's overridden method (runtime polymorphism)
	        
	        // a.scratch();  // Not allowed, Animal reference doesn't know scratch()

	        // Downcasting: Parent reference cast back to Child
	        Cat c = (Cat) a;
	        c.scratch();  // Now accessible

	        // Unsafe downcasting example (uncomment to see runtime error)
	        /*
	        Animal a2 = new Animal();
	        Cat c2 = (Cat) a2;  // Causes ClassCastException at runtime!
	        c2.scratch();
	        */
	    }
}
