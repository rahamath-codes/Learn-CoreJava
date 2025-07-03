package Fundamentals;

public class Operators {
	 public static void main(String[] args) {
	        int a = 10, b = 3;

	        // 1. Arithmetic Operators
	        System.out.println("Arithmetic Operators:");
	        System.out.println("a + b = " + (a + b));  // Addition
	        System.out.println("a - b = " + (a - b));  // Subtraction
	        System.out.println("a * b = " + (a * b));  // Multiplication
	        System.out.println("a / b = " + (a / b));  // Division (integer division)
	        System.out.println("a % b = " + (a % b));  // Modulus (remainder)
	        System.out.println();

	        // 2. Assignment Operators
	        System.out.println("Assignment Operators:");
	        int c = a;         // Simple assignment
	        System.out.println("c = " + c);
	        c += 2;            // c = c + 2
	        System.out.println("c += 2: " + c);
	        c *= 3;            // c = c * 3
	        System.out.println("c *= 3: " + c);
	        c -= 5;            // c = c - 5
	        System.out.println("c -= 5: " + c);
	        c /= 2;            // c = c / 2
	        System.out.println("c /= 2: " + c);
	        System.out.println();

	        // 3. Comparison (Relational) Operators
	        System.out.println("Comparison Operators:");
	        System.out.println("a == b: " + (a == b));  // Equal to
	        System.out.println("a != b: " + (a != b));  // Not equal to
	        System.out.println("a > b: " + (a > b));    // Greater than
	        System.out.println("a < b: " + (a < b));    // Less than
	        System.out.println("a >= b: " + (a >= b));  // Greater than or equal to
	        System.out.println("a <= b: " + (a <= b));  // Less than or equal to
	        System.out.println();

	        // 4. Logical Operators
	        System.out.println("Logical Operators:");
	        boolean x = true, y = false;
	        System.out.println("x && y: " + (x && y));  // Logical AND
	        System.out.println("x || y: " + (x || y));  // Logical OR
	        System.out.println("!x: " + (!x));          // Logical NOT
	        System.out.println();

	        // 5. Unary Operators
	        System.out.println("Unary Operators:");
	        int num = 5;
	        System.out.println("num = " + num);
	        System.out.println("++num = " + (++num));   // Pre-increment
	        System.out.println("num++ = " + (num++));   // Post-increment
	        System.out.println("After num++: " + num);
	        System.out.println("--num = " + (--num));   // Pre-decrement
	        System.out.println("num-- = " + (num--));   // Post-decrement
	        System.out.println("After num--: " + num);
	        System.out.println();

	        // 6. Ternary Operator
	        System.out.println("Ternary Operator:");
	        int max = (a > b) ? a : b;   // Condition ? trueResult : falseResult
	        System.out.println("Max of a and b is: " + max);
	        System.out.println();

	        // 7. Bitwise Operators
	        System.out.println("Bitwise Operators:");
	        System.out.println("a & b = " + (a & b));   // Bitwise AND
	        System.out.println("a | b = " + (a | b));   // Bitwise OR
	        System.out.println("a ^ b = " + (a ^ b));   // Bitwise XOR
	        System.out.println("~a = " + (~a));         // Bitwise NOT
	        System.out.println("a << 1 = " + (a << 1)); // Left shift
	        System.out.println("a >> 1 = " + (a >> 1)); // Right shift
	    }
}

/// Outputs:
///Arithmetic Operators:
//a + b = 13
//a - b = 7
//...
//
///Assignment Operators:
//c = 10
//c += 2: 12
//...
//
///Comparison Operators:
//a == b: false
//...
//
///Logical Operators:
//x && y: false
//...
//
///Unary Operators:
//++num = 6
//num++ = 6
//After num++: 7
//...
//
///Ternary Operator:
//Max of a and b is: 10
//
///Bitwise Operators:
//a & b = 2
//a | b = 11
//~a = -11




