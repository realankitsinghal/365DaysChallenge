class Solution {
    public int buyChoco(int[] prices, int money) {
        int min = 101, secondMin = 101;
        for (int p : prices) {
            if (p <= min) {
                secondMin = min;
                min = p;
            } else if (p < secondMin) {
                secondMin = p;
            }
        }
        return money - min - secondMin < 0 ? money : money - min - secondMin;
    }
}