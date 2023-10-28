class Solution
{
    static int countSetBits(int x)
    {
        int count = 0;
        while (x != 0) {
            x &= (x - 1);
            count++;
        }
        return count;
    }
    static int ceilLog2(int x)
    {
        int count = 0;
        x--;
        while (x > 0) {
            x = x >> 1;
            count++;
        }
        return count;
    }
     public int is_bleak(int n){
        for (int x = n - ceilLog2(n); x < n; x++)
            if (x + countSetBits(x) == n)
                return 0;
        return 1;
    }
}