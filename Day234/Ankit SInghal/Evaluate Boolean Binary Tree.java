class Solution {
    public boolean evaluateTree(TreeNode root) {
        if (root.val == 0 || root.val == 1) {
            return root.val == 1;
        }
        boolean left = evaluateTree(root.left);
        boolean right = evaluateTree(root.right);
        if (root.val == 2) {
            return left || right;
        } else if (root.val == 3) {
            return left && right;
        }
        return false;
    }
}