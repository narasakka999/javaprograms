package Nuts;

import java.util.Scanner;

public class RotateMatrix {
    // Function to rotate the matrix by 90 degrees clockwise
    static void rotate90(int[][] mat) {
        int n = mat.length;

        // Flip the matrix clockwise using nested loops
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // Swap elements mat[i][j] and mat[j][i]
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        // Reverse each row
        for (int i = 0; i < n; i++) {
            int low = 0;
            int high = n - 1;
            while (low < high) {
                int temp = mat[i][low];
                mat[i][low] = mat[i][high];
                mat[i][high] = temp;
                low++;
                high--;
            }
        }
    }

    // Function to display the matrix
    static void display(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the matrix (n): ");
        int n = scanner.nextInt();

        // Validate the size
        if (n < 3 || n > 9) {
            System.out.println("Size out of range. Please enter a value between 3 and 9.");
            return;
        }

        int[][] mat = new int[n][n];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nOriginal Matrix:");
        display(mat);

        rotate90(mat);

        System.out.println("\nMatrix after 90-degree clockwise rotation:");
        display(mat);
    }
}

