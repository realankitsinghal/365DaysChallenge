public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

class Solution {
    int ans=0;
    public int sumNumbers(TreeNode root) {
        if(root==null) return 0;
        SumL(root,0);
        return ans;
    }

    public void SumL(TreeNode r,int val){
        if(r == null) return ;

        val*=10;
        val+=r.val;

        if(r.left==null && r.right==null){
            ans+=val;
        }

        SumL(r.left,val);
        SumL(r.right,val);
    }
}