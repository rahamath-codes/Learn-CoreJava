package Java_Collections;
import java.util.*;
/*
A ListIterator is a special type of iterator available only for classes that implement the List interface 
(like ArrayList and LinkedList).

It allows you to:
	-Traverse the list forward and backward
	-Modify the list during iteration (add, remove, replace elements)
	-Get the index of elements while iterating
*/
public class List_ListIterator {
	public static void main(String[] args) {
        // Create a list of city names
        List<String> cities = new ArrayList<>();
        cities.add("Paris");
        cities.add("London");
        cities.add("Rome");

        // Get a ListIterator for the list
        ListIterator<String> iterator = cities.listIterator();

        System.out.println("Forward Traversal:");
        // Move forward through the list
        while (iterator.hasNext()) {
            String city = iterator.next();  // Get the next element
            System.out.println(city);

            // Modify the list while iterating
            if (city.equals("London")) {
                iterator.set("Berlin");   // Replace "London" with "Berlin"
                iterator.add("Madrid");   // Add "Madrid" right after "Berlin"
            }
        }

        System.out.println("\nBackward Traversal:");
        // Move backward through the list
        while (iterator.hasPrevious()) {
            String city = iterator.previous();  // Get the previous element
            System.out.println(city);
        }

        // Final state of the list
        System.out.println("\nFinal List: " + cities);
    }
}
/*
Use hasNext() and next() to go forward.
Use hasPrevious() and previous() to go backward.
Use set() to replace the last returned element.
Use add() to insert a new element at the current position.
Only available for List types (ArrayList, LinkedList, etc.).
Allows more control than a standard Iterator.
*/