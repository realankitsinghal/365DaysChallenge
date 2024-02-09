class Solution {
    public static int isSumProperty(Node root) {
        return sumCheck(root) ? 1 : 0;
    }
    private static boolean sumCheck(Node root) {
        if (root == null)
            return true;
        if (root.left == null && root.right == null)
            return true;
        int leftSum = root.left != null ? root.left.data : 0;
        int rightSum = root.right != null ? root.right.data : 0;
        if (root.data != leftSum + rightSum)
            return false;
        return sumCheck(root.left) && sumCheck(root.right);
    }
}