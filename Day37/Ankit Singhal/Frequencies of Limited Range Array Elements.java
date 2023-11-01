class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int n, int p){
        p++;
        for(int i=0; i<n; i++){
            int idx = arr[i]%p-1;
            if(idx>=0 && idx<n)
            arr[idx] += p;
        }
        for(int i=0; i<n; i++){
            arr[i]/=p;
        }
    }
}