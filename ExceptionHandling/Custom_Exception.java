package ExceptionHandling;
/*
A custom exception is a user-defined exception class created by extending the built-in Exception class (or any of its subclasses).
It allows you to create meaningful error types specific to your application.

How to Create a Custom Exception:
	-Create a new class that extends Exception (for checked exceptions) or RuntimeException (for unchecked exceptions).
	-Add constructors to pass error messages.
*/

//Define a custom checked exception
class InvalidAgeException extends Exception {
 public InvalidAgeException(String message) {
     super(message);
 }
}

public class Custom_Exception {

    // Method that throws custom exception if age is invalid
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be at least 18");
        } else {
            System.out.println("Age is valid.");
        }
    }

    public static void main(String[] args) {
        try {
        	int age = 16;
            checkAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
/*
-Custom exceptions improve code readability and error handling.
-Extend Exception for checked exceptions, or RuntimeException for unchecked.
-Use throw to raise your custom exception.
*/