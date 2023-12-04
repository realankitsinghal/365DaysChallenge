class Solution {
    
    public static String addString(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        StringBuilder output = new StringBuilder();

        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;
            if (i >= 0) {
                sum += num1.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += num2.charAt(j) - '0';
                j--;
            }
            int rem = sum % 10;
            carry = sum / 10;
            output.append(rem);
        }

        return output.reverse().toString();
    }

    public static boolean check(String str, int start, int len1, int len2, int n) {
        if (start + len1 + len2 > n) {
            return false;
        }

        String s1 = str.substring(start, start + len1);
        String s2 = str.substring(start + len1, start + len1 + len2);
        String s3 = addString(s1, s2);

        if (start + len1 + len2 + s3.length() > n) {
            return false;
        }

        if (s3.equals(str.substring(start + len1 + len2, start + len1 + len2 + s3.length()))) {
            if (start + len1 + len2 + s3.length() == n) {
                return true;
            }
            return check(str, start + len1, len2, s3.length(), n);
        }
        return false;
    }

    public static int isSumString(String S) {
        int n = S.length();
        for (int i = 1; i < n; i++) {
            for (int j = 1; i + j < n; j++) {
                if (check(S, 0, i, j, n)) {
                    return 1;
                }
            }
        }
        return 0;
    }
}