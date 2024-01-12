class Solution {
    public boolean halvesAreAlike(String s) {
        Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        int i = 0, j = s.length() - 1, vc = 0;
        while(i <= j){
            if(set.contains(s.charAt(i++))) ++vc;
            if(set.contains(s.charAt(j--))) --vc;
        }
        if(vc == 0) return true;
        else    return false;
    }
}