package Variable_Scope;
//Definition: A variable declared inside a block (e.g., inside an if statement or loop) is only accessible within that block.
//Access: The variable is not accessible outside the block.


public class BlockScope {
	 public static void main(String[] args) {
	        if (true) {
	            int x = 5; // x is local to this block
	            System.out.println(x); // Can access x here
	        }

	        // System.out.println(x); // ERROR: x is not accessible here
	    }
}
