package Abstraction;

/*
Why Use Interfaces for Abstraction?
  1.Complete Abstraction
	-Interfaces provide 100% abstraction because all methods in an interface are abstract (no method body) by default.
	-This means you only define what to do, not how to do it.
  2.Multiple Inheritance Support
	-Java does not allow multiple inheritance with classes (to avoid complexity and ambiguity).
	-But a class can implement multiple interfaces, so interfaces enable a form of multiple inheritance.
	-This helps design flexible and modular systems.
  3.Loose Coupling
	-By programming to an interface, your code depends on abstractions, not specific implementations.
	-This leads to easier maintenance and testing.	

*/

//Interface with abstract methods
interface Vehicle {
 void start();
 void stop();
}

//Class implementing interface methods
class Car implements Vehicle {
 public void start() {
     System.out.println("Car starting...");
 }

 public void stop() {
     System.out.println("Car stopping...");
 }
}

public class InterfaceExample {
 public static void main(String[] args) {
     Car myCar = new Car();
     myCar.start();
     myCar.stop();
 }
}


/*
| Feature                      | Abstract Class                                                             | Interface                                                                              |
| ---------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| Purpose                      | To provide partial abstraction (can have both abstract & concrete methods) | To provide full abstraction (mostly method declarations)                               |
| Methods                      | Can have abstract and concrete methods                                     | Only abstract methods (until Java 7); from Java 8, can have default and static methods |
| Variables                    | Can have instance variables (fields) with any access modifier              | Only public static final constants (no instance variables)                             |
| Multiple Inheritance         | Not supported (a class can extend only one abstract class)                 | Supported (a class can implement multiple interfaces)                                  |
| Constructor                  | Can have constructors                                                      | Cannot have constructors                                                               |
| Access Modifiers for Methods | Methods can have any access modifier                                       | Methods are implicitly public                                                          |
| When to use                  | Use when classes share a common base with some implemented code            | Use when unrelated classes need to share a contract/behavior                           |
| Inheritance Type             | Class-to-class inheritance                                                 | Implemented by classes                                                                 |
*/
