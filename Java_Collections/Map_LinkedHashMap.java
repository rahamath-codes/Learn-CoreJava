package Java_Collections;

import java.util.LinkedHashMap;
import java.util.Map;

/*
A LinkedHashMap is a subclass of HashMap that maintains a doubly-linked list running through its entries.
 This means it preserves insertion order (or access order, if configured).
Implements: Map<Key, Value>
Backed by: Hash table + doubly-linked list

Features:
Maintains insertion order (or access order if enabled)
Allows one null key and multiple null values
Faster iteration than HashMap due to predictable order
Not synchronized (not thread-safe) 
 */
public class Map_LinkedHashMap {
	 public static void main(String[] args) {
	        LinkedHashMap<Integer, String> books = new LinkedHashMap<>();

	        // Add entries
	        books.put(101, "The Hobbit");
	        books.put(102, "1984");
	        books.put(103, "Brave New World");
	        books.put(102, "Animal Farm"); // Overwrites "1984"

	        // Print map
	        System.out.println("Books (Insertion Order):");
	        for (Map.Entry<Integer, String> entry : books.entrySet()) {
	            System.out.println(entry.getKey() + " => " + entry.getValue());
	        }
	    }
}

/*
| Method                        | Description                                 |
| ----------------------------- | ------------------------------------------- |
| `put(K key, V value)`         | Adds/updates key-value pair                 |
| `get(Object key)`             | Returns value for a given key               |
| `remove(Object key)`          | Removes entry                               |
| `containsKey(Object key)`     | Checks if key exists                        |
| `containsValue(Object value)` | Checks if value exists                      |
| `size()`                      | Returns number of entries                   |
| `clear()`                     | Removes all entries                         |
| `keySet()`                    | Returns keys as a `Set`                     |
| `values()`                    | Returns all values as a `Collection`        |
| `entrySet()`                  | Returns entries as a `Set<Map.Entry<K, V>>` |
*/
