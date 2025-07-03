package ComparableAndComparator;
import java.util.*;

/*
Comparator is an interface used to define custom ordering of objects. 
You can create multiple comparators to sort the same type of objects in different ways, without modifying the original class.

Method to implement: int compare(T o1, T o2);
Used with:
Collections.sort(list, comparator) or Arrays.sort(array, comparator)
*/

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(List.of(
            new Student("Alice", 23),
            new Student("Bob", 20),
            new Student("Charlie", 25)
        ));

        // Sort by name (alphabetical)
        Comparator<Student> nameComparator = new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s1.name.compareTo(s2.name);
            }
        };

        Collections.sort(students, nameComparator);
        System.out.println("Sorted by name: " + students);

        // Sort by age descending (using lambda)
        Comparator<Student> ageDescComparator = (s1, s2) -> s2.age - s1.age;
        Collections.sort(students, ageDescComparator);
        System.out.println("Sorted by age descending: " + students);
    }
}
