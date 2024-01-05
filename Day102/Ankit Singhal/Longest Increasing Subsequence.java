class Solution {
    public int lengthOfLIS(int[] nums) {            
        int n=nums.length;
        int dp[] = new int[n];
        Arrays.fill(dp, 0);
        dp[0]=1;
        int ans=1;
        for(int i=1;i<n;i++){
            for(int j=i-1;j>=0;j--){
                if(nums[j]<nums[i] && dp[i]<dp[j]){
                    dp[i]=dp[j];
                }
            }
           dp[i]++;
            ans=Math.max(ans,dp[i]);
        }
        return ans;
    }
}