class Solution {
    public int rob(int[] num) {
        int pN = 0, pY = 0;
        for (int n : num) {
            int temp = pN;
            pN = Math.max(pN, pY);
            pY = n + temp;
        }
        return Math.max(pN, pY);
    }
}