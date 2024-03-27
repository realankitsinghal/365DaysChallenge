class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;
        int prod = 1, count = 0, windowStart = 0;
        for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            prod *= nums[windowEnd];
            while (prod >= k) {
                prod = prod / nums[windowStart];
                windowStart++;
            }
            count = count + windowEnd - windowStart + 1;
        }
        return count;
    }
}