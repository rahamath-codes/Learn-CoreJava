package Fundamentals;

public class KeywordsInJava {

	    // private instance variable
	    private String username;

	    // static variable shared by all objects
	    static int userCount = 0;

	    // final variable - constant value
	    final double PI = 3.14159;

	    // Constructor to initialize username
	    public KeywordsInJava(String name) {
	        this.username = name;
	        userCount++;  // increase count when new user created
	    }

	    // Public method with void return type
	    public void showUser() {
	        System.out.println("User: " + username);
	        System.out.println("Total users: " + userCount);
	        System.out.println("Value of PI: " + PI);
	    }

	    // Static method to display a welcome message
	    public static void welcomeMessage() {
	        System.out.println("Welcome to KeywordsInJava class!");
	    }

	    // Main method - entry point
	    public static void main(String[] args) {
	        // Using new keyword to create objects
	        KeywordsInJava user1 = new KeywordsInJava("Alice");
	        KeywordsInJava user2 = new KeywordsInJava("Bob");

	        user1.showUser();
	        user2.showUser();

	        // Calling static method without creating object
	        welcomeMessage();

	        // Example of control flow with switch keyword
	        int day = 3;
	        switch(day) {
	            case 1:
	                System.out.println("Monday");
	                break;
	            case 2:
	                System.out.println("Tuesday");
	                break;
	            case 3:
	                System.out.println("Wednesday");
	                break;
	            default:
	                System.out.println("Another day");
	        }
	    }
	}

/*
| Keyword      | Purpose                                     |
| ------------ | ------------------------------------------- |
| `class`      | Used to declare a class                     |
| `public`     | Access modifier (visible everywhere)        |
| `private`    | Access modifier (visible only within class) |
| `static`     | Defines class-level variables/methods       |
| `void`       | Method returns nothing                      |
| `int`        | Data type for integers                      |
| `if`         | Conditional statement                       |
| `else`       | Alternative conditional branch              |
| `for`        | Looping construct                           |
| `while`      | Looping construct                           |
| `return`     | Returns a value from method                 |
| `new`        | Creates new objects                         |
| `extends`    | Inheritance keyword                         |
| `implements` | Implements interface                        |
| `try`        | Start of exception handling block           |
| `catch`      | Catch exceptions                            |
| `finally`    | Block always executed after try/catch       |
| `this`       | Refers to current object                    |
| `super`      | Refers to parent class                      |
| `abstract`   | Declares abstract class or method           |
| `interface`  | Declares interface                          |
| `boolean`    | Data type true/false                        |
| `break`      | Exit loop or switch                         |
| `continue`   | Skip current iteration of loop              |

Like these we have more than 50 keywords(varies slightly by version) in java each will do a specific job.
*/