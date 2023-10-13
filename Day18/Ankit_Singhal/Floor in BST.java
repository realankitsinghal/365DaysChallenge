class Solution {
    public static int floor(Node root, int key) {
        if (root == null)
            return -1; 
        if (root.data == key)
            return root.data;
        if (root.data > key)
            return floor(root.left, key);
        int floorValue = floor(root.right, key);
        if (floorValue == -1)
            return root.data;
        return floorValue; 
    }
}