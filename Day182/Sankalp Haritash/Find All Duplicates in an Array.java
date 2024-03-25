class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> a=new ArrayList<>();
        HashSet<Integer> x=new HashSet<>();

        for(int y:nums){
            if(x.contains(y))
                a.add(y);
            else
                x.add(y);
        }


        return a;
    }
}