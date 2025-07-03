package Java_Collections;
/*A Stack in Java is a Last-In‑First‑Out (LIFO) data structure, meaning the last item added is the first one removed.
You can use the legacy java.util.Stack class, but modern code usually prefers Deque (e.g., ArrayDeque)
Package : java.util.Stack

Methods :
push(E item) – Adds item to the top.
pop() – Removes and returns the top item; throws EmptyStackException if empty.
peek() – Returns (without removing) the top item; throws if empty.
empty() – Returns true if the stack has no elements.
search(Object o) – Returns 1-based position from the top or -1 if not found

// Stack in Java is a subclass of Vector, so it inherits most of the Vector methods.
*/
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top is: " + stack.peek());  // 30
        System.out.println("Popped: " + stack.pop());   // removes 30

        System.out.println("Stack empty? " + stack.empty()); // false
        System.out.println("Position of 10: " + stack.search(10)); // e.g. 2
    }
}
