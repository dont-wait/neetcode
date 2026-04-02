class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i = 0; i < prices.length; i++) {
            int buy = prices[i];
            for(int j = i + 1; j < prices.length; j++) {
                int sell = prices[j];
                profit = max(profit, sell - buy);
            }
        }
        return profit;
    }
    private int max(int a, int b) {
        return a > b ? a : b;
    }
}
