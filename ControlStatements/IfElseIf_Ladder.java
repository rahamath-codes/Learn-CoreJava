package ControlStatements;

public class IfElseIf_Ladder {
	public static void main(String[] args) {
		int score = 76;

        // Check if score is 90 or more
        if (score >= 90) {
            System.out.println("Grade A");
        }// If not, check if score is 75 or more
        else if (score >= 75) {
            System.out.println("Grade B");
        }	
        // If not, check if score is 60 or more
        else if (score >= 60) {
            System.out.println("Grade C");
        } 
        // If none of the above, print Grade F
        else {
            System.out.println("Grade F");
        }
	}
}
/*  Tasks :
1. Traffic Light Signal :
Scenario:
Your program receives a traffic light color as input ("red", "yellow", "green").

Question:
How would you write an if-else if ladder and a switch statement to print appropriate instructions:

"Stop" for red

"Get ready" for yellow

"Go" for green

Follow-up:
How would you handle invalid color inputs? 

2.  Leap Year Checker

Scenario:
Given a year, determine whether it is a leap year.

Question:
How can you use nested if and else if to implement the logic:

Year divisible by 400 → Leap year

Else if divisible by 100 → Not a leap year

Else if divisible by 4 → Leap year

Else → Not a leap year

Follow-up:
Can this be done with a switch statement? Why or why not?



*/


