package Encapsulations;
/*
-Encapsulation means hiding the internal data of a class by making variables private.
-Access to these variables is controlled through public getter and setter methods.
-Getters allow reading the value; setters allow modifying the value with optional validation.
-It helps protect data from unauthorized access or changes.
-Encapsulation improves code maintainability, flexibility, and security.

<For Step 1 please go to the Perso.java class!>
*/

public class EncapsExample {
	public static void main(String[] args) {
        // Step 4: Create Person object
        Person p = new Person();

        // Use setters to set values
        p.setName("Alice");
        p.setAge(25);

        // Use getters to get values and print them
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());

        // Try to set invalid age
        p.setAge(-5);  // This will print warning and not change age
    }
}
