public class Solution {
 public static int removeElement(int[] nums, int val) {
    if(nums == null || nums.length == 0) return 0;
    int end = nums.length-1;;
    for(int start = 0;start <= end;start++){
        if(nums[start] == val){
            while(end > start && nums[end] == val) end--;
            nums[start] = nums[end--];    
        }
    }
    return end+1;
  }
}
time complexity:O(n)
space complexity:O(1)