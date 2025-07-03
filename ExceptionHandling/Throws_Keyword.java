package ExceptionHandling;
import java.io.*;
/*
The throws keyword in Java is used to declare exceptions that a method might throw. 
This means the method doesn’t handle the exception itself — it passes the responsibility to the caller. 

When to Use throws:
	-When you’re using checked exceptions (like IOException, SQLException, etc.)
	-When you want to defer exception handling to another method
*/
public class Throws_Keyword {
	  // This method declares that it might throw IOException
    public static void readFile() throws IOException {
        FileReader file = new FileReader("test.txt");
        file.read();
        file.close();
    }

    // Main method must handle or declare the exception
    public static void main(String[] args) {
        try {
            readFile();  // calling the method that may throw exception
        } catch (IOException e) {
            System.out.println("Exception handled: " + e.getMessage());
        }
    }
}
