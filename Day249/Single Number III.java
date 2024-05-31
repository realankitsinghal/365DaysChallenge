class Solution {
    public int[] singleNumber(int[] nums) {
        int ans[]=new int[2];
        int xor=0;

        for(int i=0;i<nums.length;i++){
            xor=xor^nums[i];

        }


        int r=xor&(~xor+1);


        for(int i=0;i<nums.length;i++){
            if((nums[i]&r)==r){
                ans[0]=ans[0]^nums[i];
            }
            else{
                ans[1]=ans[1]^nums[i];
            }
        }
        return ans;
    }
}