// Last updated: 5/25/2026, 11:16:45 AM
class Solution {
    public int maxProfit(int[] prices)
    {
        int buy = prices[0];// 3
        int profit = 0;
        for (int i = 1; i < prices.length; i++)
        {
            if (prices[i] < buy)
            {
                buy = prices[i];
            }
            else if (prices[i] - buy > profit)
            {
                profit = prices[i] - buy;
            }
        }
        return profit;
    }
}