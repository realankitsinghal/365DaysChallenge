/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;

        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        int sum=0;

        while(!q.isEmpty()){
            int n=q.size();

            for(int i=0;i<n;i++){
                TreeNode t=q.poll();
                if (t.left != null && t.left.left == null && t.left.right == null) {
                    sum += t.left.val; // Add its value to sum
                }
                if(t.left!=null) q.offer(t.left);
                if(t.right!=null) q.offer(t.right);
            }
        }

        return sum;
    }
}