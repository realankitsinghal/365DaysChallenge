class Solution
{
    private static boolean helper(String s,HashSet<String> hs){
        if(s==null || s=="" || hs.contains(s))
            return true;
        
        for(int i=1;i<s.length();i++){
            String part1 = s.substring(0,i);
            String part2 = s.substring(i);
            if(hs.contains(part1) && helper(part2,hs))
                return true;
        }
        return false;
    }
    public static int wordBreak(int n, String s, ArrayList<String> dictionary )
    {
        //code here
        HashSet<String> hs = new HashSet<>(dictionary);
        return helper(s,hs)?1:0;
    }
}