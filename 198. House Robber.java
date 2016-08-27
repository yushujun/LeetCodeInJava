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
public static int rob(int[] nums) {
  if(nums.length == 0) return 0;
  if(nums.length == 1) return nums[0];
  int pre1 = nums[0],pre2 = Math.max(nums[0],nums[1]);
  int cur = pre2;
  for(int i = 2; i< nums.length; i++){
      cur = Math.max(nums[i] + pre1,pre2);
      pre1 = pre2;
      pre2 = cur;
  }
  return cur;
}

time complexity:O(n)
space complexity:O(1)