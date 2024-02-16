class Solution {
     public Node flattenBST(Node root) {
        Node temp = new Node(0);
        moves(root, temp);
        return temp.right;
    }
    private Node moves(Node node, Node temp) {
        if (node == null)
            return temp;
        Node left = node.left;
        Node right = node.right;
        node.left = node.right = null;
        moves(left, temp).right = node;
        return moves(right, node);
    }
}