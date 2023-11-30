class Solution {
    public int minimumOneBitOperations(int n) {
        int sign = 1, res = 0;
        while (n > 0) {
            res += n ^ (n - 1) * sign;
            n &= n - 1;
            sign = -sign;
        }
        return Math.abs(res);
    }
}


//JavaScript

    /**
     * @param {number} n
     * @return {number}
     */
    var minimumOneBitOperations = function(n) {
        if (n <= 1) return n;
        let count = 0;
        while ((1 << count) <= n) count++;
        return ((1 << count) - 1) - minimumOneBitOperations(n - (1 << (count - 1)));
        };