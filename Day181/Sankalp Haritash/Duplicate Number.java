class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> x=new HashSet<>();
        for(int y:nums){
            if(x.contains(y)) return y;
            else x.add(y);
        }

        return -1;
    }
}