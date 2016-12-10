public class Solution {
    public int searchInsert(int[] nums, int target) {
        int pos = 0;
        for(int i = 0; i < nums.length; i++,pos++){
            if(target == nums[i]) return pos;
            else if(target < nums[i]) break;
        }
        return pos;
    }
}
time complexity:O(n)
space complexity:O(1)

public int searchInsert(int[] nums, int target) {
   int low = 0,high = nums.length-1;
   boolean isLeft = false;
   while(low <= high){
       int mid = low+((high-low)>>>1);
       if(nums[mid] == target) return mid;
       else if(nums[mid] > target) {
           isLeft = true;
           high = mid-1;
       } else {
           isLeft = false;
           low = mid+1;
       }
   }
   return isLeft ? high+1 : low;
  }
}
time complexity:O(logn)
space complexity:O(1)
