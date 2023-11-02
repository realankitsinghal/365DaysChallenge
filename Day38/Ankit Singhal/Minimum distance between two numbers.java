class Solution {
    int minDist(int arr[], int n, int x, int y) {
        int c = -1, d = -1, m = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                c = i;
            }else if (arr[i] == y) {
                d = i;
            }
            if (c != -1 && d != -1){
                m = Math.min(m, Math.abs(c - d));
            }
        }
        if (c == -1 || d == -1)
            return -1;
        else
            return m;
    }
}