class Solution {
    public String removeKdigits(String S, int K) {
        StringBuilder sb = new StringBuilder(S);
        int i = 0;

        while (K > 0 && i < sb.length() - 1) {
            if (sb.charAt(i) > sb.charAt(i + 1)) {
                sb.deleteCharAt(i);
                K--;
                if (i > 0) {
                    i--;
                }
            } else {
                i++;
            }
        }
        while (K > 0 && sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
            K--;
        }
        int start = 0;
        while (start < sb.length() && sb.charAt(start) == '0') {
            start++;
        }

        return start == sb.length() ? "0" : sb.substring(start);
    }
}