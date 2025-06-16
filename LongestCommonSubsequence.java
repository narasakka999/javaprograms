package Nuts;

public class LongestCommonSubsequence {

    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();

        // DP table
        int[][] dp = new int[m + 1][n + 1];

        // Build the table from bottom up
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // Characters match
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    // Take the max of left and top
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[m][n];  // The bottom-right value is the answer
    }

    public static void main(String[] args) {
        LongestCommonSubsequence solution = new LongestCommonSubsequence();

        String text1 = "abcde";
        String text2 = "ace";

        int result = solution.longestCommonSubsequence(text1, text2);
        System.out.println("LCS length: " + result);  // Output: 3
    }
}
