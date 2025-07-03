package Variable_Scope;
//Local Variable Scope: A local variable is declared inside a method or a block (e.g., loops or if-else blocks) 
//and is only accessible within that method/block.
//Access: You can only use the variable inside the method or block where it's declared.
public class LocalVariable {
	public static void main(String[] args) {
        int x = 10; // Local variable inside main method
        System.out.println(x); // Can access x here
    }
    // System.out.println(x); // ERROR: Can't access x here (outside main method)

	
}
