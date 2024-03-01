class Solution {
    public String maximumOddBinaryNumber(String s) {
        int n = s.length();
        int cnt1 = 0;
        for (int i = 0; i < n; i++) if (s.charAt(i) == '1') cnt1++;
        StringBuilder res = new StringBuilder();
        res.append("0".repeat(n));
        res.setCharAt(n - 1, '1');
        for (int i = 0; i < cnt1 - 1; i++)  res.setCharAt(i, '1');
        return res.toString();
    }
}