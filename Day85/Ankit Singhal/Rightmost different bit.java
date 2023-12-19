class Solution{
    public static int posOfRightMostDiffBit(int m, int n){
        int cnt=0;
        while(n>0 || m>0){
            int d1 = n%2;
            int d2 = m%2;
            cnt++;
            if(d1!=d2) return cnt;
            n=n/2;
            m=m/2;
        }
        return -1;
    }
}