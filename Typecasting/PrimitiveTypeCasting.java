package Typecasting;

/*
Typecasting : is converting a variable from one data type to another.
Java supports two types of typecasting:
 1. Primitive Typecasting
 	i. Widening (Implicit / Safe Conversion)
 		Small → Large type (e.g., int → long)
 	ii. Narrowing (Explicit / Risky Conversion)
 		Large → Small type (e.g., double → int)
<For Non-Primitive please go to NonPrimitiveTypecasting.java class>
*/
public class PrimitiveTypeCasting {
public static void main(String[] args) {
        
        // Widening conversion (implicit) - smaller to bigger type
        int myInt = 100;
        long myLong = myInt;   // int to long automatically
        float myFloat = myLong; // long to float automatically

        System.out.println("Widening conversions:");
        System.out.println("int value: " + myInt);
        System.out.println("long value: " + myLong);
        System.out.println("float value: " + myFloat);

        System.out.println("-------------------------");

        // Narrowing conversion (explicit) - bigger to smaller type
        double myDouble = 9.78;
        float myFloat2 = (float) myDouble;  // double to float (needs cast)
        long myLong2 = (long) myFloat2;     // float to long (needs cast)
        int myInt2 = (int) myLong2;         // long to int (needs cast)

        System.out.println("Narrowing conversions:");
        System.out.println("double value: " + myDouble);
        System.out.println("float value after casting: " + myFloat2);
        System.out.println("long value after casting: " + myLong2);
        System.out.println("int value after casting: " + myInt2);
    }

}
