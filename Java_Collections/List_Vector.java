package Java_Collections;

/*
Vector is a legacy class in Java that implements the List interface.
	-It is similar to an ArrayList, but synchronized, meaning it's thread-safe.
	-Part of the Java Collection Framework, but introduced before Java 1.2.

Features:
	-Dynamic array: Grows as needed to accommodate new elements.
	-Thread-safe: All methods are synchronized, making it safe to use in multithreaded environments.
	-Allows duplicates and maintains insertion order.
	-Slower than ArrayList in single-threaded programs due to synchronization overhead.
*/
import java.util.Vector;
public class List_Vector {
	   public static void main(String[] args) {

	        // Create a Vector of Strings
	        Vector<String> languages = new Vector<>();

	        // Add elements
	        languages.add("Java");
	        languages.add("Python");
	        languages.add("C++");

	        // Insert element at index
	        languages.add(1, "JavaScript");

	        // Access elements
	        System.out.println("First language: " + languages.get(0));
	        System.out.println("All languages: " + languages);

	        // Remove element
	        languages.remove("Python");

	        // Iterate using for-each loop
	        System.out.println("After removal:");
	        for (String lang : languages) {
	            System.out.println(lang);
	        }

	        // Check size
	        System.out.println("Total elements: " + languages.size());
	    }
}

/*
When to Use Vector?
	Use Vector only if you specifically need thread safety and don't want to handle synchronization manually.
	In modern code, ArrayList + Collections.synchronizedList() or using CopyOnWriteArrayList is preferred for thread-safe operations.
Methods :
Package : java.util.Vector

1. add(E e)                 – Adds an element to the end
2. add(int index, E element) – Inserts element at a specified index
3. addElement(E obj)        – Legacy method to add at end
4. remove(Object o)         – Removes the first occurrence of the specified element
5. remove(int index)        – Removes the element at specified index
6. removeElement(Object obj) – Legacy method to remove an element
7. removeElementAt(int index) – Removes element at given index (legacy)
8. removeAllElements()      – Removes all elements (legacy)
9. get(int index)           – Returns element at given index
10. elementAt(int index)    – Legacy alternative to get()
11. set(int index, E element) – Replaces element at given index
12. setElementAt(E obj, int index) – Legacy method for setting value
13. size()                  – Returns number of elements
14. capacity()              – Returns current capacity
15. isEmpty()               – Checks if vector is empty
16. clear()                 – Removes all elements from the vector
17. contains(Object o)      – Checks if vector contains specified element
18. indexOf(Object o)       – Returns first index of the element
19. lastIndexOf(Object o)   – Returns last index of the element
20. firstElement()          – Returns first element
21. lastElement()           – Returns last element
22. clone()                 – Creates a shallow copy of the vector
23. toArray()               – Converts vector to an array
24. equals(Object o)        – Compares vectors
25. elements()              – Returns Enumeration for iteration (legacy)
26. iterator()              – Returns Iterator for modern iteration
27. listIterator()          – Returns ListIterator for advanced traversal
28. forEach(Consumer)       – Performs the given action on each element
29. stream()                – Returns a Stream (since Java 8)
30. ensureCapacity(int minCapacity) – Increases capacity if needed
31. trimToSize()            – Trims capacity to the current size

| Feature                 | ArrayList                                                       | LinkedList                                                 | Vector                                                 |
| ----------------------- | --------------------------------------------------------------- | ---------------------------------------------------------- | ------------------------------------------------------ |
| Internal Data Structure | Resizable array                                                 | Doubly linked list                                         | Resizable array                                        |
| Access Time (get/set)   | Fast — O(1)                                                     | Slow — O(n)                                                | Fast — O(1)                                            |
| Insertion/Deletion      | Slow in middle — O(n)                                           | Fast (especially at ends) — O(1)                           | Slow in middle — O(n)                                  |
| Thread Safety           | Not synchronized                                                | Not synchronized                                           | Synchronized (thread-safe)                             |
| Null Elements Allowed   | Yes                                                             | Yes                                                        | Yes                                                    |
| Memory Overhead         | Less memory overhead                                            | More memory overhead (due to links)                        | Similar to ArrayList but with synchronization overhead |
| Growth Mechanism        | Increases size by \~50% when full                               | Nodes allocated as needed                                  | Increases size by doubling when full                   |
| Use Case                | Best for fast random access and infrequent insertions/deletions | Best for frequent insertions/deletions, especially at ends | Legacy, use Vector if synchronization is needed        |
| Iterator Behavior       | Fail-fast                                                       | Fail-fast                                                  | Fail-fast                                              |
*/
