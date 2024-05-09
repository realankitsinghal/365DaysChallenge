class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long result = 0;
        int n = happiness.length, decrement = 0;
        while (k > 0 && happiness[n - 1 - decrement] - decrement > 0) {
            result += happiness[n - 1 - decrement] - decrement;
            k--;
            decrement++;
        }
        return result;
    }
}