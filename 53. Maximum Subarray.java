public class Solution {
    public int maxSubArray(int[] nums) {
        int ans = 1<<31,sum = 0;
        for(int i : nums){
            sum = Math.max(sum+i,i);
            ans = Math.max(ans,sum);
        }
        return ans;
    }
}
time complexity:O(n)
space complexity:O(1)

dp:
public class Solution {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = dp[0];
        for(int i = 1;i < nums.length;i++){
            dp[i] = Math.max(dp[i-1]+nums[i],nums[i]);
            max = Math.max(dp[i],max);
        }
        return max;
    }
}
time complexity:O(n)
space complexity:O(n)