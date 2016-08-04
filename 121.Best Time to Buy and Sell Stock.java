public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;
        int min = prices[0],diff = 0;
        for(int i = 0;i < prices.length;i++){
            if(min > prices[i])
                min = prices[i];
            else if(prices[i]-min > diff)
                diff = prices[i]-min;
        }
        return diff;
    }
}
time complexity:O(n)
space complexity:O(1)