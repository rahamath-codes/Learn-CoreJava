package ControlStatements;

public class SwithCase {
		
public static void main(String[] args) {
    int day = 3;
    // The switch statement checks the value of 'day'
    switch (day) {
        case 1: // If day == 1
            System.out.println("Monday");
            break;
        case 2: // If day == 2
            System.out.println("Tuesday");
            break;
        case 3: // If day == 3
            System.out.println("Wednesday");
            break;
        default: // If no case matches
            System.out.println("Another day");
    	}
	}
}

/* Task :
1. Calculator Operation
Scenario:
Write a simple calculator program that takes two numbers and an operator (+, -, *, /) as input.

Question:
How would you use a switch statement to perform the correct operation based on the operator?

Follow-up:
How would you implement the same functionality using if-else if? Which approach is more readable here? 
  
*/


