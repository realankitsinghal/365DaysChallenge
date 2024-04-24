class Solution {
    private Map<Integer, Integer> memo = new HashMap<>();

    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        //check if it already calculated, if so return the value
        } else if (memo.containsKey(n)) {
            return memo.get(n);
        } else {
            int result = tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
            memo.put(n, result);
            return result;
        }
    }
}