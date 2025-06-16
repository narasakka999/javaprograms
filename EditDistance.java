package Nuts;

public class EditDistance {

    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        // DP table
        int[][] dp = new int[m + 1][n + 1];

        // Base cases: empty strings
        for (int i = 0; i <= m; i++) dp[i][0] = i;  // all deletes
        for (int j = 0; j <= n; j++) dp[0][j] = j;  // all inserts

        // Fill the table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    // No operation needed
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    // Take minimum of insert, delete, replace
                    dp[i][j] = 1 + Math.min(
                        dp[i - 1][j - 1],  // replace
                        Math.min(dp[i - 1][j],    // delete
                                 dp[i][j - 1])    // insert
                    );
                }
            }
        }

        return dp[m][n];  // The result is at the bottom-right
    }

    public static void main(String[] args) {
        EditDistance solution = new EditDistance();

        String word1 = "horse";
        String word2 = "ros";

        int result = solution.minDistance(word1, word2);
        System.out.println("Minimum edit distance: " + result);  // Output: 3
    }
}
