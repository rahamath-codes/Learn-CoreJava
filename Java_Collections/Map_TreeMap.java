package Java_Collections;

import java.util.Map;
import java.util.TreeMap;

/*
A TreeMap in Java is an implementation of the NavigableMap interface based on a Red-Black Tree.
It stores **key–value pairs in **sorted (ascending) order by keys.

Implements: NavigableMap<K, V>, SortedMap<K, V>, Map<K, V>

Ordering:
Natural ordering (e.g., alphabetically or numerically)
Or a custom Comparator

Nulls:
Does NOT allow null keys (throws NullPointerException)
Allows multiple null values
Duplicates: Keys must be unique, Values may dulipcate.
*/
public class Map_TreeMap {
	public static void main(String[] args) {
        TreeMap<Integer, String> students = new TreeMap<>();

        // Add entries
        students.put(102, "Alice");
        students.put(101, "Bob");
        students.put(103, "Charlie");

        // Print map (sorted by keys)
        System.out.println("Students (Sorted by ID):");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}

/*
| Method                       | Description                              |
| ---------------------------- | ---------------------------------------- |
| `put(K key, V value)`        | Inserts a key-value pair (sorted by key) |
| `get(Object key)`            | Returns value for a given key            |
| `remove(Object key)`         | Removes a mapping                        |
| `firstKey()`                 | Returns the smallest (lowest) key        |
| `lastKey()`                  | Returns the largest (highest) key        |
| `ceilingKey(K key)`          | Returns least key ≥ given key            |
| `floorKey(K key)`            | Returns greatest key ≤ given key         |
| `higherKey(K key)`           | Returns least key > given key            |
| `lowerKey(K key)`            | Returns greatest key < given key         |
| `headMap(K toKey)`           | Returns portion of map < toKey           |
| `tailMap(K fromKey)`         | Returns portion of map ≥ fromKey         |
| `subMap(K fromKey, K toKey)` | Returns portion between two keys         |
| `keySet()`                   | Returns keys in sorted order             |
| `values()`                   | Returns values in key order              |
| `entrySet()`                 | Returns sorted key-value pairs           |
*/

/*
| Feature                      | HashMap                                 | LinkedHashMap                          | TreeMap                                         |
| ---------------------------- | --------------------------------------- | -------------------------------------- | ----------------------------------------------- |
| Ordering                     | No order (unordered)                    | Insertion order maintained             | Sorted by keys (natural or custom)              |
| Null Keys                    | Allows 1 null key                       | Allows 1 null key                      | Does NOT allow null keys                        |
| Null Values                  | Allows multiple null values             | Allows multiple null values            | Allows multiple null values                     |
| Performance (get/put/remove) | Average O(1) (hashing)                  | Average O(1) (hashing + linked list)   | O(log n) (Red-Black tree)                       |
| Underlying Data Structure    | Hash Table                              | Hash Table + Doubly Linked List        | Red-Black Tree (self-balancing BST)             |
| Iteration Order              | No predictable order                    | Predictable: insertion or access order | Sorted ascending by key                         |
| Memory Overhead              | Least overhead                          | More overhead (due to linked list)     | Moderate overhead (tree structure)              |
| Use Case                     | Fastest access when order is irrelevant | When order of insertion/access matters | When sorted map needed or range queries         |
| Thread Safety                | Not thread-safe                         | Not thread-safe                        | Not thread-safe                                 |
| Additional Features          | None                                    | Access-order mode for LRU caches       | Navigation methods (firstKey(), subMap(), etc.) |

*/
