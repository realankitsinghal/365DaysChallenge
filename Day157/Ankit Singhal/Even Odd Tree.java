class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean odd = false;
        while(!q.isEmpty()){
            int size = q.size();
            int prev = -1;
            for(int i=0; i<size; i++){
               TreeNode next = q.poll();
               if(odd){
                   if(next.val%2!=0 || (prev!=-1 && next.val>=prev))return false;
               }else{
                   if(next.val%2==0 || (prev!=-1 && next.val<=prev))return false;
               }
               if(next.left!=null)q.offer(next.left);
               if(next.right!=null)q.offer(next.right); 
               prev = next.val;  
            }
            odd = !odd;
        }
        return true;
    }
}