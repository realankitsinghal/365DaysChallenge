import  java.util.*;
class Solution {
    public int constrainedSubsetSum(int[] nums, int k) {
        Deque<Integer> dq = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            nums[i] += !dq.isEmpty() ? nums[dq.peekFirst()] : 0;

            while (!dq.isEmpty() && (i - dq.peekFirst() >= k || nums[i] >= nums[dq.peekLast()])) {
                if (nums[i] >= nums[dq.peekLast()]) dq.pollLast();
                else dq.pollFirst();
            }

            if (nums[i] > 0) {
                dq.offerLast(i);
            }
        }
        return Arrays.stream(nums).max().getAsInt();
    }
    public static  void main(String arg[]);
    {
        int[] a={10,2,-10,5,10}
        int k=2;
        System.out.println(constrainedSubsetSum(a,k));

    }
}