class GfG {
    void storeBSTNodes(Node root, Vector<Node> nodes) {
        if (root == null)
            return;
        storeBSTNodes(root.left, nodes);
        nodes.add(root);
        storeBSTNodes(root.right, nodes);
    }
    Node buildTreeUtil(Vector<Node> nodes, int start, int end) {
        if (start > end)
            return null;
        int mid = (start + end) / 2;
        Node node = nodes.get(mid);
        node.left = buildTreeUtil(nodes, start, mid - 1);
        node.right = buildTreeUtil(nodes, mid + 1, end);
        return node;
    }
    Node buildBalancedTree(Node root){
        Vector<Node> nodes = new Vector<Node>();
        storeBSTNodes(root, nodes);
        int n = nodes.size();
        return buildTreeUtil(nodes, 0, n - 1);
    }
}
