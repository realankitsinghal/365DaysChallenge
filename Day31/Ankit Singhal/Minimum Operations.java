class Solution
{
    public int minOperation(int n)
    {
        //code here.
        int count = 0;
        while(n>0){
            if(n%2==0){
                n/=2;
                count++;
            }else{
                n--;
                count++;
            }
        }
        return count;
    }
}