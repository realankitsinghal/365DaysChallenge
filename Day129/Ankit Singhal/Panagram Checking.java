class Solution
{
    //Function to check if a string is Pangram or not.
    public static boolean checkPangram  (String s) {
        // your code here
        ArrayList<Character> alphabets = new ArrayList<>();
        s = s.toLowerCase();
        for(int i=0; i<s.length(); i++){
            if((s.charAt(i)-'a' >=0 && s.charAt(i)-'a'<=25)&&(!alphabets.contains(s.charAt(i)))){
                alphabets.add(s.charAt(i));
            }
            if(alphabets.size()==26){
                return true;
            }
        }
        return false;
    }
}