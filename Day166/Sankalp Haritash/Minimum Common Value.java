class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> x=new HashMap<>();

        for(int i=0;i<nums1.length;i++){
            x.put(nums1[i],x.getOrDefault(nums1[i],0)+1);
        }

        for(int i=0;i<nums2.length;i++ ){
            if(x.containsKey(nums2[i]))
                return nums2[i];
        }

        return -1;
    }
}