class Solution{
    public void swapElements(int[] arr, int n){
        if(n>2){
        int count=0;
        while(count!=(n-2)){
          int temp=arr[count];
          arr[count]=arr[count+2];
          arr[count+2]=temp;
          count++;
        }
    }
    }
}