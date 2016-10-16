public class Solution {
    public int integerBreak(int n) {
       if(n == 2) return 1;
       if(n == 3) return 2;
       int result = 1;
       while(n > 0){
           if(n % 3 == 0 || (n % 2 != 0 && n % 3 != 0)){
               result *= 3;
               n -= 3;
           }else if(n % 2 == 0) {
               result *= 2;
               n -= 2;
           }
       }
       return result;
    }  
}
time complexity:O(n)
space complexity:O(1)


dp:
public class Solution {
    public int integerBreak(int n) {
       int[] dp = new int[n+1];
       dp[1] = 1;
       for(int i = 2; i <= n; i++)
           for(int j = 1; j < i; j++)
               dp[i] = Math.max(dp[i],(Math.max(j,dp[j])*Math.max(i-j,dp[i-j])));
        return dp[n];
    } 
}
time complexity:O(n)
space complexity:O(n)