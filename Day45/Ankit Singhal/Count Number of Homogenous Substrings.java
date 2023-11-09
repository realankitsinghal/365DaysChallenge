class Solution {
    public static int mod = 1_000_000_007;

    public int countHomogenous(String s) {
        int curr = 0, cnt = 0, res=0;
        for(int i=0; i<s.length(); i++){
                cnt = s.charAt(i) == curr ? cnt + 1: 1;
                curr = s.charAt(i);
                res = (res+cnt)%mod;
        }
        return res;
    }
}