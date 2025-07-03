package AccessModifier;
//private access modifier is used to restrict access to fields, methods, and constructors 
//so that they are only accessible within the same class where they are declared.
public class PrivateModifier {
	public static void main(String[] args) {
        Person p = new Person("Bob");

        // Trying to access private field directly (Not allowed)
        // System.out.println(p.name); // ❌ Compile-time error

        // Access via public methods (Allowed)
        System.out.println("Name: " + p.getName());

        p.setName("Bob");
        System.out.println("Updated Name: " + p.getName());
    }
}
class Person {
    // private field
    private String name;

    // constructor
    public Person(String name) {
        this.name = name;
    }

    // public getter
    public String getName() {
        return name;
    }

    // public setter
    public void setName(String name) {
        this.name = name;
    }
}
//private :  
//Members (variables, methods, constructors) declared private are only accessible within the same class.
//Not accessible from subclasses or other classes, even in the same package.
//Used for data hiding.



