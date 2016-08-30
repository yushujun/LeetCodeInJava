Divide and Conquer:
public class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        return Math.max(rob(nums,0,nums.length-2),rob(nums,1,nums.length-1));
    }
    public int rob(int[] nums,int begin,int end){
        int pre1 = 0,pre2 = 0;
        for(int i = begin;i <= end;i++){
            int max = Math.max(pre1+nums[i],pre2);
            pre1 = pre2;
            pre2 = max;
        }
        return Math.max(pre1,pre2);
    }
}
time complexity:O(n)
space complexity:O(1)