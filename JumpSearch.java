package Nuts;

import java.util.Scanner;

public class JumpSearch {

    // Method to perform Jump Search
    public static int jumpSearch(int[] arr, int target) {
        int n = arr.length;
        int step = (int) Math.floor(Math.sqrt(n)); // Optimal jump size
        int prev = 0;

        // Jump ahead in blocks
        while (arr[Math.min(step, n) - 1] < target) {
            prev = step;
            step += (int) Math.floor(Math.sqrt(n));
            if (prev >= n) {
                return -1;
            }
        }

        // Linear search within the block
        for (int i = prev; i < Math.min(step, n); i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1; // Not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sorted array (required for jump search)
        int[] arr = {3, 8, 15, 19, 24, 31, 42, 56, 67, 78, 89, 95};

        System.out.print("Enter the number to search for: ");
        int target = scanner.nextInt();

        int result = jumpSearch(arr, target);

        if (result != -1) {
            System.out.println("Element " + target + " found at index " + result + ".");
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }

        scanner.close();
    }
}

