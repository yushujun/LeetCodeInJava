public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ansList = new ArrayList<>();
        if(nums.length == 0) return ansList;
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        for(int n : nums) 
            list.add(n);
        ansList.add(list);
        if(nums.length == 1) return ansList;
        while(true){
            int i,j;
            for(i = nums.length-2; i >= 0; i--)
                if(nums[i] < nums[i+1]) break;
                else if(i == 0) return ansList;
            for(j = nums.length-1; j > i; j--)
                if(nums[j] > nums[i]) break;
            swap(nums,i,j);
            reverse(nums,i+1,nums.length-1);
            list = new ArrayList<>();
            for(int n : nums)
                list.add(n);
            ansList.add(list);
        }
    }
    public void reverse(int[] nums,int start,int end){
        while(start < end){
            swap(nums,start,end);
            start++;end--;
        }
    }
    public void swap(int[] nums,int i,int j){
        if(i != j){
            nums[i] ^= nums[j];
            nums[j] ^= nums[i];
            nums[i] ^= nums[j];
        }
    }
}
time compleixty:O(n!)
space compleixty:O(1)