class Solution{
    public static int findClosest(int n, int k, int[] arr) {
            // code here
            int low = 0;
            int high = n-1;
            int mid = 0;
            int min = Integer.MAX_VALUE;
            int res = -1;
            while(low<=high){
                mid = (low+high)/2;
                int diff = Math.abs(arr[mid]-k);
                if(diff <= min){
                    if(diff == min){
                        res=Math.max(res, arr[mid]);
                    }
                    else{
                        res = arr[mid];
                    } 
                    min = diff;
                }
                if(arr[mid]<=k){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
            return res;
    }
}