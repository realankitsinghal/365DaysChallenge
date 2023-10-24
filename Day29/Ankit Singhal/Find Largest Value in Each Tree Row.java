class Solution {
    public List<Integer> largestValues(TreeNode root) {
        if(root==null){
            return new ArrayList<Integer>();
        }
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        List<Integer> ans = new ArrayList<Integer>();
        while(!q.isEmpty()){
            int siz = q.size();
            int maxv = Integer.MIN_VALUE;
            for(int i=0; i<siz; i++){
                TreeNode curr = q.poll();
                maxv = Math.max(maxv, curr.val);
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            ans.add(maxv);
        }
        return ans;
    }
}