class Solution
{
    int columnWithMaxZeros(int arr[][], int N)
    {
        // code here 
        int final_idx =-1, final_zero = 0, cnurr_zero = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(arr[j][i] == 0){
                    curr_zero++;
                }
            }
            if(final_zero < curr_zero){
                final_zero = curr_zero;
                final_idx = i;
            }
            curr_zero = 0;
        }
        return final_idx;
    }
}