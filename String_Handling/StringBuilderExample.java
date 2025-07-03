package String_Handling;

/*
StringBuilder is a class in Java used to create mutable (changeable) strings.

Unlike the regular String class (which is immutable — once created, it cannot be changed), 
StringBuilder allows you to modify the contents of the string directly — such as appending, deleting, 
inserting, or replacing characters — without creating a new object every time.
*/

public class StringBuilderExample {
	  public static void main(String[] args) {
	        StringBuilder sb = new StringBuilder("Hello");
	        sb.append(" World");
	        sb.append(" World");
	        sb.insert(5, ",");
	        sb.replace(6, 11, " Java");
	        sb.delete(0, 1);
	        sb.reverse();
	        System.out.println(sb.toString());  // Output: Hello World
	    }
}
/*
Why use StringBuilder?
	-Efficient for string manipulation, especially in loops.
	-Better performance than String for repeated modifications.
	-Not thread-safe (use StringBuffer if you need thread safety).
 */