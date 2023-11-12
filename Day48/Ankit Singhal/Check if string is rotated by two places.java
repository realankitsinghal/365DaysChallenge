class Solution {
    public boolean isRotated(String str1, String str2) {
        // Your code here
        String str1left = str1;
        String str1right = str1;

        str1left = rotateLeft(str1left, 2);
        str1right = rotateRight(str1right, 2);

        return str2.equals(str1left) || str2.equals(str1right);
    }

    private String rotateLeft(String input, int places) {
        return input.substring(places) + input.substring(0, places);
    }

    private String rotateRight(String input, int places) {
        int length = input.length();
        return input.substring(length - places) + input.substring(0, length - places);
    }
}