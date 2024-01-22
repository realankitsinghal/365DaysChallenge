class Solution{
    public int[] findErrorNums(int[] nums) {
        int n = nums.length, duplicate = 0;
        Set<Integer> set = new HashSet<>();
        long sum = (n * (n+1)) / 2;
        for(int i : nums) {
            if(set.contains(i)) duplicate = i;
            sum -= i;
            set.add(i);
        }
        return new int[] {duplicate, (int)sum + duplicate};
    }
}