class Solution {
    public int maximumSafenessFactor(List<List<Integer>> grid) {
        int n = grid.size();
        int m = grid.get(0).size();
        if(grid.get(0).get(0) == 1 || grid.get(n-1).get(m-1) == 1)
            return 0;
        Queue<int[]> q = new LinkedList<>();
        int [][] mat = new int [n][m];
        for(int i = 0;i < n;i++){
            for(int j = 0; j < m;j++){
                if(grid.get(i).get(j) == 1){
                    q.add(new int[]{i,j});
                    mat[i][j] = 1;
                }
            }
        }
        int []idx = {0,1,0,-1};
        int []idy = {1,0,-1,0};
        int count =1;
        int nx = 0;
        int ny = 0;
        while(!q.isEmpty()){
            int s = q.size();
            count++;
            for(int i = 0;i < s; i++){
                int[] p = q.poll();
                nx = 0;
                ny = 0;
                for(int j = 0;j<4;j++){
                    nx = idx[j] + p[0];
                    ny = idy[j] + p[1];
                    if(nx >= 0 && nx < n && ny >= 0 && ny < m && mat[nx][ny] == 0){
                        mat[nx][ny] = count;
                        q.add(new int[]{nx,ny});
                    }
                }
            }
        }
        
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a, b) -> b[2] - a[2]);
        if(mat[0][0] != 1) pq.add(new int[]{0,0,mat[0][0] - 1});
        int res = Integer.MAX_VALUE;
        boolean f = false;
        while(!pq.isEmpty()){
            int[] p = pq.poll();
            nx = 0;
            ny = 0;
            if(res > p[2]) res = p[2];
            if(p[0] == n-1 && p[1] == m-1) return res;
            for(int j = 0;j < 4;j++){
                nx = idx[j] + p[0];
                ny = idy[j] + p[1];
                if(nx >= 0 && nx < n && ny >= 0 && ny < m && mat[nx][ny] != 1) {
                    pq.add(new int[]{nx,ny,mat[nx][ny]-1});
                    mat[nx][ny] = 1;
                }
            }
        }
        if(f == false) return 0;
        if(res == Integer.MAX_VALUE) return 0;
        return res;
    }
}