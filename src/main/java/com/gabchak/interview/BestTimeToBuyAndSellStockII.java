package com.gabchak.interview;

/**
 * You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
 * <p>
 * On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.
 * <p>
 * Find and return the maximum profit you can achieve.
 * <p>
 * Example 1:
 * <p>
 * Input: prices = [7,1,5,3,6,4]
 * Output: 7
 * Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
 * Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
 * Total profit is 4 + 3 = 7.
 */
public class BestTimeToBuyAndSellStockII {

    public int maxProfit(int[] prices) {
        if (prices.length < 2) {
            //not enough elements in 'prices' array to make any profit
            return 0;
        }
        int profit = 0;
        int buyPrice = -1;
        for (int i = 0; i < prices.length - 1; i++) {
            int currentPrice = prices[i];
            int nextDayIndex = i + 1;
            int nextDayPrice = prices[nextDayIndex];
            if (buyPrice == -1) {
                if (currentPrice < nextDayPrice) {
                    buyPrice = currentPrice;
                }
            } else if (currentPrice > nextDayPrice) {
                profit += currentPrice - buyPrice;
                buyPrice = -1;
            }
            if (buyPrice != -1 && nextDayIndex == prices.length - 1 && buyPrice < nextDayPrice) {
                profit += nextDayPrice - buyPrice;
            }
        }
        return profit;
    }
}
