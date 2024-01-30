class Solution 
{ 
     int LCSof3(String A, String B, String C, int n1, int n2, int n3) 
    { 
        char a[]=A.toCharArray();
        char b[]=B.toCharArray();
        char c[]=C.toCharArray();
        int dp[][][]=new int[n1+1][n2+1][n3+1];
        for(int i=n1-1;i>=0;i--){
            for(int j=n2-1;j>=0;j--){
               for(int k=n3-1;k>=0;k--){
                   if(a[i]==b[j]&&b[j]==c[k]){
                       dp[i][j][k]=1+dp[i+1][j+1][k+1];
                   }else{
                       dp[i][j][k]=Math.max(dp[i+1][j][k],Math.max(dp[i][j+1][k],dp[i][j][k+1]));
                   }
               }
            }
        }
        
        return dp[0][0][0];
    } 
}