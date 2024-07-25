class Solution {
    public int maxProfit(int[] prices) {

        if (prices.length <= 1) {
            return 0;
        }

        int lowestPrice = prices[0];
        int maxProfit = 0;

        for(int i = 1; i < prices.length ; i++){
            if(lowestPrice > prices[i]){
                lowestPrice = prices[i];
            } else {
                int temp = prices[i] - lowestPrice;
                if(maxProfit < temp )
                maxProfit = temp;
            }
        }


        return maxProfit;
    }
}