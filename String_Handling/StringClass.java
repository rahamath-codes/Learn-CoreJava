package String_Handling;

/*
What is a String?
	-A String is a sequence of characters.
	-In Java, String is a class, so strings are objects.
	-Strings are immutable (cannot be changed once created).
*/

public class StringClass {
	  public static void main(String[] args) {
	        String str = "  Hello World  ";

	        // Length
	        System.out.println("Length: " + str.length());

	        // Trim
	        String trimmed = str.trim();
	        System.out.println("Trimmed: '" + trimmed + "'");

	        // To Uppercase
	        System.out.println("Uppercase: " + trimmed.toUpperCase());

	        // Substring
	        System.out.println("Substring (0-5): " + trimmed.substring(0, 5));

	        // Character at index 1
	        System.out.println("Character at index 1: " + trimmed.charAt(1));

	        // Replace characters
	        String replaced = trimmed.replace('l', 'p');
	        System.out.println("Replaced 'l' with 'p': " + replaced);

	        // Compare strings
	        System.out.println("Equals 'Hello World'? " + trimmed.equals("Hello World"));
	 }
}
/*
String Methods and Their Purpose
length() — Returns the length of the string.
concat(String s) — Joins the given string to the end.
charAt(int index) — Returns the character at specified index.
substring(int start, int end) — Extracts substring between start and end indices.
toUpperCase() — Converts all characters to uppercase.
toLowerCase() — Converts all characters to lowercase.
equals(Object obj) — Checks if two strings are exactly equal.
equalsIgnoreCase(String s) — Checks if two strings are equal ignoring case.
trim() — Removes leading and trailing spaces.
replace(char oldChar, char newChar) — Replaces all occurrences of oldChar with newChar.
*/