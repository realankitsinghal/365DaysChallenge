class Solution {
    public static int subStringCount(String str){
        int[]arr = new int[26];
        Arrays.fill(arr, -1);
        int count = 1;
        for(int i = 0; i<str.length(); i++){
            if(arr[str.charAt(i) - 'a'] == -1){
                arr[str.charAt(i) - 'a'] = count;
                count *= 2;
            }
            else if(arr[str.charAt(i) - 'a'] != -1 ){
                int temp = arr[str.charAt(i) - 'a'];
                arr[str.charAt(i) - 'a'] = count;
                count *= 2;
                count = count - temp;
            }
        }
        return count;
    }
    public static String betterString(String str1, String str2) {
        int sub1_count = subStringCount(str1);
        int sub2_count = subStringCount(str2);
        if(sub1_count < sub2_count) return str2;
        else return str1;
    }
}