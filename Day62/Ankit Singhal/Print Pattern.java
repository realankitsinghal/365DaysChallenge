class Solution{
    
    public static int SN(int n, List<Integer> ans){
        ans.add(n);
        if(n<=0)    return n;
        return SN(n-5, ans);
    }
    public static int NS(int n, int e, List<Integer> ans){
        ans.add(n);
        if(n>=e)    return n;
        return NS(n+5, e, ans);
    }
    public List<Integer> pattern(int N){
        // code here
        if(N<=0)    return Arrays.asList(N);
        List<Integer> ans = new ArrayList<>();
        int e = N;
        N = SN(N, ans);
        NS(N + 5, e, ans);
        return ans;
    }
}