package ScannerClass;

import java.util.Scanner;

public class HowToGetInputFromUser {
	  public static void main(String[] args) {
	        /*
	         * Step 1: Import Scanner class from java.util package
	         * (Already done at the top with: import java.util.Scanner;)
	         * 
	         * Step 2: Create Scanner object to read input from console
	         */
	        Scanner scanner = new Scanner(System.in);

	        /*
	         * Step 3: Use Scanner methods to read different data types from user input
	         * 
	         * next()           : reads a single word (String)
	         * next().chartAt[0] : reads single letter in the string - first letter.
	         * nextInt()        : reads an integer (int)
	         * nextLine()       : reads an entire line (String)
	         * nextDouble()     : reads a double-precision floating point (double)
	         * nextLong()       : reads a long integer (long)
	         * nextFloat()      : reads a floating-point number (float)
	         * nextShort()      : reads a short integer (short)
	         * nextByte()       : reads a byte value (byte)
	         * nextBoolean()    : reads a boolean value (true/false)
	         * To read a char   : read a String with next() and take first character with charAt(0)
	         */

	        // Reading a single word String input
	        System.out.print("Enter your first name: ");
	        String firstName = scanner.next();

	        // next() leaves newline character; consume leftover newline before nextLine()
	        scanner.nextLine();

	        // Reading a full line String input
	        System.out.print("Enter your address: ");
	        String address = scanner.nextLine();

	        // Reading integer input
	        System.out.print("Enter your age: ");
	        int age = scanner.nextInt();

	        // Reading float input
	        System.out.print("Enter your height (in meters): ");
	        float height = scanner.nextFloat();

	        // Reading double input
	        System.out.print("Enter your weight (in kg): ");
	        double weight = scanner.nextDouble();

	        // Reading long input
	        System.out.print("Enter your phone number: ");
	        long phone = scanner.nextLong();

	        // Reading short input
	        System.out.print("Enter a short number: ");
	        short shortNum = scanner.nextShort();

	        // Reading byte input
	        System.out.print("Enter a byte value: ");
	        byte byteVal = scanner.nextByte();

	        // Reading boolean input
	        System.out.print("Are you currently enrolled? (true/false): ");
	        boolean enrolled = scanner.nextBoolean();

	        // Reading char input by reading a String and taking first character
	        System.out.print("Enter your gender (M/F): ");
	        char gender = scanner.next().charAt(0);
	        /*
	         * Step 4: Display the collected input data back to the user
	         */
	        System.out.println("\n--- User Details ---");
	        System.out.println("First Name: " + firstName);
	        System.out.println("Address: " + address);
	        System.out.println("Age: " + age);
	        System.out.println("Height: " + height);
	        System.out.println("Weight: " + weight);
	        System.out.println("Phone Number: " + phone);
	        System.out.println("Short Number: " + shortNum);
	        System.out.println("Byte Value: " + byteVal);
	        System.out.println("Enrolled: " + enrolled);
	        System.out.println("Gender: " + gender);
	        /*
	         * Step 5: Close the scanner object to free resources
	         */
	        scanner.close();
	    }
}
/*====================Taks=======================
 
1. Division by Zero Handling
Scenario:
A user enters 0 as the second integer for division and modulus operations.

Question:
How does the program handle division by zero? What will happen if you remove the if (num2 != 0) check?

Follow-up:
Can you modify the program to repeatedly ask the user for a valid (non-zero) second integer if zero is entered?

*

2. Even-Odd Checker Enhancement

Scenario:
The program checks if a number is even or odd using the modulo operator %.

Question:
How would the program behave if a negative number is entered? Will it still correctly identify even or odd? Why?

Follow-up:
Modify the program to handle negative inputs and display a message like "Negative even" or "Negative odd".

*

3. Day of Week Input Validation

Scenario:
The user enters a number outside the range 1 to 7 for the day of the week.

Question:
What does the switch statement do when an invalid number is entered?

Follow-up:
Can you rewrite the code to keep asking the user for a valid day number until a correct one is entered?

*/





