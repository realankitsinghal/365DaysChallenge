class Solution {
    public int findPaths(int m, int n, int maxMove, int r, int c) {
    if(r<0 || c<0 || r>=m  || c>=n || maxMove==0) return 0;
    int mod = (int)1e9 + 7;
    long[][][]dp= new long[m][n][maxMove+1];
    for(int move =1 ; move<=maxMove ; move++){
        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){        
                long up = (i-1>=0)? dp[i-1][j][move-1]%mod:1;
                long down = (i+1<m)? dp[i+1][j][move-1]%mod:1;
                long lft = (j-1>=0)? dp[i][j-1][move-1]%mod:1;
                long rt = (j+1<n)? dp[i][j+1][move-1]%mod :1;
                dp[i][j][move]= (up+ down+ lft+ rt)%mod;
            }
        }
    }
    return (int)dp[r][c][maxMove]%mod;
    }
}