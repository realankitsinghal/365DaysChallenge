class Solution
{
    static String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String colName(long num) {
        String res = "";
        while (num > 0) {
            int remainder = ((int)num - 1) % 26; 
            res = alpha.charAt(remainder) + res;  
            num = (num - 1) / 26;            
        }
        return res;
    }
}