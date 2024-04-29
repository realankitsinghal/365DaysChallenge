class Solution {
    public int minOperations(int[] nums, int k) {
        int a=nums[0];

        for(int i=1;i<nums.length;i++){
            a^=nums[i];
        }

        int r=0;
        while(a!=0 || k!=0){
            int b1= a&1;
            int b2= k&1;

            if(b1!=b2) r++;
            a=a>>1;
            k=k>>1;
        }

        return r;

    }
}