class Solution {
    static int singleElement(int[] arr , int n) {
        int result = 0;
        int x, sum;
        for (int i = 0; i < 32; i++) {
            sum = 0;
            x = (1 << i);
            for (int j = 0; j < n; j++) {
                if ((arr[j] & x) != 0)
                    sum++;
            }
            if ((sum % 3) != 0)
                result |= x;
        }
        return result;
    }
}