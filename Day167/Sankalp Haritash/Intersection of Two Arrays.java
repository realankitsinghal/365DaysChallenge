class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>x=new HashSet<>();
        ArrayList<Integer> a=new ArrayList<>();

        for(int i=0;i<nums1.length;i++){
            x.add(nums1[i]);
        }

        for (int num : nums2) {
            if (x.contains(num)) {
                a.add(num);
                x.remove(num);
            }
        }

        int[] result = new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            result[i] = a.get(i);
        }
        return result;
    }
}