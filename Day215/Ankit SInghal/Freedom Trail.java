class Solution {
    private int solve(char[] str1, int ind, char[] str2, int k,int n,Integer[][] dp){
        if(k == str2.length) return 0;
        int min = Integer.MAX_VALUE;
        if(dp[ind][k] != null) return dp[ind][k];
        for(int i = ind; i < n+ind; i++){
            if(str1[i%n] == str2[k]){
                min = Math.min(min,(i-ind+1 + solve(str1,i%n,str2,k+1,n,dp)));
            }
        }
        for(int i = n+ind; i >= ind; i--){
            if(str1[i%n] == str2[k]){
                min = Math.min(min,((n+ind)-i+1 + solve(str1,i%n,str2,k+1,n,dp)));
            }
        }
        return dp[ind][k] = min;
    }
    public int findRotateSteps(String ring, String key) {
        char[] str1 = ring.toCharArray();
        char[] str2 = key.toCharArray();
        Integer[][] dp = new Integer[ring.length()+1][key.length()+1];
        return solve(str1,0,str2,0,str1.length,dp);
    }
}