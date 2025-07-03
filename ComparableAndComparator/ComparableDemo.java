package ComparableAndComparator;

import java.util.*;

public class ComparableDemo {
	public static void main(String[] args) {
        List<Student> students = List.of(
            new Student("Alice", 23),
            new Student("Bob", 20),
            new Student("Charlie", 25)
        );

        List<Student> modifiableList = new ArrayList<>(students);
        Collections.sort(modifiableList);  // Uses compareTo()

        System.out.println(modifiableList);
    }
}
