package Nuts;

import java.util.Scanner;

public class MaximumSubarraySum {

    public static int findMaxSubArraySum(int[] arr) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int num : arr) {
            currentSum = Math.max(num, currentSum + num);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int maxSum = findMaxSubArraySum(arr);
        System.out.println("Maximum subarray sum is: " + maxSum);
    }
}

