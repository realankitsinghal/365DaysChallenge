class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long count = 0;
        int min = -1, max = -1, j = 0, i = 0;
        for (; j < nums.length; j++) {
            if (nums[j] < minK || nums[j] > maxK) {
                min = -1;
                max = -1;
                i = j + 1;
                continue;
            }
            if (nums[j] == minK) min = j;
            if (nums[j] == maxK) max = j;
            if (max >= 0 && min >= 0) count += Math.min(max, min) - i + 1;
        }
        return count;
    }
}