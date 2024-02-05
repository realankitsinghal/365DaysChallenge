class Solution {
     public int firstUniqChar(String s) {
        int ans = Integer.MAX_VALUE;
        for(char ch='a'; ch<='z';ch++){
            int i = s.indexOf(ch);
            if(i!=-1&&i==s.lastIndexOf(ch)){
                ans = Math.min(ans,i);
            }
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }   
}