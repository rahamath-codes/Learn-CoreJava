package Java_Collections;

/*
A HashSet in Java is a collection class that implements the Set interface, backed by a hash table 
(actually a HashMap instance). It stores unique elements only, meaning duplicates are not allowed. 
It does not maintain any order of the elements.

Features:
	-No duplicate elements
	-No guaranteed order (insertion order is not preserved)
	-Allows null elements (only one)
	-Not synchronized (use Collections.synchronizedSet() if needed)
*/

import java.util.HashSet;

public class Set_HashSet{
	 public static void main(String[] args) {
	        // Create a HashSet of Strings
	        HashSet<String> fruits = new HashSet<>();

	        // Add elements to the HashSet
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Orange");
	        fruits.add("Apple");  // Duplicate, will not be added

	        // Display the HashSet
	        System.out.println("Fruits HashSet: " + fruits);

	        // Check if an element exists
	        System.out.println("Contains Banana? " + fruits.contains("Banana"));

	        // Remove an element
	        fruits.remove("Orange");

	        // Print after removal
	        System.out.println("After removing Orange: " + fruits);
	    }
}

/*
| Method               | Description                                                        |
| -------------------- | ------------------------------------------------------------------ |
| `add(E e)`           | Adds the specified element to the set if it's not already present. |
| `remove(Object o)`   | Removes the specified element from the set if it is present.       |
| `contains(Object o)` | Returns `true` if the set contains the specified element.          |
| `isEmpty()`          | Returns `true` if the set contains no elements.                    |
| `size()`             | Returns the number of elements in the set.                         |
| `clear()`            | Removes all elements from the set.                                 |
| `iterator()`         | Returns an iterator over the elements in the set.                  |
*/