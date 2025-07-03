package AccessModifier;

class MyClass {
    public int number = 10;  // Public field

    public void display() {  // Public method
        System.out.println("This is a public method");
    }
}

public class PublicModifier{
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        System.out.println(obj.number);// Accessing public variable
        obj.display();  // Calling public method
    }
}
//public :
//Members declared public are accessible from any class, in any package.
//Used for APIs and methods that need to be universally accessible.