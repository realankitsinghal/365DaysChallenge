class Solution{
    int printKDistantfromLeaf(Node root, int k) {
        int result = 0;
        result = countKDist(root, k, new int[1000], new boolean[1000], 0);
        return result;
    }
    int countKDist(Node root, int k, int[] path, boolean[] vis, int len) {
        if (root == null)
            return 0;
        path[len] = root.data;
        vis[len] = false;
        len++;
        if (root.left == null && root.right == null && len - k - 1 >= 0 && !vis[len - k - 1]) {
            vis[len - k - 1] = true;
            return 1;
        }
        int lt = countKDist(root.left, k, path, vis, len);
        int rt = countKDist(root.right, k, path, vis, len);
        return lt + rt;
    }
}
