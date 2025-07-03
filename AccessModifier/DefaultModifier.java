package AccessModifier;

public class DefaultModifier {
    public static void main(String[] args) {
        Person2 p = new Person2("Mathew");

        // Accessing default field and methods from same package (same file)
        System.out.println("Name: " + p.name);       // allowed
        p.setName("Bob");                            // allowed
        System.out.println("Updated Name: " + p.getName());
    }
}

class Person2 {
    // Default access (no modifier)
    String name;

    // Default constructor
    Person2(String name) {
        this.name = name;
    }

    // Default getter
    String getName() {
        return name;
    }

    // Default setter
    void setName(String name) {
        this.name = name;
    }
}
//default (no keyword) :
//When no access modifier is specified, Java assigns default access (also called package-private).
//Members are accessible to any class within the same package.
//Not accessible from classes in other packages, even if they are subclasses.



