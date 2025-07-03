package Java_Collections;

import java.util.HashMap;

/*
A HashMap in Java is a part of the Java Collections Framework and implements the Map interface. 
It stores data in key–value pairs, where keys are unique, but values can be duplicated. Internally, it uses a hash table.

Implements: Map<K, V>
Backed by: Hash table
Null: Allows one null key and multiple null values
Duplicates: Keys must be unique, values can be duplicates
Order: Does not maintain order (neither insertion nor sorted) 
*/
public class Map_HashMap {
	public static void main(String[] args) {
        // Create a HashMap of employee names and IDs
        HashMap<Integer, String> employees = new HashMap<>();

        // Add key-value pairs
        employees.put(101, "Alice");
        employees.put(102, "Bob");
        employees.put(103, "Charlie");
        employees.put(101, "David");  // Overwrites "Alice"

        // Display map
        System.out.println("Employees: " + employees);

        // Get a value by key
        System.out.println("ID 102: " + employees.get(102));

        // Remove a key-value pair
        employees.remove(103);

        // Check if key or value exists
        System.out.println("Contains key 101? " + employees.containsKey(101));
        System.out.println("Contains value 'Charlie'? " + employees.containsValue("Charlie"));

        // Iterate over keys and values
        for (Integer id : employees.keySet()) {
            System.out.println("ID: " + id + ", Name: " + employees.get(id));
        }
    }
}
/*
| Method                        | Description                                         |
| ----------------------------- | --------------------------------------------------- |
| `put(K key, V value)`         | Adds or updates a key-value pair                    |
| `get(Object key)`             | Returns the value for a key                         |
| `remove(Object key)`          | Removes a key and its value                         |
| `containsKey(Object key)`     | Checks if key exists                                |
| `containsValue(Object value)` | Checks if value exists                              |
| `size()`                      | Number of key-value pairs                           |
| `isEmpty()`                   | Checks if map is empty                              |
| `clear()`                     | Removes all entries                                 |
| `keySet()`                    | Returns a `Set` of keys                             |
| `values()`                    | Returns a `Collection` of values                    |
| `entrySet()`                  | Returns a `Set` of key-value mappings (`Map.Entry`) | 
 */