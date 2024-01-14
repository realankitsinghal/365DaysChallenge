class Solution {
    public boolean closeStrings(String word1, String word2) {
        int[] a = new int[26];
        int[] b = new int[26];
        for(char ch : word1.toCharArray())  a[ch-'a']++;
        for(char ch : word2.toCharArray()){
            if(a[ch-'a'] == 0) return false;
            b[ch-'a']++;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i = 25; i>=0; i--)
            if(a[i] != b[i]) return false;
        return true;
    }
}