package Packages;

/*
1. Built-in Packages
These are packages provided by the Java API. They contain pre-defined classes and interfaces you can use directly.
Examples :
| Package     | Description                                            |
| ----------- | ------------------------------------------------------ |
| `java.lang` | Core classes (String, Math, Object...) — auto imported |
| `java.util` | Utility classes (ArrayList, Scanner, Date...)          |
| `java.io`   | Input and output (File, InputStream...)                |
| `java.net`  | Networking (Socket, URL...)                            |
| `java.sql`  | Database access (Connection, ResultSet...)             |


<For User-Defined Packages goto User_Defined_Package.java>
*/
import java.util.Scanner; //Importing the scanner class from util package provided by java.

public class Built_In_Package {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //here we used the Scanner class from util package.
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Hello, " + name);
    }
}
/*
Benefits of Packages:
-Organize classes logically.
-Avoid naming conflicts.
-Control access with package-private visibility.
-Easier maintenance and reuse.
 */