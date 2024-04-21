class Solution{
    public void threeWayPartition(int array[], int a, int b){
        int start =0, curr = 0, end = array.length-1;
        while(curr<=end){
            if(array[curr]<a){
                int temp = array[curr];
                array[curr]=array[start];
                array[start]=temp;
                curr++; start++;
            }
            else if(array[curr]>=a && array[curr]<=b)   curr++;
            else if(array[curr]>b){
                int temp = array[curr];
                array[curr]=array[end];
                array[end]=temp;
                end--;
            }
        }
    }
}