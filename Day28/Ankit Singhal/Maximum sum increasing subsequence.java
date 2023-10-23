class Solution
{
	public int maxSumIS(int arr[], int n)  
	{  
	    //code here.
	    int[] ans = new int [n];
	    int totalSum = 0;
	    for(int i=0; i<n; i++){
	        ans[i] = arr[i];
	    }
	    for(int i=1; i<n; i++){
	        for(int j=0; j<i; j++){
	            if(arr[i] > arr[j] && ans[i] < ans[j] + arr[i]){
	                ans[i] = ans[j] + arr[i]; 
	            }
	        }
	    }
	    for (int i = 0; i < n; i++){
            if (totalSum < ans[i]){
                totalSum = ans[i]; 
            }
	    }
        return totalSum; 
	} 
}