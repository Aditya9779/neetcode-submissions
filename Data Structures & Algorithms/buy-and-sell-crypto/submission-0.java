class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null) return 0;
        int profit=0,buyDate=prices[0];
        for(int i=1;i<prices.length;i++){
            if(buyDate>prices[i]){
                buyDate=prices[i];
            }
            profit=Math.max(profit,prices[i]-buyDate);
        }
        return profit;
    }
}
