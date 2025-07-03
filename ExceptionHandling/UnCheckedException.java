package ExceptionHandling;
/*
2. Unchecked Exceptions
	-Occur at runtime.
	-Not checked by the compiler.
	-Caused mostly by programming errors like logic issues or null access.

Examples:
ArithmeticException
NullPointerException
ArrayIndexOutOfBoundsException

*/
public class UnCheckedException {
	public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        System.out.println(numbers[5]);  // Unchecked exception (ArrayIndexOutOfBoundsException)
    }
}
/*
Checked vs Unchecked Exceptions in Java

| Feature               | Checked Exception                        | Unchecked Exception                        |
|-----------------------|------------------------------------------|--------------------------------------------|
| Checked by compiler?  | Yes                                      | No                                         |
| Must be handled?      | Yes (try-catch or throws required)       | Optional                                   |
| Inherits from         | Exception (excluding RuntimeException)   | RuntimeException or its subclasses         |
| Occurs at             | Compile-time                             | Runtime                                    |
| Examples              | IOException, SQLException                | NullPointerException, ArithmeticException  |

*/
