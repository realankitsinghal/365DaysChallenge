class Tree{
    public boolean isBalanced(Node root) {
        if (root == null) {
            return true;  // An empty tree is balanced.
        }

        // Calculate the height of the left and right subtrees.
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        // Check if the subtree rooted at the current node is balanced and
        // the height difference between left and right subtrees is not more than one.
        if (Math.abs(leftHeight - rightHeight) <= 1 && isBalanced(root.left) && isBalanced(root.right)) {
            return true;
        }

        return false;
    }

    private int getHeight(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(getHeight(node.left), getHeight(node.right));
    }
}
