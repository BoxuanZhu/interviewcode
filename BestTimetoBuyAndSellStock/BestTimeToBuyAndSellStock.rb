# @param {Integer[]} prices
# @return {Integer}
def max_profit(prices)
    if prices.empty?
        return 0
    else
        buy = prices[0];
        diff = 0;
        prices.each{|x| 
            if x > buy 
                diff = (x - buy > diff) ? (x-buy) : diff
            else
                buy = x
            end   
        }
        return diff
    end
end