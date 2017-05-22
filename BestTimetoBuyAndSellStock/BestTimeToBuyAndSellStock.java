public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int diff = 0;
        int buy= prices.length > 0? prices[0]:0;
        int sell;
        for(int i = 1; i < prices.length; i ++){
            if(prices[i] > buy){
                sell = prices[i];
                diff = sell - buy > diff ? sell - buy : diff;
            }
            else{
                buy =  prices[i];
            }
        }
        return diff;
    }
}