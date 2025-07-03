package Java8_Features;

// A lambda expression is a short and clear way to write anonymous functions (functions without a name).
// It was introduced in Java 8 to simplify writing code, especially for functional interfaces.
// Syntax : (parameters) -> { body }

interface Calculator {
    int operate(int a, int b);
}

public class LamdaExpressionDemo {
	public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        Calculator mul = (a, b) -> a * b;
        Calculator sub = (a,b) -> a - b;
        System.out.println("Addition: " + add.operate(5, 3));  // 8
        System.out.println("Multiplication: " + mul.operate(5, 3));  // 15
        System.out.println("Subtraction : " + sub.operate(2, 1)); // 1
    }
}

/*
| Feature                | Benefit                             |
| ---------------------- | ----------------------------------- |
| Shorter syntax         | Less boilerplate code               |
| Better readability     | Cleaner logic                       |
| Functional programming | Enables streams and functional APIs |
| Used with              | Threads, Collections, Streams       |
===========================================================================================================================
| Feature                    | Anonymous Class                                 | Lambda Expression (Anonymous Function)    |
| -------------------------- | ----------------------------------------------- | ----------------------------------------- |
| **What it is**             | A one-time subclass or interface implementation | A one-time **function** implementation    |
| **Introduced in**          | Java 1.1                                        | Java 8                                    |
| **Implements**             | Any class or interface                          | Only **functional interfaces** (1 method) |
| **Creates a new class?**   | ✅ Yes (behind the scenes)                      | ❌ No, just a function                    |
| **Can have state/fields?** | ✅ Yes                                          | ❌ No, just behavior (stateless function) |
| **Can access `this`?**     | Refers to the anonymous class instance          | Refers to the **enclosing class**         |
*/
