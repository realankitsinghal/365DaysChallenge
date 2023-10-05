class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String s) {
    Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
 
        int ans = 0;
        // Iterate through the string character-wise
        for (int i = 0; i < s.length(); i++) {
            // If the current character is smaller than the next character, subtract its value from the answer
            if (i < s.length() - 1 && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                ans -= map.get(s.charAt(i));
            }
            // Else, add its value to the answer
            else {
                ans += map.get(s.charAt(i));
            }
        }
        return ans;
    }
    
}