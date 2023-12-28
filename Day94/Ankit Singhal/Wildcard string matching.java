class Solution{
    static boolean match(String wild, String pattern){
        int n = wild.length(), m = pattern.length();
        return matchUtil(n, m, wild, pattern);
    }
    static boolean matchUtil(int n, int m, String wild, String pattern){
        if(n==0 && m==0) return true;
        else if(n==0 || m==0) return false;
        if(wild.charAt(n-1) == pattern.charAt(m-1) || wild.charAt(n-1) == '?') return matchUtil(n-1, m-1, wild, pattern);
        else if(wild.charAt(n-1) == '*') return (matchUtil(n-1, m-1, wild, pattern) || matchUtil(n, m-1, wild, pattern));
        else return false;
    }
}