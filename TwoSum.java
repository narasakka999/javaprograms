package Nuts;


	import java.util.HashMap;
	import java.util.Map;

	class TwoSum {
	    public int[] findTwoSum(int[] nums, int target) {
	        Map<Integer, Integer> numMap = new HashMap<>();
	        for (int i = 0; i < nums.length; i++) {
	            int complement = target - nums[i];
	            if (numMap.containsKey(complement)) {
	                return new int[] { numMap.get(complement), i };
	            }
	            numMap.put(nums[i], i);
	        }
	        return new int[] {};
	    }

	    public static void main(String[] args) {
	        TwoSum twoSum = new TwoSum();
	        int[] nums = {2, 7, 11, 15};
	        int target = 9;
	        int[] result = twoSum.findTwoSum(nums, target);
	        if(result.length == 2) {
	            System.out.println("Indices are: " + result[0] + ", " + result[1]);
	        } else {
	            System.out.println("No two sum solution exists.");
	        }
	    }
	}
