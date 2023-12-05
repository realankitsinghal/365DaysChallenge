class Solution {
    int getMinDiff(int[] a, int n, int k) {
        Arrays.sort(a);
        int max=0, min=0;
        int ans = a[n-1]-a[0];
        int lar = a[n-1]-k, sml = a[0]+k;
        
        for(int i=0;i<n-1;i++){
            min = Math.min(sml, a[i+1] - k);
            max = Math.max(lar, a[i] + k);
            if(min<0) continue;
            ans = Math.min(ans, max-min);
        }
        return ans;
    }
}