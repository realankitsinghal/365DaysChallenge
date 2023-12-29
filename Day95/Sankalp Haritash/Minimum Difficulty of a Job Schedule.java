class Solution {
    public int minDifficulty(int[] jobDifficulty, int d) {
        if (jobDifficulty == null || jobDifficulty.length < d || d <= 0) {
            return -1;
        }
        int n = jobDifficulty.length;
        int[] dp = new int[n];
        dp[0] = jobDifficulty[0];
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], jobDifficulty[i]);
        }
        for (int i = 2; i <= d; i++) {
            for (int j = n - 1; j >= i - 1; j--) {
                dp[j] = Integer.MAX_VALUE;
                int lastMax = jobDifficulty[j];
                for (int k = j - 1; k >= i - 2; k--) {
                    lastMax = Math.max(lastMax, jobDifficulty[k + 1]);
                    dp[j] = Math.min(dp[j], lastMax + dp[k]);
                }
            }
        }
        return dp[n - 1];
    }
}