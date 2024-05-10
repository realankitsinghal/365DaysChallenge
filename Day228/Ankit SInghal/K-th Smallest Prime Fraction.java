class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<double[]> pq = new PriorityQueue<>((a,b)-> Double.compare( b[0],a[0]));
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                pq.add(new double[]{(double)arr[i]/arr[j],(double)arr[i],(double)arr[j]});
                while(pq.size()>k){
                    pq.remove();
                }
            }
        }
        double value[]=pq.peek();
        int [] ans=new int [2];
        ans[0]=(int)value[1];
        ans[1]=(int)value[2];
        return ans;
    }
}