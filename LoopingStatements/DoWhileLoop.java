package LoopingStatements;

public class DoWhileLoop {
	public static void main(String[] args) {
        int i = 10;

        // Loop body runs once before condition is checked
        do {
            System.out.println("i = " + i);
            i++;
        } while (i <= 5); // Exit Check Loop - Checks Condition after loop/iteration gets finished.
    }
}
