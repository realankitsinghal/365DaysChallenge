class Solution {
    public int numSubmatrixSumTarget(int[][] mx, int t) {
        int res = 0, m = mx.length, n = mx[0].length;
        for (int i = 0;i < m; i++)
            for (int j = 1; j < n; j++)
                mx[i][j] += mx[i][j - 1];
        for (int l = 0; l < n; l++) {
            for (int r = l; r < n; r++) {
                Map<Integer, Integer> map = new HashMap<>();
                map.put(0, 1);
                for (int i = 0, sum = 0; i < m; i++) {
                    sum += (mx[i][r] - (l == 0 ? 0 : mx[i][l - 1]));
                    res += map.getOrDefault(sum - t, 0);
                    map.put(sum, map.getOrDefault(sum, 0) + 1);
                }
            }
        }
        return res;
    }
}