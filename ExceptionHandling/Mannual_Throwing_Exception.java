package ExceptionHandling;
/*
throw is a keyword in Java used to explicitly throw an exception object, either built-in or custom, from a method or a block of code.
Syntax : throw new ExceptionType("Exception message");
*/
public class Mannual_Throwing_Exception {

    // Method to validate age using manual exception throwing
    public static void validateAge(int age) {
        if (age < 18) {
            // manually throwing an exception
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough.");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(16);  // try with 20 to see "Access granted"
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues after handling the exception.");
    }
}
