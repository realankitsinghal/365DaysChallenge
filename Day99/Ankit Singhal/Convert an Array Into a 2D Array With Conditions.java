class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        int cnt[] = new int[n + 1];
        for (int a : nums) {
            if (res.size() <= cnt[a]) res.add(new ArrayList<>());
            res.get(cnt[a]).add(a);
            cnt[a]++;
        }
        return res;
    }
}