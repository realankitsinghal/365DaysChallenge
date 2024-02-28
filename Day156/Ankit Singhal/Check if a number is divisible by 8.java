class Solution{
    int DivisibleByEight(String s){
        //code here
        int a = 0;
        int n = s.length();
        int cnt = 3;
        int i = 0;
        if((n-cnt)>0){
            while(cnt > 0){
                a = a*10 + (s.charAt(n-cnt) - '0');
                cnt--;
            }
        }else{
            while(i<n){
                a = a*10 + (s.charAt(i) - '0');
                i++;
            }
        }
        if(a%8 == 0){
            return 1;
        }else{
            return -1;
        }
    }
}