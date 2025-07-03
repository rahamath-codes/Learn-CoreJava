package Java_Collections;

/*
LinkedList :
	-A doubly linked list implementation of the List interface.
	-Stores elements as nodes linked with pointers to the next and previous nodes.
	-Allows fast insertion and removal anywhere in the list.
	-Slower random access by index because traversal from start or end is needed.
*/

import java.util.LinkedList;

public class List_LinkedList {
	public static void main(String[] args) {
        // Create a LinkedList of String type
        LinkedList<String> animals = new LinkedList<>();

        // Add elements
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Elephant");
        animals.addFirst("Lion");     // Add at beginning
        animals.addLast("Tiger");     // Add at end

        // Display the LinkedList
        System.out.println("Animals: " + animals);

        // Access elements
        System.out.println("First animal: " + animals.getFirst());
        System.out.println("Last animal: " + animals.getLast());

        // Remove elements
        animals.removeFirst();        // Remove first element
        animals.removeLast();         // Remove last element
        animals.remove("Dog");        // Remove specific element

        // Display after removals
        System.out.println("After removals: " + animals);

        // Check if list contains an element
        System.out.println("Contains Elephant? " + animals.contains("Elephant"));

        // Iterate over elements
        System.out.println("Iterating over list:");
        for (String animal : animals) {
            System.out.println(animal);
        }
    }

}

/*
| Type                 | Direction             | Last Node Points To | Memory Usage | Traversal Ability  |
| -------------------- | --------------------- | ------------------- | ------------ | ------------------ |
| Singly Linked List   | One-way (next)        | null                | Less         | Forward only       |
| Doubly Linked List   | Two-way (prev & next) | null                | More         | Forward & backward |
| Circular Linked List | One or Two-way        | First node          | Moderate     | Circular traversal |
*/
