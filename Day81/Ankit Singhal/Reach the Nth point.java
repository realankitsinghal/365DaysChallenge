class Solution
{
    public int nthPoint(int n)
    {
        // Code here
        if(n == 1 || n == 2)return n;
        int a = 1;
        int b = 1;
        int c = 0;
        for(int i = 1; i < n ; i++){
            c = (a+b)% 1000000007;
            a = b;
            b = c;
        }
        return c;
    }
}