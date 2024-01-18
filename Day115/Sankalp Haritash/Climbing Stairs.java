class Solution {
    public int climbStairs(int n) {
        // if(n<=2)
        // return n;

        // return climbStairs(n-1)+climbStairs(n-2);

        int[] f=new int[n+1];
        f[0]=1;
        f[1]=1;
        int i;
        for( i=2;i<=n;i++)
        {
            f[i]=f[i-1]+f[i-2];
        }
        return f[n];
    }
}