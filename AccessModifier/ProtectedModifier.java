package AccessModifier;

public class ProtectedModifier {

	 public static void main(String[] args) {
	        Person1 p = new Person1("Alice");

	        // Accessing protected field directly — OK because same package (same file)
	        System.out.println("Name: " + p.name);

	        p.setName("Bob");
	        System.out.println("Updated Name: " + p.getName());
	    }
}

	class Person1 {
	    // protected field
	    protected String name;

	    public Person1(String name) {
	        this.name = name;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }
	}

//	protected :
//	Members declared protected are accessible:
//	Within the same package (just like default)
//	In subclasses, even if the subclass is in a different package
//	Commonly used when you want to allow access in subclasses but still limit general access.	
	
	