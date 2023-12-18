class Solution {
    static int gameOfXor(int N , int[] A) {
        int result = 0;
        for (int i = 0; i < N; i++) {
            int leftCount = i + 1;
            int rightCount = N - i;
            int totalCount = leftCount * rightCount;
            if (totalCount % 2 == 1) {
                result ^= A[i];
            }
        }
        return result;
    }
}