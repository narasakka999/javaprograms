package Nuts;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the array
        int[] arr = {34, 78, 12, 45, 89, 23};

        // Get the target value from the user
        System.out.print("Enter the number to search for: ");
        int target = scanner.nextInt();

        // Perform linear search
        int index = linearSearch(arr, target);

        // Display the result
        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index + ".");
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }

        scanner.close();
    }

    // Linear search method
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return index if found
            }
        }
        return -1; // Return -1 if not found
    }
}
