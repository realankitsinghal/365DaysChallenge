class Solution {
    public int matrixScore(int[][] grid) {
        int result = 0, m = grid.length, n = grid[0].length;
        for (int i = 0; i < m; i++){
            boolean flip = (grid[i][0] == 0);
            int curr = 0;
            for (int j = 0; j < n; j++){
                grid[i][j] = (flip) ? (grid[i][j] == 1) ? 0 : 1 : grid[i][j];
                curr = curr * 2 + grid[i][j];
            }
            result += curr;
        }
        for (int i = 1; i < n; i++){
            int count = 0;
            for (int j = 0; j < m; j++){
                count += (grid[j][i] == 1) ? 0 : 1;
            }
            if (count > m / 2) result += Math.pow(2, n-i-1) * (count - m + count);
        }
        return result;
    }
}