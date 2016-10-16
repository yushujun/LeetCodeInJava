recursion search:
public static int search(int step,int[] nums){
  if(step < 0) return 0;
  return Math.max(nums[step]+search(step-2,nums),search(step-1,nums));
}

public static int rob(int[] nums) {
  return search(nums.length-1,nums);
}

time complexity:O(2^n)

dp:
public class Solution {
  public static int rob(int[] nums) {
    if(nums == null) return 0;
    int pre1 = 0,pre2 = 0;
    for(int i = 0; i < nums.length; i++){
        int cur = Math.max(pre2,pre1+nums[i]);
        pre1 = pre2;
        pre2 = cur;
    }
    return pre2;
  }
}

time complexity:O(n)
space complexity:O(1)