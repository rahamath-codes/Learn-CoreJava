package Java8_Features;
// A class without a name, used to implement an interface or extend a class on-the-fly.

interface Greet {
    void sayHello();
}

public class AnonymousClassDemo {
    public static void main(String[] args) {
        Greet g = new Greet() { //Anonymous Class 
            public void sayHello() {
                System.out.println("Hello from anonymous inner class");
            }
        };
        g.sayHello(); // with the reference variable we can access anonymous class
    }
}

// Anonymous classes are useful for quickly creating a class for immediate use without cluttering your project with extra class files.
/*
| Reason                               | Explanation                                         |
| ------------------------------------ | --------------------------------------------------- |
| One-time use                         | No need to create a whole separate class            |
| Inline implementation                | Define behavior exactly where needed                |
| Method overriding                    | Override methods immediately                        |
| Pre-Java 8 for functional interfaces | Before lambdas existed, anonymous classes were used |
*/
