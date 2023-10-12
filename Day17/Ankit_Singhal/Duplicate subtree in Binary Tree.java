class Solution {
    static char MARKER = '$'; 
    public static String dupSubUtil(Node root, HashSet<String> subtrees) 
    { 
        String s = ""; 
        if (root == null) 
            return s + MARKER; 
        String lStr = dupSubUtil(root.left,subtrees); 
        if (lStr.equals(s)) 
            return s; 
        String rStr = dupSubUtil(root.right,subtrees); 
        if (rStr.equals(s)) 
            return s; 
        s = s + root.data + "%" + lStr+ "%" + rStr;
        if (s.length() > 7 && subtrees.contains(s)) 
            return ""; 
        subtrees.add(s); 
        return s; 
    } 
    int dupSub(Node root) {
        HashSet<String> subtrees=new HashSet<>(); 
        String res = dupSubUtil(root,subtrees);
        if(res.equals("")){
            return 1;
        }else{
            return 0;
        }
    }
}