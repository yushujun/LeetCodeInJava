public class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length == 0 || nums.length == 1){
            System.out.println(Arrays.toString(nums));
            return ;
        }
        int i,j;
        for(i = nums.length-2; i >= 0; i--)
            if(nums[i] < nums[i+1]) break;
            else if(i == 0) {
                Arrays.sort(nums);
                System.out.println(Arrays.toString(nums));
                return ;
            }
        for(j = nums.length-1; j > i; j--)
            if(nums[j] > nums[i])
                break;
        swap(nums,i,j);
        reverse(nums,i+1,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
    public void reverse(int[] nums,int start,int end){
        while(start < end){
            swap(nums,start,end);
            start++;end--;
        }
    }
    public static void swap(int[] nums,int i,int j){
        if(i != j){
            nums[i] ^= nums[j];
            nums[j] ^= nums[i];
            nums[i] ^= nums[j];
        }
    }
}
time complexity:O(n)
space complexity:O(1)