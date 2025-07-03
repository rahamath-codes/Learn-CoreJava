package Java_Collections;

import java.util.ArrayList;

/*
Collection Framework in Java:

- A set of classes and interfaces for storing and manipulating groups of objects.
- Provides data structures like lists, sets, queues, and maps.
- Helps manage dynamic data efficiently.

Main Interfaces:
- Collection: Root interface for most collections.
- List: Ordered collection (allows duplicates), e.g., ArrayList, LinkedList.
- Set: No duplicates allowed, e.g., HashSet, TreeSet,LinkedHashSet.
- Queue: FIFO order, e.g., PriorityQueue, LinkedList.
- Map: Stores key-value pairs, e.g., HashMap, TreeMap.

Features:
- Dynamic size (unlike arrays).
- Provides methods to add, remove, search, and iterate elements.
- Supports generics for type safety.
*/
// A Simple Example with implementations in ArrayList class of List Interface.
public class Collection_FrameWork {
	 public static void main(String[] args) {
	        ArrayList<String> list = new ArrayList<>();
	        list.add("Java");
	        list.add("Python");
	        list.add("C++");

	        for (String lang : list) {
	            System.out.println(lang);
	        }
	    }
}
