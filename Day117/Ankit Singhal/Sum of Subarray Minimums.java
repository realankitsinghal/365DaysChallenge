class Solution {
    public int sumSubarrayMins(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        int[] dp = new int[n + 1];
        stack.push(-1);
        int result = 0, M = (int)1e9 + 7, p;
        for (int i = 0; i < n; i++) {
            while (stack.peek() != -1 && arr[i] <= arr[stack.peek()]) {
                stack.pop();
            }
            p = stack.peek();
            dp[i + 1] = (dp[p + 1] + (i - p) * arr[i]) % M;
            stack.push(i);
            result += dp[i + 1];
            result %= M;
        }
        return result;
    }
}