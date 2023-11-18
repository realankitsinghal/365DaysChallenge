class Solution {
    public int maxFrequency(int[] nums, int k) {
        //Step-1: Sorting->
        Arrays.sort(nums);
        //Step-2: Two-Pointers->
        int L=0,R=0;
        long totalSum=0;
        int res=1;
        //Iterating over the array:
        while(R<nums.length)
        {
            totalSum+=nums[R];
            while(! ((totalSum+k) >= ((R-L+1)*nums[R])) )
            {
                totalSum-=nums[L];
                L++;
            }
            res=Math.max(res,(R-L+1));
            R++;
        }
        return res;
    }
}