package ExceptionHandling;

import java.io.IOException;

/*What is an Exception?
An exception is an event that disrupts the normal flow of a program.
It occurs during runtime (e.g., dividing by zero, accessing invalid array index, etc.).

1. Checked Exceptions
	-Checked at compile-time.
	-Must be either caught using try-catch or declared using throws.
	-Usually related to external resources (files, database, network).

Examples:
IOException
SQLException
FileNotFoundException

<For Unchecked Exception please goto UncheckedException.java class>

Basic Syntax: try and catch block

try {
    // risky code
} catch (ExceptionType name) {
    // handle the exception
}

*/
public class CheckedExceptionHandling {
	public static void main(String[] args) {
        try {
            int num = 10;
            int result = num / 0;  // This will cause ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            System.out.println("This block always executes.");
        }

        System.out.println("Program continues after exception.");
    }
	void readFile() throws IOException { //Handling exception through throws keyword
	    // file reading logic
	} //<In Brief, Go to Throws_Keyword.java Class>
}
/*
i.try block:
	-Wraps code that might cause an exception.
	-If an exception occurs inside the try block, the program immediately jumps to the matching catch block.

ii.catch block:
	-Handles the exception that occurs in the try block.
	-Prevents the program from crashing.

iii.finally Block - Always executes — even if an exception occurs or not. Good for cleaning up resources.

iv.throw Keyword - Used to manually throw an exception.

v.throws Keyword - Used to declare exceptions a method might throw.
 */