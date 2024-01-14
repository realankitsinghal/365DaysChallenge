class Solution{
    public static ArrayList<Integer> repeatedRows(int matrix[][], int m, int n){
        //code here
        ArrayList<Integer> ans = new ArrayList<>();
        int i,j;
        HashMap<String,Integer> map = new HashMap<>();
        for(i=0;i<m;i++){
            StringBuilder sb = new StringBuilder(); 
            for(j=0;j<n;j++){
                sb.append(matrix[i][j]);
            }
            String a = sb.toString();
            if(!map.containsKey(a)){
                map.put(a,1);
            }
            else{
                ans.add(i);
            }
        }
        return ans;
    }
}