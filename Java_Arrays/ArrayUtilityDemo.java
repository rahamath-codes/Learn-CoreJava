package Java_Arrays;

import java.util.Arrays;

public class ArrayUtilityDemo {
    public static void main(String[] args) {
        // Original array
        int[] arr = {30, 10, 50, 20, 40};

        // 1. toString()
        System.out.println("Original array: " + Arrays.toString(arr));

        // 2. sort()
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        // 3. binarySearch() - search for element 30
        int index = Arrays.binarySearch(arr, 30);
        System.out.println("Index of 30 after sorting: " + index);

        // 4. copyOf()
        int[] copiedArray = Arrays.copyOf(arr, 7); // new length is 7
        System.out.println("Copied array (with extra space): " + Arrays.toString(copiedArray));

        // 5. fill()
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 99);
        System.out.println("Filled array with 99: " + Arrays.toString(filledArray));

        // 6. equals()
        int[] anotherArr = {10, 20, 30, 40, 50};
        boolean isEqual = Arrays.equals(arr, anotherArr);
        System.out.println("Are arrays equal? " + isEqual);

        // 7. copyOfRange()
        int[] rangeCopy = Arrays.copyOfRange(arr, 1, 4); // index 1 to 3
        System.out.println("Copy of range (1 to 3): " + Arrays.toString(rangeCopy));

        // 8. deepToString() for 2D arrays
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };
        System.out.println("2D array using deepToString(): " + Arrays.deepToString(matrix));
    }
}
