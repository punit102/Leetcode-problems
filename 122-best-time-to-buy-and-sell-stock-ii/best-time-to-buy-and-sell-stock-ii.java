class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            // System.out.println("Here Indes : "+ i);
            // System.out.println("Here i: "+ prices[i]);
            // System.out.println("Here (i-1): "+ prices[i-1]);
            // System.out.println("Profit : "+ maxProfit);
            // System.out.println("_______________________");
            if (prices[i] > prices[i-1]) {
                maxProfit = maxProfit + prices[i] - prices[i-1];
            }
        }
        return maxProfit;
    }
}