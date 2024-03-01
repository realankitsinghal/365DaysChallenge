class Solution {
    public String maximumOddBinaryNumber(String s) {
        StringBuilder a= new StringBuilder();

        int c=0;
        for(int i=0;i<s.length();i++){
            if (s.charAt(i) == '1') {
                c++;
            }
        }

        if(c<=0) return "";

        for(int i=1;i<c;i++) a.append("1");

        for(int i=c;i<s.length();i++) a.append("0");

        a.append("1");

        return a.toString();
    }
}