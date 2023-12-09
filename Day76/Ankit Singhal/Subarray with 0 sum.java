class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        for(int i=0; i<n;i++){
            int temp=i+1;
            int sum = arr[i];
            while(sum!=0 && temp<n){
                sum+=arr[temp];
                temp++;
            }
            if (sum ==0){
                return true;
            }
        }
        return false;
    }
}