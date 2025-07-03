package Java_Collections;
/*
An Iterator is an object that allows you to traverse (iterate over) elements of a collection one at a time.
It's part of the java.util package and works with any Collection (e.g., List, Set, etc.).

Iterator:
	-Works uniformly across all collection types	
	-Allows safe removal of elements during iteration
	-Avoids IndexOutOfBoundsException common with loops
*/
import java.util.*;
public class Java_Iterator {
	public static void main(String[] args) {
        // Create a list of names
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Get an iterator for the list
        Iterator<String> it = names.iterator();

        // Iterate through the list
        while (it.hasNext()) {
            // Get the next element
            String name = it.next();
            System.out.println(name);

            // Remove "Bob" safely during iteration
            if (name.equals("Bob")) {
                it.remove(); // Safe way to remove using iterator
            }
        }

        // Print the list after removal
        System.out.println("After removal: " + names);
    }
}
/*
| Method      | Description                           |
| ----------- | ------------------------------------- |
| `hasNext()` | Returns `true` if more elements exist |
| `next()`    | Returns the next element              |
| `remove()`  | Removes the last returned element     |
*/