int maxProfit(int* prices, int pricesSize) {
    int buy, sell, diff = 0, i;
    if(pricesSize > 0){
        buy = prices[0];
        while (i < pricesSize){
            if(prices[i] > buy){
                sell = prices[i];
                diff = diff > sell - buy? diff: sell - buy;
            }
            else
                buy = prices[i];
            i++;
        }
    }
    return diff;
}