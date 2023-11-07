class Solution
{
    static ArrayList<Integer> sumTriangles(int matrix[][], int n)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        //upper triangle sum
        int uts = 0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                uts+=matrix[i][j];
            }
        }
        //lower triangle sum
        int lts = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                lts+=matrix[i][j];
            }
        }
        
        list.add(uts);
        list.add(lts);
        return list;
    }
}