class GfG {
    public static int ans;
    public static int _findDistance(Node root, int n1, int n2){
        if (root == null) return 0;
        int left = _findDistance(root.left, n1, n2);
        int right = _findDistance(root.right, n1, n2);
        if (root.data == n1 || root.data == n2){
            if (left != 0 || right != 0){
                ans = Math.max(left, right);
                return 0;
            }
            else    return 1;
        }
        else if (left != 0 && right != 0){
            ans = left + right;
            return 0;
        }
        else if (left != 0 || right != 0)
            return Math.max(left, right) + 1;
        return 0;
    }
    int findDist(Node root, int a, int b) {
        // Your code here
        ans = 0;
        _findDistance(root, a, b);
        return ans;
    }
}