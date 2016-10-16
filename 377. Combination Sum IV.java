TLE method:
public class Solution {
    public int combinationSum4(int[] nums, int target) {
        if(target == 0) return 1;
        else if(target < 0) return 0;
        int res = 0;
        for(int i = 0; i < nums.length; i++)
            res += combinationSum4(nums,target-nums[i]);
        return res;
    }
}
如果本题可以为负数的话，用递归也可以解决，dp则不行了

dp:
public class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target+1];
        dp[0] = 1;
        for(int i = 1; i < dp.length; i++)
            for(int num : nums)
                if(i - num >= 0)
                    dp[i] += dp[i-num];
        return dp[target];
    }
}
time compleixty:O(n^2)
space compleixty:O(n)
