class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> s = new Stack<TreeNode>();
        List<Integer> l = new ArrayList<Integer>();
        TreeNode curr = root;
        while(curr!=null || !s.empty()){
            while(curr!=null){
                s.add(curr);
                curr = curr.left;
            }
            curr = s.pop();
            l.add(curr.val);
            curr = curr.right;
        }
        return l;
    }
}