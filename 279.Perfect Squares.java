dp:
public class Solution {
    public int numSquares(int n) {
        if(n <= 0) return 0;
        int[] dp = new int[n+1];
        for(int i = 0;i < dp.length;i++)
            dp[i] = (1<<31)-1;
        dp[0] = 0;
        for(int i = 1;i < dp.length;i++)
            for(int j = 1;j*j <= i;j++)
                dp[i] = Math.min(dp[i],dp[i-j*j]+1);
        return dp[n];
    }
}
time space:O(n)
space space:O(n)