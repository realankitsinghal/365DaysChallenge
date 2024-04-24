class Solution {
    public int tribonacci(int n) {
        if(n<2) return n;
        int[] x=new int[n+1];
        x[0]=0;
        x[1]=1;
        x[2]=1;
        for(int i=3;i<=n;i++){
            x[i]=x[i-1]+x[i-2]+x[i-3];
        }

        return x[n];
    }
}