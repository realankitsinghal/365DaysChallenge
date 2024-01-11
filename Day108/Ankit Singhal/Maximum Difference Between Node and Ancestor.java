class Solution {
    public int maxAncestorDiff(TreeNode root) {
        return dfs(root, root.val, root.val);
    }

    public int dfs(TreeNode root, int mxn, int mxv) {
        if (root == null) return mxv - mxn;
        mxv = Math.max(mxv, root.val);
        mxn = Math.min(mxn, root.val);
        return Math.max(dfs(root.left, mxn, mxv), dfs(root.right, mxn, mxv));
    }
}