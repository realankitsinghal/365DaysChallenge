class Solution {
    int transitionPoint(int arr[], int n) {
        // code here
        int s = 0, e = n-1;
        while(s<=e){
            int mid = (s+e)/2;
            if(arr[mid] == 0)
                s = mid+1;
            else if(arr[mid] == 1){ 
                if(mid==0 || (mid > 0 && arr[mid] == 0)) 
                    return mid;
                e = mid-1;
            }
        }
        return -1;
    }
}