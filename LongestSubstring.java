package Nuts;

import java.util.*;

public class LongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int left = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            // Remove characters from the left until the current character is unique
            while (seen.contains(s.charAt(right))) {
                seen.remove(s.charAt(left));
                left++;
            }

            // Add current character and update max length
            seen.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    // Example usage
    public static void main(String[] args) {
        LongestSubstring solution = new LongestSubstring();

        String s = "abcabcbb";
        int result = solution.lengthOfLongestSubstring(s);
        System.out.println("Longest length: " + result);  // Output: 3
    }
}
