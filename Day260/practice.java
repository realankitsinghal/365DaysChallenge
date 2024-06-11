class Solution {
    public int[] relativeSortArray(int[] A1, int[] A2) {
        int count=0;
        int arr[]=new int[A1.length];
        for(int i=0;i<A2.length;i++)
        {
            for(int j=0;j<A1.length;j++)
            {
                if(A2[i]==A1[j])
                {
                    arr[count]=A1[j];
                    A1[j]=-1;
                    count++;
                }
            }
        }
        Arrays.sort(A1);

        for(int i=0;i<A1.length;i++)
        {
            if(A1[i]!=-1)
            {
                arr[count]=A1[i];
                count++;
            }
        }
        return arr;
    }
}