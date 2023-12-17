class Solution {
    int findMaxSum(int arr[], int n) {
        int preMax = 0;
        int ans = 0;
        int current = 0;
        for (int i = 0; i < n; i++) {
            current = preMax + arr[i];
            preMax = ans;
            ans = Math.max(current, ans);
        }
        return ans;
    }
}