class Solution {
    public int maxDepth(String s) {
        int d=0, openP=0;

        for(char c: s.toCharArray()){
            if(c=='(') openP++;
            if(c==')') openP--;
            d=Math.max(d,openP);
        }


        return d;
    }
}