import java.util.Arrays;

public class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int Csum = 0, Psum = 0;

        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] < Csum) {
                Psum = Csum + nums[i];
            }
            Csum += nums[i]; }

        return (Psum == 0) ? -1 : Psum;
    }
}