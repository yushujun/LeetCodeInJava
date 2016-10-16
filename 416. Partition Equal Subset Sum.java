public class Solution {
    public boolean canPartition(int[] nums) {
        if(nums.length == 0) return true;
        Arrays.sort(nums);
        int sum = 0;
        for(int n : nums)
            sum += n;
        if(sum % 2 != 0) return false;
        int goal = sum>>>1;
        return dfs(nums,nums.length-1,goal);
    }
    public boolean dfs(int[] nums,int step,int sum){
        if(sum < 0) return false;
        if(sum == 0) return true;
        for(int i = step; i >= 0; i--)
            if(dfs(nums,i-1,sum-nums[i]))
                return true;
        return false;
    }
}
time complexity:O(nlogn)
space complexity:O(1)

dp:
public class Solution {
    public boolean canPartition(int[] nums) {
        if(nums.length == 0) return true;
        int sum = 0;
        for(int n : nums) 
            sum += n;
        if(sum % 2 == 1) return false;
        sum >>>= 1;
        boolean[][] dp = new boolean[sum+1][nums.length+1];
        for(int i = 0; i <= nums.length; i++)
            dp[0][i] = true;
        for(int i = 1; i <= sum; i++){
            for(int j = 1; j <= nums.length; j++){
                dp[i][j] = dp[i][j-1];
                if(i - nums[j-1] >= 0)
                    dp[i][j] = dp[i][j] || dp[i-nums[j-1]][j-1];
            }
        }
        return dp[sum][nums.length];
    }
}
time complexity:O(n^2)
space complexity:O(n^2)