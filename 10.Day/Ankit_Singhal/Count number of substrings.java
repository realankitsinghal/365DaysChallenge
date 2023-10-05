
class Solution
{
    long substrCount(String s, int k) {
        return atMostKDistinct(s, k) - atMostKDistinct(s, k-1);
    }
    
    long atMostKDistinct(String s, int k){
        if(k < 0) return 0;
        
        int i=0, j=0, cnt = 0;
        long ans = 0;
        int[] m = new int[26];
        
        while(j < s.length()){
            m[s.charAt(j) - 'a']++;
            if(m[s.charAt(j) - 'a'] == 1) cnt++;
            
            while(cnt > k){
                m[s.charAt(i) - 'a']--;
                if(m[s.charAt(i) - 'a'] == 0) cnt--;
                
                i++;
            }
            ans += (j-i+1);
            j++;
            }
        return ans;
    }
}