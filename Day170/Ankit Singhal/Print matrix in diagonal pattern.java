class Solution {
    public int[] matrixDiagonally(int[][] mat) {
        int n = mat.length;
        int[] res = new int[n * n];
        int row = 0, col = 0;
        for (int i = 0; i < n * n; i++) {
            res[i] = mat[row][col];
            if ((row + col) % 2 == 0) {
                if (col == n - 1)   row++;
                else if (row == 0)  col++;
                else { 
                    row--;
                    col++;
                }
            }
            else {
                if (row == n - 1)   col++;
                else if (col == 0)  row++;
                else { 
                    row++;
                    col--;
                }
            }
        }
        return res;
    }
}