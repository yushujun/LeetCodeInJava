public class Solution {
    public int missingNumber(int[] nums) {
        int sum1 = nums.length,sum2 = 0;
        for(int i = 0; i < nums.length; i++){
            sum1 += i;
            sum2 += nums[i];
        }
        return sum1 - sum2;
    }
}
time complexity:O(n)
space complexity:O(1)

public class Solution {
    public int missingNumber(int[] nums) {
        if(nums.length == 0) return 0;
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            res ^= nums[i];
            res ^= i;
        }
        return res ^ nums.length;
    }
}
time complexity:O(n)
space complexity:O(1)