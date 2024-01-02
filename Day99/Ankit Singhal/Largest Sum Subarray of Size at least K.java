class Solution {
    
     public long maxSumWithK(long a[], long n, long k)
    {
        long[] dp = new long[(int)n+1];
        for(int i = (int)n-1;i>=0;i--){
            dp[i] = a[i] + dp[i+1];
            dp[i] = Math.max(0, dp[i]);
        }
        long curr_sum = 0;
        long max_sum = Integer.MIN_VALUE;
        
        for(int i=0; i < (int)k ; i++){
            curr_sum = curr_sum + a[i];
        }
        
        for(int i=(int)k;i<(int)n;i++){
            max_sum = Math.max(max_sum, curr_sum+dp[i]);
            curr_sum = curr_sum + a[i];
            curr_sum = curr_sum - a[i-(int)k];
        }
        
        return Math.max(max_sum, curr_sum);
    }
}