class Solution {
    public long wonderfulSubstrings(String word) {
        int[] cache = new int[1024];
        long ans = 0L;
        int mask = 0;
        cache[0] = 1;
        for(char ch: word.toCharArray()){
            mask ^= (1 << ch-'a');
            ans += cache[mask];
            cache[mask]++;
            for(int i=0; i<10; i++){
                ans += cache[mask ^ (1 << i)];
            }
        }
        return ans;
    }
}