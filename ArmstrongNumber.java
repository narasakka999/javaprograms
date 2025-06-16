package Nuts;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        // Create scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Store the original number
        int originalNumber = number;
        
        // Find the number of digits in the number
        int numberOfDigits = String.valueOf(number).length();
        
        // Variable to store the sum of the digits raised to the power of numberOfDigits
        int sum = 0;
        
        // Loop through each digit of the number
        while (number > 0) {
            // Extract the last digit
            int digit = number % 10;
            
            // Add the digit raised to the power of numberOfDigits
            sum += Math.pow(digit, numberOfDigits);
            
            // Remove the last digit
            number /= 10;
        }
        
        // Check if the sum is equal to the original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
        
        // Close the scanner
        scanner.close();
    }
}





