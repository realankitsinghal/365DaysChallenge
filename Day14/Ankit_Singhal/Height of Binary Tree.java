class Solution {
    //Function to find the height of a binary tree.
    int height(Node node) 
    {
        // code here 
        if(node==null){
            return 0;
        }
        int leftheight = height(node.left) + 1;
        int rightheight = height(node.right) + 1;
        return Math.max(leftheight, rightheight);
    }
}