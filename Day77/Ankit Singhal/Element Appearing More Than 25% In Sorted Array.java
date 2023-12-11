class Solution {
    public int findSpecialInteger(int[] arr) {
        int ws = arr.length/4+1;
        int l = 0, r = ws-1;
        while(r<arr.length) {
            if(arr[l] == arr[r])
                return arr[l];
            l++;
            r++;
        }
        return 0;
    }
}