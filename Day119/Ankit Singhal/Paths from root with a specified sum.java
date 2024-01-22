class Solution{
     static void Help(Node root, int sum, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> cur, int curSum) {
        if (root == null) return;
        curSum += root.data;
        cur.add(root.data);
        if (curSum == sum) {
            res.add(new ArrayList<>(cur));
        }
        Help(root.left, sum, res, cur, curSum);
        Help(root.right, sum, res, cur, curSum);
        cur.remove(cur.size() - 1);
    }
    public static ArrayList<ArrayList<Integer>> printPaths(Node root, int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> cur = new ArrayList<>();
        Help(root, sum, res, cur, 0);
        return res;
    }
}