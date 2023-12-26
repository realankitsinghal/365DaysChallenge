class Solution {
    int mod = 1_000_000_007;
    public int numRollsToTarget(int n, int k, int target) {
        long[] dp = new long[target + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = target; j >= 0; j--) {
                dp[j] = 0;
                for (int l = 1; l <= k; l++) {
                    if (j >= l) {
                        dp[j] = (dp[j] + dp[j - l]) % mod;
                    } else {
                        break;
                    }
                }
            }
        }
        return (int)dp[target];
    }
}