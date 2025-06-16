package Nuts;

public class RotatedArraySearch {

    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Found target
            if (nums[mid] == target) return mid;

            // Check which side is sorted
            if (nums[left] <= nums[mid]) {
                // Left side is sorted
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;  // search left
                } else {
                    left = mid + 1;   // search right
                }
            } else {
                // Right side is sorted
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;   // search right
                } else {
                    right = mid - 1;  // search left
                }
            }
        }

        return -1; // not found
    }

    public static void main(String[] args) {
        RotatedArraySearch solution = new RotatedArraySearch();

        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int result = solution.search(nums, target);
        System.out.println("Target index: " + result);  // Output: 4
    }
}
