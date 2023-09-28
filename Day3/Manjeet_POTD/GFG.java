class Solution {
    public static void convertToWave(int n, int[] a) {
        // code here
        
        if(a.length<2){
            return;
        }
        int firstIndex = 0;
        int secondIndex = 1;
        
       while(secondIndex<=n-1){
            int temp = a[firstIndex];
            a[firstIndex] = a[secondIndex];
            a[secondIndex]= temp;
            
            firstIndex+=2;
            secondIndex+=2;
        }
        return;
        
    }
}
