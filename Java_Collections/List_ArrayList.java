package Java_Collections;

/*
A List is an ordered collection (also called a sequence).
	-It allows duplicate elements.
	-Elements in a List can be accessed by their index (position).
	-It is part of the Java Collection Framework.
	-List interface extends Collection interface.

ArrayList :
	-A resizable array implementation of the List interface.
	-Stores elements in a dynamically growing array.
	-Provides fast random access to elements using an index.
	-Slower when adding or removing elements in the middle because elements need to be shifted.
*/


import java.util.ArrayList;

public class List_ArrayList {
	public static void main(String[] args) {
		// Create an ArrayList of String type
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        // Display all elements using for-each loop
        System.out.println("Fruits List:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Get element at specific index
        System.out.println("\nFruit at index 2: " + fruits.get(2));

        // Remove element by value
        fruits.remove("Banana");

        // Remove element by index
        fruits.remove(0);

        // Display list after removals
        System.out.println("\nFruits List after removals:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Check if list contains an element
        System.out.println("\n	Contains Mango? " + fruits.contains("Mango"));

        // Get size of the list
        System.out.println("Number of fruits: " + fruits.size());

	}
}


/*
| List Type      | Description                                   | Key Feature                                                |
| -------------- | --------------------------------------------- | ---------------------------------------------------------- |
| **ArrayList**  | Resizable-array implementation of List        | Fast random access, slower inserts/deletes (except at end) |
| **LinkedList** | Doubly-linked list implementation of List     | Faster inserts and deletes, slower random access           |
| **Vector**     | Like ArrayList but synchronized (thread-safe) | Thread-safe but slower due to synchronization              |
| **Stack**      | Last-In-First-Out (LIFO) stack implementation | Extends Vector, used for stack operations                  |
*/