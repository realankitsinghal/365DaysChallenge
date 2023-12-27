class Solution
{
    public static int[] antiDiagonalPattern(int[][] matrix) {
        int n = matrix.length;
        List<Integer> ansList = new ArrayList<>();
        List<List<Integer>> a = new ArrayList<>(2 * n - 1);

        for (int i = 0; i < 2 * n - 1; i++) {
            a.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a.get(i + j).add(matrix[i][j]);
            }
        }

        for (List<Integer> list : a) {
            ansList.addAll(list);
        }

        int[] ansArray = new int[ansList.size()];
        for (int i = 0; i < ansList.size(); i++) {
            ansArray[i] = ansList.get(i);
        }

        return ansArray;
    }

}