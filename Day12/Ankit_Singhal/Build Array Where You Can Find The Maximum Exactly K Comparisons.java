class Solution {
    public int numOfArrays(int n, int m, int k) {
        long[][][] dp = new long[n + 1][m + 1][k + 1];
        int mod = (int)1e9 + 7;
        dp[0][0][0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int kk = 1; kk <= k; kk++) {
                long sum = 0;
                for (int j = 1; j <= m; j++) {
                    sum += dp[i - 1][j - 1][kk - 1];
                    sum %= mod;
                    dp[i][j][kk] = (sum + (dp[i - 1][j][kk] * j) % mod) % mod;
                }
            }
        }
        long result = 0;
        for (int j = 1; j <= m; j++) {
            result += dp[n][j][k];
            result %= mod;
        }
        return (int) result;
    }
}