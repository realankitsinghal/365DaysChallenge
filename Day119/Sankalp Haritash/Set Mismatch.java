class Solution {
    public int[] findErrorNums(int[] nums) {
        int i=0;
        while(i<nums.length)
        {
            int in=nums[i]-1;
            if(nums[i]!=nums[in])
            {
                int t=nums[i];
                nums[i]=nums[in];
                nums[in]=t;
            }
            else
                i++;
        }

        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]!=j+1)
                return new int[] {nums[j],j+1};
        }

        return new int[] {-1,-1};
    }
}