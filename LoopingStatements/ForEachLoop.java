package LoopingStatements;

public class ForEachLoop {
	  public static void main(String[] args) {
	        String[] colors = {"Red", "Green", "Blue"};  // initialize array

	        // for-each: check next element
	        for (String color : colors) {
	            System.out.println(color);  // print current element
	        }
	        // loop ends when no elements left
	    }
}
