class Solution {
    public int minimumLength(String s) {
        int st = 0;
        int e = s.length() - 1;

        while (st < e && s.charAt(st) == s.charAt(e)) {
            char c = s.charAt(st);
            while (st <= e && s.charAt(st) == c) {
                st++;
            }
            while (st <= e && s.charAt(e) == c) {
                e--;
            }
        }

        return e - st + 1;
    }
}