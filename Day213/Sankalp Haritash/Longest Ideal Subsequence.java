class Solution {
    public int longestIdealString(String s, int k) {
        // Create an array to store the longest subsequence length for each character ending
        int[] dp = new int[128]; // ASCII characters range (could be adjusted to 256 if needed)

        int maxLen = 0; // To store the maximum length found

        for (char c : s.toCharArray()) {
            // Start assuming the best previous subsequence ending with `c` can extend by 1
            int currentMax = 0;

            // Check characters in the range [c-k, c+k]
            for (char prev = (char) Math.max('a', c - k); prev <= Math.min('z', c + k); prev++) {
                currentMax = Math.max(currentMax, dp[prev]);
            }

            // Update dp for character `c`
            dp[c] = currentMax + 1;

            // Update global max length
            maxLen = Math.max(maxLen, dp[c]);
        }

        return maxLen;
    }

}