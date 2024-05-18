class Solution {
    public int findPeakElement(List<Integer> a) {
        // Code here
        int l = 0;
        int h = a.size() - 1;
        while(l < h)
        {
            int mid = l + (h - l)/2;
            if(a.get(mid) < a.get(mid + 1))
            {
                l = mid + 1 ;
            }
            else
            {
                h = mid;
            }
        }
        return a.get(l);
    }
}