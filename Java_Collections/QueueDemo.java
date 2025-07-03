package Java_Collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	 public static void main(String[] args) {
	        Queue<String> queue = new LinkedList<>();

	        queue.offer("Alice");
	        queue.offer("Bob");
	        queue.offer("Charlie");

	        System.out.println("Queue head: " + queue.peek());  // Alice

	        System.out.println("Removed: " + queue.poll());     // removes Alice
	        System.out.println("Queue after removal: " + queue);

	        System.out.println("Contains Bob? " + queue.contains("Bob")); // true
	    }
}
/*
Queue :
- Queue is a linear data structure that follows **FIFO** (First In First Out) principle.
- Elements are inserted at the rear and removed from the front.
- It’s an interface in java.util package.
- Common implementations: LinkedList, PriorityQueue, ArrayDeque.

Features:
- Supports adding elements at the tail and removing from the head.
- Allows different ordering policies (like priority in PriorityQueue).
- Not thread-safe by default.
- Can be bounded or unbounded depending on implementation.

Common Methods:

Adding Elements:
- boolean add(E e)          // inserts element, throws exception if full
- boolean offer(E e)        // inserts element, returns false if full

Removing Elements:
- E remove()                // removes head, throws exception if empty
- E poll()                  // removes head, returns null if empty

Retrieving Elements:
- E element()               // retrieves head, throws exception if empty
- E peek()                  // retrieves head, returns null if empty

Other Methods:
- boolean contains(Object o)
- int size()
- boolean isEmpty()
- Iterator<E> iterator()    // iterate over elements in proper sequence

*/
