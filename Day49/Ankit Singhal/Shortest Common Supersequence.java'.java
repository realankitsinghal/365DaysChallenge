class Solution
{
    //Function to find length of shortest common supersequence of two strings.
    public static int shortestCommonSupersequence(String X,String Y,int m,int n)  {
        int dp[] = new int[n+1],cur[] = new int[n+1];
        for(int i=1;i<=m;i++){ 
            for(int j=1;j<=n;j++)
                cur[j]=(X.charAt(i-1)==Y.charAt(j-1))?1+dp[j-1]:Math.max(dp[j],cur[j-1]);
            dp=cur.clone();
        } return m+n-dp[n];
    }
}