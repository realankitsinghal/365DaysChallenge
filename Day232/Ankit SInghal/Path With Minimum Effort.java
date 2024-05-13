class Solution {
    public static int MinimumEffort(int rows, int columns, int[][] heights) {
        int dist[][] = new int[rows][columns];
        for (int arr[] : dist) Arrays.fill (arr , (int)(1e9));
        dist[0][0] = 0;
        PriorityQueue<Tuple> pq = new PriorityQueue<>(new Comparator<Tuple>() {
            @Override
            public int compare (Tuple t1 , Tuple t2) {
                return t1.diff - t2.diff;
            }
        });
        pq.add (new Tuple (0 , 0 , 0));
        while (!pq.isEmpty ()) {
            Tuple tp = pq.poll ();
            int diff = tp.diff;
            int r = tp.r;
            int c = tp.c;
            if (r == rows-1 && c == columns-1) return diff;
            int rowDirect[] = {-1 , 0 , 1 , 0};
            int colDirect[] = {0 , 1 , 0 , -1};
            for (int i = 0 ; i < 4 ; i++) {
                int nrow = r + rowDirect[i];
                int ncol = c + colDirect[i];
                if ((nrow >= 0 && nrow < rows) && (ncol >= 0 && ncol < columns)) {
                    int nDiff = Math.abs (heights[nrow][ncol] - heights[r][c]);
                    int effort = Math.max (nDiff , diff);
                    if (effort < dist[nrow][ncol]) {
                        pq.add (new Tuple (effort , nrow , ncol));
                        dist[nrow][ncol] = effort;
                    }
                }
            }
        }
        return 0;
    }
}
class Tuple {
    int diff;
    int r;
    int c;
    public Tuple (int diff , int r , int c) {
        this.diff = diff;
        this.r = r;
        this.c = c;
    }
}