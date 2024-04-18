class Solution {
    public int timeRequiredToBuy(int[] t, int k) {
        int t1=0;
        for(int i=0;i<t.length;i++){
            if(t[i]<t[k]) t1+=t[i];
            else t1+=t[k];

            if(i>k && t[i] >=t[k]) t1--;

        }
        return t1;
    }
}