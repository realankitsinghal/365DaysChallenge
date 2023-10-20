class Solution {
    static int isPossible(int N, int arr[]) {
        int remainder = 0;
        for (int i=0; i<N; i++)
            remainder = (remainder + arr[i]) % 3;
 
        // Return true if remainder is 0.
        if(remainder == 0){
            return 1;
        }else{
            return 0;
        }
    }
}