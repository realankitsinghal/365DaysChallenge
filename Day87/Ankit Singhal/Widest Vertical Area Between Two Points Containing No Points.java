class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int n = points.length;
        int[] xC = new int[n];
        for (int i = 0; i < n; i++) {
            xC[i] = points[i][0];
        }
        Arrays.sort(xC);
        int mG = 0;
        for (int i = 1; i < n; i++) {
            int g = xC[i] - xC[i - 1];
            if (g > mG) {
                mG = g;
            }
        }
        return mG;
    }
}