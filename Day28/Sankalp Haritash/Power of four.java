class Solution {
    public boolean isPowerOfFour(int n) {
        return (n & (n - 1)) == 0 && n % 3 == 1;
    }

    public static void main(String arg[])
    {
        System.out.println(isPowerOdFour(16));
    }
}