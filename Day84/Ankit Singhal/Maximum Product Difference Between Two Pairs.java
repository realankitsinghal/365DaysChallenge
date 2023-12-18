class Solution {
    public int maxProductDifference(int[] nums) {
        int p1 = Integer.MIN_VALUE, p2=Integer.MIN_VALUE, p3 = Integer.MAX_VALUE, p4 = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
             if(nums[i]>p1){
                p2=p1;
                p1=nums[i];
            }
            else if(nums[i]>p2){
                p2= nums[i];
            }
            if(nums[i]<p3){
                p4=p3;
                p3=nums[i];
            }
            else if(nums[i]<p4){
                p4=nums[i];
            }
        }
        int res = (p1*p2) - (p3*p4);
        return res;
    }
}