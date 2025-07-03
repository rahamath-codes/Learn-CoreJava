package Java_Collections;
/*
What are Java Generics?
Generics allow you to write classes, interfaces, and methods that operate on types specified by the user.
They provide type safety by letting you specify the type of objects a collection (or any class) can work with 
at compile time, preventing ClassCastException at runtime. 

Why use Generics?
	-Stronger type checks at compile time
	-Eliminate casts (no need for explicit casting)
	-Enable code reuse with different data types
*/
//Generic class
class Box<T> {
 private T content;

 public void set(T content) {
     this.content = content;
 }

 public T get() {
     return content;
 	}
}

public class Java_Generics {
	 public static void main(String[] args) {
	        Box<String> stringBox = new Box<>();
	        stringBox.set("Hello");
	        String s = stringBox.get();  // No cast needed

	        Box<Integer> intBox = new Box<>();
	        intBox.set(123);	
	        int i = intBox.get();
	        System.out.println("Generic Output : "+i);
	        System.out.println("Generic Output : "+s);
	    }
}

/*
| Aspect     | Wrapper Class                           | Generics                                      |
| ---------- | --------------------------------------- | --------------------------------------------- |
| Purpose    | Wrap primitives as objects              | Enable type-safe, reusable code               |
| Example    | `Integer`, `Double`, `Character`        | `List<T>`, `Box<T>`, `Map<K,V>`               |
| Related to | Boxing/unboxing primitives              | Compile-time type checking                    |
| Usage      | When you need an object for a primitive | When you want type-safe containers or methods |

in short:
	-Wrapper classes let you use primitives where objects are required.
	-Generics let you write flexible and type-safe code working with different types.
*/
