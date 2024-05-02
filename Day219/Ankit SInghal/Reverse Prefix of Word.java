class Solution {
        public static String reversePrefix(String word, char ch) {
        int left = 0;
        int right = word.indexOf(ch);
        if (right == -1) {
            return word;
        }
        char[] arr = word.toCharArray();
        
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        
        return new String(arr);
    }

}