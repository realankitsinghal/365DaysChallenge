class Solution {
    public int missingNumber(int[] nums) {
        int i=0;
        int j=nums.length;

        while(i<j){
            int index= nums[i];
            if(nums[i]<nums.length && nums[i]!=nums[index]){
                int t=nums[i];
                nums[i]=nums[index];
                nums[index]=t;
            }
            else
                i++;
        }

        for(int k=0;k<nums.length;k++)
        {
            if(nums[k]!=k)
                return k;
        }
        return nums.length;

    }
}