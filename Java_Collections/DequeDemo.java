package Java_Collections;
import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        // Using as Queue (FIFO)
        deque.addLast("Alice");
        deque.addLast("Bob");
        deque.addLast("Charlie");

        System.out.println("Queue front: " + deque.getFirst()); // Alice
        System.out.println("Queue remove: " + deque.removeFirst()); // removes Alice
        System.out.println("Queue after removal: " + deque);

        // Using as Stack (LIFO)
        deque.push("X");   // same as addFirst
        deque.push("Y");
        System.out.println("Stack top: " + deque.peek()); // Y
        System.out.println("Stack pop: " + deque.pop()); // removes Y
        System.out.println("Stack after pop: " + deque);
    }
}
/*
Deque 
- Deque stands for Double-Ended Queue.
- It is a linear collection that supports element insertion and removal at both ends.
- Deque can be used as both Queue (FIFO) and Stack (LIFO).
- It's an interface in java.util package.
- Common implementations: ArrayDeque, LinkedList.

Features:
---------
- Allows insertion, removal, and retrieval from both ends.
- Not thread-safe by default.
- More flexible than Stack or Queue alone.
- Typically faster than Stack (which extends Vector).
- Supports null elements in some implementations (LinkedList), but not in ArrayDeque.

Common Methods:
---------------
Adding Elements:
- void addFirst(E e)        // inserts element at the front
- void addLast(E e)         // inserts element at the end
- boolean offerFirst(E e)   // inserts element at front, returns false if fails
- boolean offerLast(E e)    // inserts element at end, returns false if fails

//E is a generic type parameter used in Java collections to represent the type of elements stored in the collection.

Removing Elements:
- E removeFirst()           // removes and returns front element
- E removeLast()            // removes and returns last element
- E pollFirst()             // removes front element, returns null if empty
- E pollLast()              // removes last element, returns null if empty

Retrieving Elements:
- E getFirst()              // retrieves front element without removing
- E getLast()               // retrieves last element without removing
- E peekFirst()             // retrieves front element or null if empty
- E peekLast()              // retrieves last element or null if empty

Stack Operations (LIFO):
- void push(E e)            // inserts element at front (like stack push)
- E pop()                   // removes and returns front element (like stack pop)

Other:
- boolean contains(Object o)
- int size()
- boolean isEmpty()
- Iterator<E> iterator()    // forward iterator
- Iterator<E> descendingIterator() // reverse iterator

*/






