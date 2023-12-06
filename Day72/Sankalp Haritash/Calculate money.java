class Solution {
    public int totalMoney(int n) {
        int ans=0, i=0, j=7;
        while(n>7){
            n=n-7;
            ans+=((j*(j+1))/2)+i*j;
            i++;
        }
        ans+=((n*(n+1))/2)+i*n;
        return ans;
    }
}