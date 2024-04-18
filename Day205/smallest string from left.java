class Solution {
    String minString = "";
    public String smallestFromLeaf(TreeNode root) {
        traverse(root,"");
        return minString;
    }
    private void traverse(TreeNode root, String current)
    {
        if(root == null)
            return;

        current = "" + (char)(root.val + 'a') + current;

        if(root.left == null && root.right == null)
        {
            if(minString.compareTo("") == 0)
                minString = current;
            else
                minString = current.compareTo(minString) < 0 ? current : minString;
        }
        traverse(root.left,current);
        traverse(root.right,current);

    }
}