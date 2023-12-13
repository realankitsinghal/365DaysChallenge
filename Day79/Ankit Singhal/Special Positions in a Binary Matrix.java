class Solution {
        public int numSpecial(int[][] mat) {
        int n = mat.length, m = mat[0].length, res = 0, col[] = new int[m], row[] = new int[n];
        for (int i = 0; i < n; i++) 
            for (int j = 0; j < m; j++) 
                if (mat[i][j] == 1){
                    col[j]++;
                    row[i]++;
                } 
        for (int i = 0; i < n; i++) 
            for (int j = 0; j < m; j++) 
                if (mat[i][j] == 1 && row[i] == 1 && col[j] == 1) res++;
        return res;
    }
}