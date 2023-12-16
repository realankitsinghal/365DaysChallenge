class Solution 
{ 
     static long countStr(long n)
    {
        // code here
       return (n==1?3:(n==2?8:((n*n*n+3*n+2)/2)));
    }
} 