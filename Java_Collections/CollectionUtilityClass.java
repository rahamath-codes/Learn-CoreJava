package Java_Collections;
import java.util.*;
/*
The Collections class is a utility class in Java found in java.util.Collections. 
It provides static methods to work with collections (List, Set, Map, etc.) 
— such as sorting, searching, reversing, synchronizing, and more.
*/
public class CollectionUtilityClass {
	 public static void main(String[] args) {
		  // Create a list and add elements manually
	        List<String> fruits = new ArrayList<>();
	        fruits.add("Banana");
	        fruits.add("Apple");
	        fruits.add("Mango");
	        fruits.add("Orange");
	        
	        // Sort the list in natural (alphabetical) order
	        Collections.sort(fruits);
	        System.out.println("Sorted: " + fruits);

	        // Reverse the order
	        Collections.reverse(fruits);
	        System.out.println("Reversed: " + fruits);

	        // Shuffle the list randomly
	        Collections.shuffle(fruits);
	        System.out.println("Shuffled: " + fruits);

	        // Find max and min (lexicographically)
	        String maxFruit = Collections.max(fruits);
	        String minFruit = Collections.min(fruits);
	        System.out.println("Max: " + maxFruit);
	        System.out.println("Min: " + minFruit);

	        // Frequency of "Apple"
	        int appleCount = Collections.frequency(fruits, "Apple");
	        System.out.println("Frequency of 'Apple': " + appleCount);
	    }
}

/*
| Method                                     | Description                                                  |
| ------------------------------------------ | ------------------------------------------------------------ |
| `sort(List<T> list)`                       | Sorts the list in ascending (natural) order                  |
| `sort(List<T> list, Comparator)`           | Sorts using a custom comparator                              |
| `reverse(List<?> list)`                    | Reverses the order of elements in the list                   |
| `shuffle(List<?> list)`                    | Randomly shuffles the elements                               |
| `swap(List<?> list, int i, int j)`         | Swaps elements at positions i and j                          |
| `max(Collection)`                          | Returns the maximum element (based on natural order)         |
| `min(Collection)`                          | Returns the minimum element                                  |
| `frequency(Collection, Object)`            | Returns number of times the object appears in the collection |
| `binarySearch(List<T>, T key)`             | Searches sorted list for element using binary search         |
| `fill(List<? super T>, T val)`             | Replaces all elements with the given value                   |
| `copy(List<? super T>, List<? extends T>)` | Copies elements from one list to another                     |
| `synchronizedList(List<T>)`                | Returns a thread-safe (synchronized) list                    |
| `unmodifiableList(List<T>)`                | Returns an unmodifiable view of the list                     |
*/