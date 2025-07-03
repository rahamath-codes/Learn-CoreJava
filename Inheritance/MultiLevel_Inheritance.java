package Inheritance;

/*
Multilevel Inheritance is when a class inherits from a class which itself inherits from another class, forming a chain of inheritance.
It allows a child class to inherit properties and methods from multiple levels of ancestors.
*/


//Grandparent class
class Machine {
 void start() {
     System.out.println("Machine is starting");
 }
}

//Parent class inherits Machine
class Computer extends Machine {
 void process() {
     System.out.println("Computer is processing data");
 }
}

//Child class inherits Computer
class Laptop extends Computer {
 void portable() {
     System.out.println("Laptop is portable");
 }
}

public class MultiLevel_Inheritance {
	public static void main(String[] args) {
        Laptop myLaptop = new Laptop();

        myLaptop.start();     // From Machine
        myLaptop.process();   // From Computer
        myLaptop.portable();  // From Laptop
    }
}

/*
Machine is the grandparent class with method start().
Computer is the parent class inheriting Machine and adds process().
Laptop is the child class inheriting Computer and adds portable().
Laptop objects can use all three methods because of multilevel inheritance.
*/