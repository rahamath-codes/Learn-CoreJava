package Java_Arrays;
/*
Arrays in Java are used to store multiple values of the same data type in a single variable, 
instead of declaring separate variables for each value.
*/
public class Array_Declaration {
	public static void main(String[] args) {
        // 1. Declare and initialize an array
        int[] numbers = {10, 20, 30, 40, 50};

        // 2. Accessing elements
        System.out.println("First element: " + numbers[0]); // 10

        // 3. Modify an element
        numbers[2] = 99;
        System.out.println("Modified third element: " + numbers[2]); // 99

        // 4. Length of array
        System.out.println("Length of array: " + numbers.length); // 5

        // 5. Loop through array using for loop
        System.out.println("All elements using for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // 6. Loop using enhanced for-each loop
        System.out.println("All elements using for-each loop:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // 7. Multidimensional array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        System.out.println("Element at row 2, col 3: " + matrix[1][2]); // 6

        // 8. Default value example
        int[] defaultArray = new int[3];
        System.out.println("Default values in new int array:");
        for (int value : defaultArray) {
            System.out.println(value); // will print 0 three times
        }
    }
}
