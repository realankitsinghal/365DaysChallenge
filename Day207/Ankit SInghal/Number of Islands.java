class Solution {
  private static final int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
  public int numIslands(char[][] grid) {
    int ans = 0;
    for (int i = 0; i < grid.length; i++)
      for (int j = 0; j < grid[0].length; j++)
        if (grid[i][j] == '1') {
          dfs(grid, i, j);
          ans++;
        }
    return ans;
  }
  private void dfs(char[][] grid, int r, int c) {
    if (r < 0 || r == grid.length || c < 0 || c == grid[0].length || grid[r][c] != '1')
      return;
    grid[r][c] = '2'; 
    for (int[] dir : dirs)
      dfs(grid, r + dir[0], c + dir[1]);
  }
}