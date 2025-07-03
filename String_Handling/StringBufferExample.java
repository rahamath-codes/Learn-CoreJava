package String_Handling;
/*
StringBuffer is a class in Java used to create mutable strings — just like StringBuilder.
But the key difference is: StringBuffer is synchronized, meaning it is thread-safe — safe to use in multi-threaded environments.
*/
public class StringBufferExample {
	public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb.toString());  // Output: Hello World
    }
}
/*
Why use StringBuffer?
	-Use when multiple threads might access or modify the same string data.
	-Provides all major string operations: append, insert, delete, reverse, etc.
	-Slightly slower than StringBuilder due to synchronization overhead.
*/

/*

StringBuilder / StringBuffer Methods in Java

1. append(String str)          // Adds text to the end
2. insert(int index, String s) // Inserts text at specified position
3. replace(int start, int end, String s) // Replaces characters in the range
4. delete(int start, int end)  // Deletes characters between start and end
5. deleteCharAt(int index)     // Deletes a single character
6. reverse()                   // Reverses the entire string
7. setCharAt(int index, char c) // Changes a character at the given index
8. toString()                  // Converts to a regular String
9. length()                    // Returns current length of the string
10. capacity()                 // Returns allocated memory (default is 16 + initial string length)
11. ensureCapacity(int cap)    // Ensures minimum capacity is at least 'cap'
12. charAt(int index)          // Returns character at given index
13. substring(int start)       // Returns substring from index to end
14. substring(int start, int end) // Returns substring between start and end
15. indexOf(String str)        // Returns first index of substring
16. lastIndexOf(String str)    // Returns last index of substring
17. setLength(int newLength)   // Truncates or pads the string
18. trimToSize()               // Reduces capacity to current length

Note: Same methods are available in both StringBuilder and StringBuffer.
*/
