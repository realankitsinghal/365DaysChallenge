class Solution
{
    //Function to return list of integers visited in snake pattern in matrix.
    static ArrayList<Integer> snakePattern(int matrix[][])
    {
        // code here 
        int n = matrix.length;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(i%2==0){
                for(int j=0; j<n; j++){
                    ans.add(matrix[i][j]);
                }
            }else{
                for(int k=n-1; k>=0; k--){
                    ans.add(matrix[i][k]);
                }
            }
        }
        return ans;
    }
}