package Nuts;
import java.util.Arrays;
public class ReverseArray {

	public static void main(String[] args) {
		
		
		        int[] arr = {1, 2, 3, 4, 5};

		        // Initialize two pointers
		        int start = 0;
		        int end = arr.length - 1;

		        // Reverse the array in-place
		        while (start < end) {
		            // Swap elements at start and end
		            int temp = arr[start];
		            arr[start] = arr[end];
		            arr[end] = temp;

		            // Move pointers towards the center
		            start++;
		            end--;
		        }

		        // Print the reversed array
		        System.out.println("Reversed Array: " + Arrays.toString(arr));
		    }
		}


	


