class Solution {
    public static int maxProfit(int n, int[] price) {
        if (n <= 1) {
            return 0;
        }
        
        int[] leftProfit = new int[n];
        int[] rightProfit = new int[n];
        int minPrice = price[0];
        for (int i = 1; i < n; i++) {
            minPrice = Math.min(minPrice, price[i]);
            leftProfit[i] = Math.max(leftProfit[i - 1], price[i] - minPrice);
        }
        
        int maxPrice = price[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            maxPrice = Math.max(maxPrice, price[i]);
            rightProfit[i] = Math.max(rightProfit[i + 1], maxPrice - price[i]);
        }
        
        int maxProfit = 0;
        for (int i = 0; i < n; i++) {
            maxProfit = Math.max(maxProfit, leftProfit[i] + rightProfit[i]);
        }
        
        return maxProfit;
    }
}