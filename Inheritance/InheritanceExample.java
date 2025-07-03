package Inheritance;

public class InheritanceExample {
	public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound();  // Output: Dog barks

        Animal myAnimal = new Animal();
        myAnimal.sound();  // Output: Animal makes a sound
    }
}
/*
1. Single Inheritance - One class inherits from one parent class. 🡒 class Dog extends Animal
2. Multilevel Inheritance - A class inherits from a class that already inherits from another. 🡒 Puppy → Dog → Animal
3. Hierarchical Inheritance - Multiple classes inherit from the same parent class. 🡒 Dog, Cat → both extend Animal 
4. Multiple Inheritance (via Interfaces) - A class implements multiple interfaces. 🡒 class A implements Interface1, Interface2

NOTE : Multiple Inheritance with Classes (Not supported)
-- Java doesn’t allow a class to extend more than one class.
🡒 class C extends A, B ❌ (Error)
*/