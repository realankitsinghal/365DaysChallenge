class Solution {
    public int longestIdealString(String s, int k) {
        int[] dp = new int[26];
        for (char c : s.toCharArray()) {
            int n = c - 'a';
            int max = 1;
            for (int i = 0; i < 26; i++) {
                if (Math.abs(i - n) <= k)
                    max = Math.max(max, dp[i] + 1);
            }
            dp[n] = max;
        }
        int res = 0;
        for (int i : dp)
            res = Math.max(res, i);
        return res;
    }
}