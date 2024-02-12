class Solution{
    static long mod = (long)1e9+7;
    static long sequence(int n){
        // code here
        long cnt = 1;
        long ans = 0;
        for(long i = 1; i<= n ;i++ ){
            long val = 1;
            for(long j = cnt ; j<cnt+i ;j++ ){
                val *= j;
                val = val%mod;
            }
            cnt+= i;
            ans+= val;
            ans = ans%mod;
        }
        return ans;
    }
}