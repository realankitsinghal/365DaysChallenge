class Solution{
    static int findWinner(int n, int A[]){
        int ans = 0;
        for (int num : A) {
            ans ^= num;
        }
        if (ans == 0 || n % 2 == 0) {
            return 1;
        } else {
            return 2;
        }
    }
}