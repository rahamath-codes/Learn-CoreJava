package Fundamentals;

public class DataTypes {

	public static void main(String[] args) {
		// Primitive types
        byte b = 100;
        short s = 32000;
        int i = 50000;
        long l = 15000000000L;
        float f = 5.75f;
        double d = 19.99;
        char c = 'J';
        boolean isJavaFun = true;

        // Non-primitive types
        String name = "Java";
        int[] numbers = {2, 2, 3};
        
        // Print all variables
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + isJavaFun);
        System.out.println("String: " + name);
        System.out.println("Array (first element): " + numbers[0]); //0 - means index for the first value in array.
        
	}
}

/// Notes: Datatypes are used to define the type of the data. 
/// 1. Primitive Datatypes:
//| Type      | Size    | Example                       | What it stores                       |
//| --------- | ------- | ----------------------------- | ------------------------------------ |
//| `byte`    | 1 byte  | `byte age = 25;`              | Very small integers (-128 to 127)    |
//| `short`   | 2 bytes | `short year = 2023;`          | Small integers                       |
//| `int`     | 4 bytes | `int score = 95;`             | Regular whole numbers                |
//| `long`    | 8 bytes | `long distance = 123456789L;` | Big whole numbers (note the `L`)     |
//| `float`   | 4 bytes | `float temp = 36.6f;`         | Decimal values (note the `f`)        |
//| `double`  | 8 bytes | `double pi = 3.14159;`        | High precision decimal numbers       |
//| `char`    | 2 bytes | `char grade = 'A';`           | Single character (use single quotes) |
//| `boolean` | 1 bit   | `boolean isJavaFun = true;`   | True or false                        |

///  2. Non-Primitve Datatypes:
//| Type                           | Example                                  | What it stores                          |
//| ------------------------------ | ---------------------------------------- | --------------------------------------- |
//| `String`                       | `String name = "Alice";`                 | A sequence of characters (text)         |
//| `Array`                        | `int[] nums = {1, 2, 3};`                | A collection of values of the same type |
//| `Class`                        | `Car myCar = new Car();`                 | User-defined or built-in objects        |
//| `Object`                       | `Object obj = new Object();`             | Base class of all other classes         |
//| `List` (from Java Collections) | `List<String> list = new ArrayList<>();` | Resizable array-like structure          |
