class Solution {
    public String tree2str(TreeNode root) {
        if (root == null) return "";
        
        String result = root.val + "";
        
        String left = tree2str(root.left);
        String right = tree2str(root.right);
        
        if (left == "" && right == "") return result;
        if (left == "") return result + "()" + "(" + right + ")";
        if (right == "") return result + "(" + left + ")";
        return result + "(" + left + ")" + "(" + right + ")";
    }
}

    var tree2str = function(t) {
        let res = [];
        dfs(t, res);
        return res.join('');

        function dfs(t, res) {
        if (t === null)
        return;

        res.push(t.val);

        if (t.left === null && t.right === null)
        return;

        res.push('(');
        dfs(t.left, res);
        res.push(')');

        if (t.right !== null) {
        res.push('(');
        dfs(t.right, res);
        res.push(')');
        }
        }
        };