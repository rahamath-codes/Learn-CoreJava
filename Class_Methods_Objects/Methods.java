package Class_Methods_Objects;
/*
When you call a method, you can pass arguments (values) to it.
These arguments are received by the method as parameters.
Java is pass-by-value, so the method works with copies of the values.

i. Passing nothing & Return nothing - Method takes no parameters and does not return anything (void) [Simple method call]
ii. Passing values & Returning nothing - Method takes parameters but does not return a value (void). [Uses the passed values to perform actions.]
iii.passing nothing & returning values - Method takes no parameters but returns a value. [Returns some result without any input.] - Returns Fixed values
iv. passing value & return values - Method takes parameters and returns a value. Can use input values to compute and return a result.


*/
public class Methods {
	public static void main(String[] args) {
        int x = 5;
        int y = 7;
        
        greet();  // Calling method with no parameters and no return
        
        
        printSum(x, y); // Passing x and y to the method
        
        int number = getRandomNumber();  // No input, returns value
        
        int result = getSum(x, y); // Calling method and storing returned value
        System.out.println("Sum is: " + result); //Printing the returned value stored in the result container.
    }
	
	
	// Method that takes no argument and returns nothing
	public static void greet() {
	    System.out.println("Hello!");
	}
	
	// Method that takes two integers and prints their sum but returns nothing
    public static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum is: " + sum);
    }
    
    //Method that takes no arguments but returns a value [Fixed Value]
    public static int getRandomNumber() {
        return 42;
    }
    
    
    // Method that takes two integers and returns their sum
    public static int getSum(int a, int b) {
        return a + b;
    }
}	

/*
| Concept          | Description                          | Example usage                    |
| ---------------- | ------------------------------------ | -------------------------------- |
| Passing values   | Send data to a method as parameters  | `methodName(value1, value2);`    |
| Returning values | Method sends data back with `return` | `int result = methodName(args);` |
*/

/* Tasks :
1.Write a method to calculate the square of a number
-Create a method named square that:
-Takes one integer parameter.
-Returns the square of that integer.
-Call this method from main and print the result.

*

2.Write a method to check if a number is even
-Create a method named isEven that:
-Takes one integer parameter.
-Returns true if the number is even, false otherwise.
-Call this method in main with different numbers and print the results.

*

3.Write a method to find the maximum of three numbers
-Create a method named maxOfThree that:
-Takes three integers as parameters.
-Returns the maximum value among them.
-Call this method and display the returned maximum.
*/



