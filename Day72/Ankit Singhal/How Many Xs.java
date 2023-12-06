class Solution {
    int countX(int L, int R, int X) {
        // code here
        int ans=0;
        for(int i=L+1; i<R; i++){
            int j = i;
            while(j>0){
                int d = j%10;
                j/=10;
                if(d==X) ans++;
            }
        }
        return ans;
    }
}