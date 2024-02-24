class Solution
{
    public int maxSum(int n) 
    { 
        //code here.
        int a, res=0;
        if(n==0 || n==1){
            return n;
        }
        a=Math.max(n,maxSum(n/2)+maxSum(n/3)+maxSum(n/4));
        return a;
    } 
}