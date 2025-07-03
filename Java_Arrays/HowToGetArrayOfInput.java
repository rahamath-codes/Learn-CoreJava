package Java_Arrays;

import java.util.Scanner;

public class HowToGetArrayOfInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for the size of the array
        System.out.println("Enter the Size of the Array : ");
        int size = sc.nextInt();

        // Declare the array with the given size
        int arr[] = new int[size];

        // Input elements into the array
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element at index " + i + " : ");
            arr[i] = sc.nextInt();
        }

        // Print all elements using a for-each loop
        System.out.println("The elements in the array are:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        
        sc.close(); // Always good to close the scanner
    }
}

/*	
Limitations :
	-Fixed size (can’t grow dynamically)
	-That’s why ArrayList (from java.util) is often used instead for more flexibility
*/