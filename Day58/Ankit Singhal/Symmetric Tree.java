class GfG
{
    
    private static boolean mirror(Node l, Node r) {
        if(l==null ^ r==null) {
            return false;
        } else {
            if(l==null) {
                return true;
            } else {
                if(l.data == r.data) {
                    return mirror(l.left, r.right) && mirror(l.right, r.left);
                } else {
                    return false;
                }
            }
        }
    }
    
    // return true/false denoting whether the tree is Symmetric or not
    public static boolean isSymmetric(Node root)
    {
        if(root==null) {
            return true;
        }
        return mirror(root.left, root.right);
    }
}