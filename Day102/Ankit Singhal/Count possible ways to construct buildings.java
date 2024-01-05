class Solution
{
    public int TotalWays(int N)
    {
        int MOD = 1000000007;
        long num1 = 2, num2 = 3;
        if(N==1) return 4;
        if(N==2) return 9;
        for(int i=3; i<=N; i++){
            long next = (num1+num2)%MOD;
            num1 = num2;
            num2 = next;
        }
        return (int)(num2*num2%MOD);
    }
}