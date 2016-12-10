public class Solution {
    public int maxProfit(int[] prices) {
        int profit1 = 0,profit2 = 0;
        for(int i = 1; i < prices.length; i++){
            int temp = profit1;
            profit1 = Math.max(profit1+prices[i]-prices[i-1],profit2);
            profit2 = Math.max(temp,profit2);
        }
        return Math.max(profit1,profit2);
    }
}
time complexity:O(n)
space compleixty:(1)