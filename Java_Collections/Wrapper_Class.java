package Java_Collections;
/*
A wrapper class in Java is a class that wraps (encapsulates) a primitive data type into an object.
Java is an object-oriented language, and sometimes you need to work with objects instead of primitive types.
Wrapper classes provide a way to use primitive types like int, char, double, etc., as objects.

Why are Wrapper Classes Needed?
	-Collections (like ArrayList) work with objects only, not primitives.
	-To use methods with primitive values (e.g., parsing, converting).
	-For autoboxing and unboxing (automatic conversion between primitives and objects).
*/
import java.util.ArrayList;


public class Wrapper_Class {
	 public static void main(String[] args) {
	        int x = 100;

	        // Autoboxing
	        Integer obj = x;

	        // Unboxing
	        int y = obj;

	        System.out.println("Primitive: " + x);
	        System.out.println("Wrapper object: " + obj);
	        System.out.println("Unboxed back to primitive: " + y);

	        // Using wrapper with ArrayList
	        ArrayList<Integer> list = new ArrayList<>();
	        list.add(25); // autoboxing happens
	        System.out.println("ArrayList with wrapper: " + list);
	    }
}

/*
Wrapper classes wrap primitive data types into objects.

Primitive Type  ->  Wrapper Class

byte            ->  Byte
short           ->  Short
int             ->  Integer
long            ->  Long
float           ->  Float
double          ->  Double
char            ->  Character
boolean         ->  Boolean


Features:
- Used to store primitives as objects.
- Needed for collections like ArrayList.
- Support autoboxing (primitive to object).
- Support unboxing (object to primitive).
- Provide useful methods like parseInt(), toString(), etc.

Example:
int a = 5;
Integer obj = a;    // autoboxing
int b = obj;        // unboxing
*/
