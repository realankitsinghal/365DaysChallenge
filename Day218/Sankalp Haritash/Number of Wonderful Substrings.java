class Solution {
    public long wonderfulSubstrings(String s) {
        int count[]= new int[1024];
        int m=0;
        count[0]=1;
        long r=0;

        for(char c:s.toCharArray()){
            m^=1<<(c-'a');
            r+=count[m];
            for(int i=0;i<10;i++){
                r+=count[m^(1<<i)];
            }
            count[m]++;

        }

        return r;
    }
}