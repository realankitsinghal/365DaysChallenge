class Solution {
    public static ArrayList<ArrayList<Integer>> sumZeroMatrix(int[][] a) {
        int n=a.length,m=a[0].length;
        int [][]prefixMat=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(j==0) prefixMat[i][0]=a[i][0];
                else prefixMat[i][j]=prefixMat[i][j-1]+a[i][j];
            }
        }
        int maxArea=0,length=0,breadth=0,row_rect=0,col_rect=0;
        for(int partition=0;partition<n;partition++){
            for(int col=partition; col<m; col++){
                HashMap<Integer,Integer> map=new HashMap<>();
                map.put(0,-1);
                int sum=0;
                for(int row=0; row<n; row++){
                    sum += prefixMat[row][col] - (partition>0?prefixMat[row][partition-1]:0);
                    if(map.containsKey(sum)){
                        int tempRow=map.get(sum);
                        int len=row-tempRow,bre=col-partition+1;
                        if(len*bre>maxArea){
                            maxArea=len*bre;
                            length=len;
                            breadth=bre;
                            row_rect=row;
                            col_rect=col;
                        }
                    }
                    else map.put(sum,row);
                }
            }
        }
        
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        if(maxArea==0) return list;
        for(int start=row_rect-length+1;start<=row_rect;start++){
            ArrayList<Integer> tempList=new ArrayList<>();
            for(int col=col_rect-breadth+1;col<=col_rect;col++){
                tempList.add(a[start][col]);
            }
            list.add(tempList);
        }
        return list;
    }
}