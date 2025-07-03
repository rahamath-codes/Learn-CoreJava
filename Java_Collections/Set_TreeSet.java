package Java_Collections;
import java.util.TreeSet;

/*
A TreeSet in Java is a NavigableSet implementation based on a Red-Black Tree (a self-balancing binary search tree). 
It stores unique elements in sorted (ascending) order.

Implements: NavigableSet, SortedSet, Set
Backed by: Tree (Red-Black Tree)
Ordering: Natural ordering (e.g., alphabetical for strings, ascending for numbers) or a custom Comparator
Null: Does not allow null (throws NullPointerException)
Duplicates: Not allowed
*/


public class Set_TreeSet {
    public static void main(String[] args) {
        // Create a TreeSet of Integers
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add elements
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(10); // Duplicate, won't be added

        // Display TreeSet (in ascending order)
        System.out.println("TreeSet: " + numbers);

        // First and last elements
        System.out.println("First: " + numbers.first());
        System.out.println("Last: " + numbers.last());

        // Check if contains an element
        System.out.println("Contains 20? " + numbers.contains(20));

        // Remove an element
        numbers.remove(10);

        // After removal
        System.out.println("After removing 10: " + numbers);
    }
}
/*
| Method             | Description                                                                          |
| ------------------ | ------------------------------------------------------------------------------------ |
| `add(E e)`         | Adds element if not present                                                          |
| `remove(Object o)` | Removes an element                                                                   |
| `first()`          | Returns the first (lowest) element                                                   |
| `last()`           | Returns the last (highest) element                                                   |
| `higher(E e)`      | Returns the least element greater than `e`                                           |
| `lower(E e)`       | Returns the greatest element less than `e`                                           |
| `ceiling(E e)`     | Returns the least element ≥ `e`                                                      |
| `floor(E e)`       | Returns the greatest element ≤ `e`                                                   |
| `pollFirst()`      | Retrieves and removes the first element                                              |
| `pollLast()`       | Retrieves and removes the last element                                               |
| `subSet(from, to)` | Returns a view of the portion of the set from `from` (inclusive) to `to` (exclusive) |

Limitations:
Slower than HashSet and LinkedHashSet for basic operations (O(log n) vs. O(1))
No null elements allowed
Needs comparable elements or a comparator

* Comparison oF all set
| Feature                           | HashSet                                        | LinkedHashSet                             | TreeSet                                              |
| --------------------------------- | ---------------------------------------------- | ----------------------------------------- | ---------------------------------------------------- |
| Ordering                          | No order (unordered)                           | Insertion order maintained                | Sorted order (natural or custom comparator)          |
| Null Elements                     | Allows one null element                        | Allows one null element                   | Does NOT allow null elements                         |
| Performance (add/remove/contains) | Average O(1) (hashing)                         | Average O(1) (hashing + linked list)      | O(log n) (Red-Black tree)                            |
| Underlying Data Structure         | Hash Table                                     | Hash Table + Doubly Linked List           | Red-Black Tree (self-balancing BST)                  |
| Iteration Order                   | No predictable order                           | Predictable: insertion order              | Sorted ascending order                               |
| Memory Overhead                   | Least overhead                                 | More overhead (due to linked list)        | Moderate overhead (tree structure)                   |
| Use Case                          | Best for fast access with no order requirement | When you need to preserve insertion order | When you need sorted elements and range operations   |
| Thread Safety                     | Not thread-safe                                | Not thread-safe                           | Not thread-safe                                      |
| Additional Features               | None                                           | None                                      | Navigation methods (first(), last(), subSet(), etc.) |

*/
