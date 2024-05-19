class Solution {
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
        long bestSum = 0;
        int cnt = 0;
        for (int num : nums) {
            bestSum += Math.max(num, num ^ k);
            if ((num ^ k) > num) {
                cnt++;
            }
        }
        if (cnt % 2 != 0) {
            int minDifference = Integer.MAX_VALUE;
            for (int num : nums) {
                minDifference = Math.min(minDifference, Math.abs(num - (num ^ k)));
            }
            bestSum -= minDifference;
        }
        
        return bestSum;
    }
}