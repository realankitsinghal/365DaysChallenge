class Solution {
    public String customSortString(String S, String T) {
        int [] arr = new int [26];
        for(char ch: T.toCharArray())   arr[ch-'a']++;
        StringBuilder sb = new StringBuilder();
        for(char ch: S.toCharArray()){
            while(arr[ch-'a']>0){
                sb.append(ch);
                arr[ch-'a']--;
            }
        }
        for(int i = 0; i<arr.length; i++){
            while(arr[i]>0){
                sb.append((char)(i+'a'));
                arr[i]--;
            }
        }
        return sb.toString();
    }
}