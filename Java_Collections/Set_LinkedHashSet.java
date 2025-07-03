package Java_Collections;

import java.util.LinkedHashSet;
/*
A LinkedHashSet in Java is a collection class that implements the Set interface and is backed by a hash table with a linked list running through it. 
This structure maintains the insertion order of elements, unlike HashSet.

Features:
	-No duplicate elements
	-Maintains insertion order
	-Allows one null element
	-Slightly slower than HashSet due to maintaining order
	-Not synchronized
*/
public class Set_LinkedHashSet {
	 public static void main(String[] args) {
	        // Create a LinkedHashSet of Integers
	        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();

	        // Add elements to the LinkedHashSet
	        numbers.add(10);
	        numbers.add(5);
	        numbers.add(20);
	        numbers.add(10); // Duplicate, won't be added

	        // Display the LinkedHashSet
	        System.out.println("Numbers in LinkedHashSet: " + numbers);

	        // Check if an element exists
	        System.out.println("Contains 5? " + numbers.contains(5));

	        // Remove an element
	        numbers.remove(20);

	        // Print after removal
	        System.out.println("After removing 20: " + numbers);
	    }
}
