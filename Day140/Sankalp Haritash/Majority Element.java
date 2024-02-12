class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> a=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            a.put(nums[i], a.getOrDefault(nums[i], 0) + 1);
        }
        int max=nums.length/2;
        for (Map.Entry<Integer, Integer> entry : a.entrySet()) {
            if (entry.getValue() > max) {
                return entry.getKey();
            }
        }

        return 0;
    }
}