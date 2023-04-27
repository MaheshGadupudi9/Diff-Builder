package co.us.interview;

public class BuySellStockAtBest {
    public static void main(String[] args) {
        int[] stockPrices = {7, 1, 5, 3, 6, 4, 11, 6, 4, 2, 32};
        int[] stockPrices2 = {7, 1, 5, 3, 6, 4};
        int[] stockPrices3 = {7, 6, 4, 3, 1};
        System.out.println("maxProfit(stockPrices) = " + maxProfit(stockPrices));
        System.out.println("maxProfit(stockPrices2) = " + maxProfit(stockPrices2));
        System.out.println("maxProfit(stockPrices3) = " + maxProfit(stockPrices3));
    }

    public static int maxProfit(int[] prices) {
        int current = prices[0];
        int buy = current, sell = 0;
        int buyPos = 0;
        int next;

        for (int i = 0; i < prices.length; i++) {
            next = prices[i];
            if (buy > next) {
                buyPos = i;
                buy = next;
            }
            if ((next - buy) >= (sell - buy) && buyPos < i) {
                sell = next;
            }
            current = next;
        }
        System.out.println("buy = " + buy);
        System.out.println("sell = " + sell);
        return Math.max(sell - buy, 0);
    }

}

/*
 *  {7, 1, 5, 3, 6, 4};
 *  buy = 7;sell =0
 *  current = 1, prev = 7
 *  buy > current { buy = current }
 * current - buy > sell  ; sell = current - buy;
 *
 * */