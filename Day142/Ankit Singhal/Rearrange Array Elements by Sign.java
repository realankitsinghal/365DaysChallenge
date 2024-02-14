class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int p=0, n=1;
        
        for(int i=0; i<n; i++){
            if(nums[i]>0){
                res[p]=nums[i];
                p+=2;
            }
            else{
                res[n]=nums[i];
                n+=2;
            }
        }    
        return res;
    }
}