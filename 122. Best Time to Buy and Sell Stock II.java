dp:
public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;
        int n = prices.length;
        int[] dp = new int[n];
        for(int i = 1; i < n; i++)
            dp[i] = Math.max(dp[i-1],dp[i-1]+prices[i]-prices[i-1]);
        return dp[n-1];
    }
}
time complexity:O(n)
space complexity:O(n)

greedy:
public class Solution {
    public int maxProfit(int[] prices) {
        int profits = 0;
        for(int i = 0; i < prices.length-1; i++){
            if(prices[i+1] > prices[i])
                profits += prices[i+1] - prices[i];
        }
        return profits;
    }
}
time complexity:O(n)
space complexity:O(1)
