class Solution {
    public static int distinctSubsequences(String S) {
    // code here
    int mod = 1000000007;
    int last[] = new int[256];
    Arrays.fill(last, -1);
    int n = S.length();
    int dp[] = new int[n + 1];
    dp[0] = 1;
    for (int i = 1; i <= n; i++) {
        dp[i] = (2 * dp[i - 1])%mod;
        if (last[S.charAt(i-1)] != -1)
            dp[i] = (dp[i] - dp[last[S.charAt(i - 1)]]+mod)%mod;
        last[S.charAt(i-1)] = (i-1);
    }
    return dp[n];
    }
}