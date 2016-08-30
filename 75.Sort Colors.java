public class Solution {
    public void sortColors(int[] nums) {
        int left = 0,right = nums.length-1;
        for(int mid = left;mid <= right; mid++){
            if(nums[mid] == 0 && left < mid) swap(nums,left++,mid--);
            if(nums[mid] == 2 && mid < right) swap(nums,right--,mid--);
        }
    }
    public void swap(int[] nums,int i,int j){
        if(i == j) return ;
        nums[i] ^= nums[j];
        nums[j] ^= nums[i];
        nums[i] ^= nums[j];
    }
}
time complexity:O(n)
space complexity:O(1)

复杂版本：
public class Solution {
    public void sortColors(int[] nums) {
        int i = 0,j = nums.length-1;
        while(i < j){
         while(i<j && nums[i] == 0) ++i;
         while(i<j &&nums[j] == 2) --j;
         if(i < j){
             int k = i;
             while(k <= j && nums[k] == 1) ++k;
             if(k <= j){
                 if(nums[k] == 0){
                     swap(nums,k,i++);
                 } else if(nums[k] == 2){
                     swap(nums,k,j--);
                 }
             }
             if(k > j) break;
         }
        }
    }
    public void swap(int[] nums,int i,int j){
        nums[i] ^= nums[j];
        nums[j] ^= nums[i];
        nums[i] ^= nums[j];
    }
}
time complexity:O(n)
space complexity:O(1)