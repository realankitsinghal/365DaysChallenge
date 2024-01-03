class Solution {
    public int numberOfBeams(String[] bank) {
    int lb = 0 , p = 0, cnt = 0;
    for(String s: bank) {
        cnt = 0;
        for (int i = 0; i < s.length(); i++) 
            if (s.charAt(i) == '1') cnt++;
        if (cnt > 0) {
            lb += p * cnt;
            p = cnt;
        }
    }
    return lb;
    }
}